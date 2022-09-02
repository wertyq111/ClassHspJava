package com.service;

import java.util.HashMap;
import java.util.Vector;

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

    /**
     * 获取在线用户列表
     * @return
     */
    public static Vector<String> getOnlineFriendList() {
        Vector<String> list = new Vector<>();
        for(String userId:hm.keySet()) {
            list.add(userId);
        }

        return list;
    }
}
