package com.service;

import com.common.Message;
import com.common.MessageType;
import com.common.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author zhouxufeng
 * @version 1.0
 * 这是服务器在端口 9999 监听，等待客户链接并保持通信
 */
@SuppressWarnings({"all"})
public class TimServer {
    private ServerSocket serverSocket = null;
    //创建一个集合，存放多个用户，如果是这些用户登录就认为是合法的
    private static HashMap<String, User> validUsers = new HashMap<>();

    static { //在静态代码块初始化 validUsers
        validUsers.put("100", new User("100", "123456"));
        validUsers.put("200", new User("200", "123456"));
        validUsers.put("300", new User("300", "123456"));
        validUsers.put("至尊宝", new User("至尊宝", "123456"));
        validUsers.put("紫霞仙子", new User("紫霞仙子", "123456"));
    }

    public TimServer(){
        try {
            System.out.println("服务端在9999端口监听...");
            serverSocket = new ServerSocket(9999);

            //开启新闻推送线程
            Thread thread = new Thread(new SendNewsToClientService());
            thread.start();

            while (true) { //当和某个客户端连接后继续监听,因此用while
                Socket socket = serverSocket.accept();
                //得到socket关联的对象输入流
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

                //得到socket关联的对象输出流
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                User user = (User) ois.readObject();

                //创建一个Message对象， 准备回复客户端
                Message message = new Message();
                if (checkUser(user.getUserId(), user.getPasswd())) {
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCESSED);
                    oos.writeObject(message);

                    //创建一个线程，和客户端保持通信，该线程需要持有socket对象
                    ServerConnectClientThread scct = new ServerConnectClientThread(socket, user.getUserId());
                    scct.start();
                    //把该线程对象放入到一个集合中进行管理
                    ManageServerConnectClientThread.addServerConnectClientThread(user.getUserId(), scct);

                    SendOfflineMessage sendOfflineMessage = new SendOfflineMessage();
                    sendOfflineMessage.setUserId(user.getUserId());
                    sendOfflineMessage.start();
                } else {
                    System.out.println("用户id = " + user.getUserId() + ", 密码 = " + user.getPasswd() + "登录失败");
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAILED);
                    oos.writeObject(message);
                    //关闭socket
                    socket.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 验证账号密码是否正确
     * @param userId
     * @param passwd
     * @return boolean
     */
    private boolean checkUser(String userId, String passwd) {
        User user = validUsers.get(userId);
        if(user == null) {
            return false;
        } else if(!user.getPasswd().equals(passwd)) {
            return false;
        }

        if(ManageServerConnectClientThread.getServerConnectClientThread(userId) != null) {
            return false;
        }

        return true;
    }
}
