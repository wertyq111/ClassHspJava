package com.service;

import com.common.Message;
import com.common.MessageType;
import com.common.User;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class UserClientService {
    private User user = null;
    private Socket socket = null;

    //根据userId 和 pwd 到服务器验证用户是否登录成功
    public User checkUser(String userId, String pwd){

        try {
            user = new User(userId, pwd);

            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);

            //连接到服务器，发送user对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(user);

            //读取从服务器端回复的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message ms = (Message) ois.readObject();

            if(ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCESSED)) {
                //创建一个和服务器端保持通信的线程->创建一个类 ClientConnectServerThread
                ClientConnectServerThread ccst = new ClientConnectServerThread(socket);
                ccst.start();
                //为了后续客户端的扩展，线程放到集合管理
                ManageClientConnectServerThread.addClientConnectServerThread(userId, ccst);

                return user;
            } else {
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }

    /**
     * 获取在线用户列表
     * @return Vector
     */
    public void getOnlineFriendList() {
        Socket socket = ManageClientConnectServerThread.getSocket(user.getUserId());
        //socket连接，发送请求
        try {
            ObjectOutputStream oos = new ObjectOutputStream(this.socket.getOutputStream());
            Message message = new Message();
            message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
            message.setSender(user.getUserId());
            message.setSendTime(ManageClientConnectServerThread.getTime());
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logout() {
        Socket socket = ManageClientConnectServerThread.getSocket(user.getUserId());

        //socket链接，发送退出请求
        try {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            Message message = new Message();
            message.setMesType(MessageType.MESSAGE_CLIENT_LOGOUT);
            message.setSender(user.getUserId());
            message.setSendTime(ManageClientConnectServerThread.getTime());
            oos.writeObject(message);
            System.out.println(user.getUserId() + " 退出系统 ");
            System.exit(0);//结束进程
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
