package com.common;

/**
 * @author zhouxufeng
 * @version 1.0
 * 表示消息类型
 */
@SuppressWarnings({"all"})
public interface MessageType {
    //解读
    // 1. 在接口中定义了一些常量
    // 2. 不同的敞亮的值表示了不同的消息类型
    String MESSAGE_LOGIN_SUCCESSED = "1"; //表示登录成功
    String MESSAGE_LOGIN_FAILED = "2"; //表示登录失败
    String MESSAGE_COMM_MES = "3";//普通信息包
    String MESSAGE_GET_ONLINE_FRIEND = "4";//要求返回在线用户列表
    String MESSAGE_RETURN_ONLINE_FRIEND = "5";//返回在线用户列表
    String MESSAGE_CLIENT_LOGOUT = "6";//客户端请求退出
    String MESSAGE_ALL_MES = "7";//群发消息
    String MESSAGE_FILE_MES = "8";//发送文件
}
