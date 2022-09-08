package com.service;

import com.common.Message;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Vector;

import com.common.MessageType;


/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ClientConnectServerThread extends Thread {
    //该线程需要持有Socket
    private Socket socket;

    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //因为Thread需要在后台和服务器通信，因此我们whil循环
        while(true) {
            try {
                System.out.println("正在和服务端保持通信，读取数据...");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();//如果服务器没有发送Message对象，线程会阻塞在这里

                switch(message.getMesType()) {
                    case MessageType.MESSAGE_RETURN_ONLINE_FRIEND:
                        System.out.println("\n======获取在线用户列表======");
                        //读取到输入流内容处理
                        Vector<String> list = (Vector<String>) message.getContent();
                        ManageClientConnectServerThread.onlineFriendList(list);
                        break;
                    case MessageType.MESSAGE_COMM_MES:
                        System.out.println("\n" + message.getSendTime() + " " + message.getSender() + "对你说: " + message.getContent());
                        break;
                    case MessageType.MESSAGE_FILE_MES:
                        FileClientService fileClientService = new FileClientService();
                        fileClientService.receviceFile(message.getRecevicer(), (String)message.getContent(), message.getFileBytes());
                        System.out.println("\n" + message.getSendTime() + " " + message.getSender() + "给你发送了文件 " + message.getContent());
                        break;
                    case MessageType.MESSAGE_ALL_MES:
                        System.out.println("\n" + message.getSendTime() + " " + message.getSender() + "对大家说: " + message.getContent());
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
