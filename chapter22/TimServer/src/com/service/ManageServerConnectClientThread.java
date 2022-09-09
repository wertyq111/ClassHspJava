package com.service;

import com.common.Message;

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
public class ManageServerConnectClientThread {
    //我们把多个线程放入一个HashMap集合， key就是userId，value就是线程
    private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();
    //离线消息集合
    private static ConcurrentHashMap<String, ArrayList<Message>> offlineMessages = new ConcurrentHashMap<>();

    /**
     * 获取线程管理集合
     * @return HashMap
     */
    public static HashMap<String, ServerConnectClientThread> getHm() {
        return hm;
    }

    /**
     * 添加对应userId的服务器链接客户端线程
     * @param userId
     * @param serverConnectClientThread
     */
    public static void addServerConnectClientThread(String userId, ServerConnectClientThread serverConnectClientThread) {
        hm.put(userId, serverConnectClientThread);
    }

    /**
     * 添加对应userId的离线消息集合
     * @param userId
     * @param messages
     */
    public static void addOfflineMessages(String userId, ArrayList<Message> messages) {
        offlineMessages.put(userId, messages);
    }

    /**
     * 删除对应userId的服务器链接客户端线程
     * @param userId
     */
    public static void removeServerConnectClientThread(String userId) {
        hm.remove(userId);
    }

    /**
     * 删除对应userId的离线消息集合
     * @param userId
     */
    public static void removeOfflineMessages(String userId) {
        offlineMessages.remove(userId);
    }

    /**
     * 通过userId获取对应的线程
     * @param userId
     * @return ServerConnectClientThread
     */
    public static ServerConnectClientThread getServerConnectClientThread(String userId) {
        return hm.get(userId);
    }

    /**
     * 根据userId获得对应的离线消息数组
     * @param userId
     * @return ArrayList<Message>|null
     */
    public static ArrayList<Message> getOfflineMessages(String userId) {
        if(offlineMessages.get(userId) != null) {
            return offlineMessages.get(userId);
        } else {
            return null;
        }
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

    public static String getTime() {
        LocalDateTime ldt = LocalDateTime.now();
        //DateTimeFormatter 是一个格式化器，用来格式化日期时间
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        dtf.format(ldt);
        return dtf.format(ldt);
    }
}
