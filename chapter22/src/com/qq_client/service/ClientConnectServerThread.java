package com.qq_client.service;

import com.qq_client.common.Message;

import java.io.IOException;
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
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();//如果服务器没有发送Message对象，线程会阻塞在这里
                System.out.println(message.getContent());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
