package com.service;

import com.common.Message;

import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhouxufeng
 * @version 1.0
 * 管理客户端连接到服务器端的线程的类
 */
@SuppressWarnings({"all"})
public class ManageClientConnectServerThread {
    //我们把多个线程放入一个HashMap集合， key就是userId，value就是线程
    private static HashMap<String, ClientConnectServerThread> hm = new HashMap<>();

    public static void addClientConnectServerThread(String userId, ClientConnectServerThread clientConnectServerThread) {
        hm.put(userId, clientConnectServerThread);
    }

    //通过userId获取对应的线程
    public static ClientConnectServerThread getClientConnectServerThread(String userId) {
        return hm.get(userId);
    }

    public static Socket getSocket(String userId) {
        ClientConnectServerThread ccst = getClientConnectServerThread(userId);
        return ccst.getSocket();
    }

    public static String getTime() {
        LocalDateTime ldt = LocalDateTime.now();
        //DateTimeFormatter 是一个格式化器，用来格式化日期时间
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        dtf.format(ldt);
        return dtf.format(ldt);
    }

    /**
     * 显示在线用户列表
     * @param list
     */
    public static void onlineFriendList(Vector<String> list) {
        for(String name:list) {
            System.out.println("用户: " + name);
        }
    }
}
