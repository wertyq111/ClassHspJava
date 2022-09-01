package com.service;

import com.common.Message;

import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ClientConnectServerThread implements Runnable {
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
                System.out.println(message.getContent());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
