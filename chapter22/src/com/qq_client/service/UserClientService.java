package com.qq_client.service;

import com.qq_client.common.Message;
import com.qq_client.common.MessageType;
import com.qq_client.common.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class UserClientService {
    private User user = null;
    private Socket socket = null;

    public UserClientService() throws IOException {
    }

    //根据userId 和 pwd 到服务器验证用户是否登录成功
    public User checkUser(String userId, String pwd) throws IOException, ClassNotFoundException {
        user = new User(userId, pwd);

        return user;

//        socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
//
//        //连接到服务器，发送user对象
//        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
//        oos.writeObject(user);
//
//        //读取从服务器端回复的Message对象
//        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
//        Message ms = (Message) ois.readObject();
//
//        if(ms.getMesType() == MessageType.MESSAGE_LOGIN_SUCCESSED) {
//            //创建一个和服务器端保持通信的线程->创建一个类 ClientConnectServerThread
//            ClientConnectServerThread ccst = new ClientConnectServerThread(socket);
//            Thread thread = new Thread(ccst);
//            thread.start();
//            //为了后续客户端的扩展，线程放到集合管理
//            ManageClientConnectServerThread.addClientConnectServerThread(userId, thread);
//
//            return user;
//        } else {
//            socket.close();
//        }
//
//        return null;
    }
}
