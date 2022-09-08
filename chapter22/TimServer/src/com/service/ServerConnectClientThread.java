package com.service;

import com.common.Message;
import com.common.MessageType;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Vector;

/**
 * @author zhouxufeng
 * @version 1.0
 * 该类对应的对象和某个客户端保持通信
 */
@SuppressWarnings({"all"})
public class ServerConnectClientThread extends Thread {
    //该线程需要持有Socket
    private Socket socket;
    private String userId;
    private boolean loop = true;
    private ObjectOutputStream oos = null;

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //因为Thread需要在后台和服务器通信，因此我们while循环
        while (loop) {
            try {
                System.out.println("服务端和客户端 " + userId + " 保持通信，读取数据...");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();//如果服务器没有发送Message对象，线程会阻塞在这里

                switch (message.getMesType()) {
                    case MessageType.MESSAGE_GET_ONLINE_FRIEND:
                        System.out.println(message.getSendTime() + " 接收到来自 " + message.getSender() + " 获取在线用户列表请求");
                        Vector<String> list = ManageServerConnectClientThread.getOnlineFriendList();
                        Message onlineFriendList = new Message();
                        onlineFriendList.setMesType(MessageType.MESSAGE_RETURN_ONLINE_FRIEND);
                        onlineFriendList.setRecevicer(userId);
                        LocalDateTime ldt = LocalDateTime.now();
                        //DateTimeFormatter 是一个格式化器，用来格式化日期时间
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        dtf.format(ldt);
                        onlineFriendList.setSendTime(dtf.format(ldt));
                        onlineFriendList.setContent(list);

                        oos = new ObjectOutputStream(socket.getOutputStream());
                        oos.writeObject(onlineFriendList);
                        break;
                    case MessageType.MESSAGE_COMM_MES:
                    case MessageType.MESSAGE_FILE_MES:
                        System.out.println(message.getSendTime() + " 接收到来自 " + message.getSender() + " 发给 " + message.getRecevicer() + " 消息请求");
                        Socket receiveSocket = ManageServerConnectClientThread.getServerConnectClientThread(message.getRecevicer()).getSocket();
                        oos = new ObjectOutputStream(receiveSocket.getOutputStream());
                        oos.writeObject(message);
                        break;
                    case MessageType.MESSAGE_ALL_MES:
                        System.out.println(message.getSendTime() + " 接收到来自 " + message.getSender() + " 群发消息请求");
                        HashMap<String, ServerConnectClientThread> hm = ManageServerConnectClientThread.getHm();
                        for(String onlineUserId : hm.keySet()) {
                            if(!onlineUserId.equals(userId)) {
                                Socket socket = ManageServerConnectClientThread.getServerConnectClientThread(onlineUserId).getSocket();
                                oos = new ObjectOutputStream(socket.getOutputStream());
                                oos.writeObject(message);
                            }
                        }
                        break;
                    case MessageType.MESSAGE_CLIENT_LOGOUT:
                        System.out.println(message.getSendTime() + " 接收到来自 " + message.getSender() + " 接收到退出请求");
                        //关闭socket
                        socket.close();
                        //将这个客户端对应的线程从集合中移除
                        ManageServerConnectClientThread.removeServerConnectClientThread(userId);
                        //退出while循环
                        loop = false;
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
