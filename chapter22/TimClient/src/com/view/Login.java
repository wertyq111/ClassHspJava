package com.view;

import com.common.User;
import com.service.UserClientService;
import com.tools.Utility;

import java.io.IOException;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Login {
    public User login(boolean loop, UserClientService userClientService) throws IOException, ClassNotFoundException {
        System.out.print("请输入用户名: ");
        String userId = Utility.readString(50);
        System.out.print("请输入密  码: ");
        String pwd = Utility.readString(50);

        return userClientService.checkUser(userId, pwd);
//        if() {
//            while(loop) {
//                System.out.println("==========网络通信系统二级目录(" + userId + ")==========");
//                System.out.println("\t\t 1 显示在线用户列表");
//                System.out.println("\t\t 2 群发消息");
//                System.out.println("\t\t 3 私聊消息");
//                System.out.println("\t\t 4 发送文件");
//                System.out.println("\t\t 5 退出系统");
//            }
//        } else {
//            return false;
//        }
//
//        return false;
    }
}
