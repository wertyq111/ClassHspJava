package com.service;

import com.common.Message;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SendOfflineMessage extends Thread{
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public void run() {
        //发送userId的离线消息
        try {
            if(ManageServerConnectClientThread.getOfflineMessages(userId) != null) {
                ArrayList<Message> messages = ManageServerConnectClientThread.getOfflineMessages(userId);
                for(Message offlineMessage:messages) {
                    Socket socket = ManageServerConnectClientThread.getServerConnectClientThread(userId).getSocket();
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(offlineMessage);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
