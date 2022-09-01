package com.service;

import java.util.HashMap;

/**
 * @author zhouxufeng
 * @version 1.0
 * 管理客户端连接到服务器端的线程的类
 */
@SuppressWarnings({"all"})
public class ManageServerConnectClientThread {
    //我们把多个线程放入一个HashMap集合， key就是userId，value就是线程
    private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();

    public static void addServerConnectClientThread(String userId, ServerConnectClientThread serverConnectClientThread) {
        hm.put(userId, serverConnectClientThread);
    }

    //通过userId获取对应的线程
    public static ServerConnectClientThread getServerConnectClientThread(String userId) {
        return hm.get(userId);
    }
}
