package com.service;

import com.common.Message;

import java.io.ObjectInputStream;
import java.net.Socket;

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
                System.out.println("服务端和客户端" + userId + "保持通信，读取数据...");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();//如果服务器没有发送Message对象，线程会阻塞在这里
                System.out.println(message.getContent());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
