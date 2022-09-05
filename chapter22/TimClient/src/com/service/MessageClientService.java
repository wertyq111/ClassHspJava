package com.service;

import com.common.Message;
import com.common.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author zhouxufeng
 * @version 1.0
 * 提供消息相关的方法
 */
@SuppressWarnings({"all"})
public class MessageClientService {
    /**
     * 发送个人消息
     * @param content
     * @param senderId
     * @param receviceId
     */
    public void sendMessageToOne(String content, String senderId, String receviceId) {
        Socket socket = ManageClientConnectServerThread.getSocket(senderId);
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_COMM_MES);
        message.setSender(senderId);
        message.setRecevicer(receviceId);
        message.setContent(content);
        message.setSendTime(ManageClientConnectServerThread.getTime());

        System.out.println("我对 " + receviceId + " 说 " + content);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 发送群体消息
     * @param content
     * @param senderId
     * @param receviceId
     */
    public void sendMessageToAll(String content, String senderId) {
        Socket socket = ManageClientConnectServerThread.getSocket(senderId);
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_ALL_MES);
        message.setSender(senderId);
        message.setContent(content);
        message.setSendTime(ManageClientConnectServerThread.getTime());

        System.out.println("我对大家说 " + content);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
