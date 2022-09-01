package com.service;

import java.util.HashMap;

/**
 * @author zhouxufeng
 * @version 1.0
 * 管理客户端连接到服务器端的线程的类
 */
@SuppressWarnings({"all"})
public class ManageClientConnectServerThread {
    //我们把多个线程放入一个HashMap集合， key就是userId，value就是线程
    private static HashMap<String, Thread> hm = new HashMap<>();

    public static void addClientConnectServerThread(String userId, Thread thread) {
        hm.put(userId, thread);
    }

    //通过userId获取对应的线程
    public static Thread getClientConnectServerThread(String userId) {
        return hm.get(userId);
    }
}
