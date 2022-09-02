package com.service;

import java.util.HashMap;
import java.util.Vector;

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
