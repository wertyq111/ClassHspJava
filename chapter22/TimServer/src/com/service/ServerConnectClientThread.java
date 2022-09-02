package com.service;

import com.common.Message;
import com.common.MessageType;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        while(true) {
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

                        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                        oos.writeObject(onlineFriendList);
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
