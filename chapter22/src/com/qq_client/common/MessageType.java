package com.qq_client.common;

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
}
