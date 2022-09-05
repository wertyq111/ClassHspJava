package com.view;

import com.common.User;
import com.service.MessageClientService;
import com.service.UserClientService;
import com.tools.Utility;

/**
 * @author zhouxufeng
 * @version 1.0
 * 客户端菜单界面
 */
@SuppressWarnings({"all"})
public class Menu {
    private boolean loop = true; //控制是否显示菜单
    private String key = ""; //接收用户的键盘输入
    private UserClientService userClientService = new UserClientService();//对象是用于登录服务/注册用户
    private MessageClientService messageClientService = new MessageClientService();//对象是用户消息互通

    public void mainMenu() {
        try {
            while (loop) {
                System.out.println("==========欢迎登录网络通信系统==========");
                System.out.println("\t\t 1 登录系统");
                System.out.println("\t\t 9 退出系统");
                System.out.print("请输入你的选择: ");
                key = Utility.readString(1);

                //根据用户的输入来处理不同的逻辑
                switch (key) {
                    case "1":
                        Login loginModel = new Login();
                        User user = loginModel.login(loop, userClientService);
                        if (user != null) {
                            while (loop) {
                                System.out.println("==========网络通信系统二级目录(" + user.getUserId() + ")==========");
                                System.out.println("\t\t 1 显示在线用户列表");
                                System.out.println("\t\t 2 群发消息");
                                System.out.println("\t\t 3 私聊消息");
                                System.out.println("\t\t 4 发送文件");
                                System.out.println("\t\t 5 退出系统");
                                System.out.print("请输入你的选择: ");
                                key = Utility.readString(1);
                                switch (key) {
                                    case "1":
                                        userClientService.getOnlineFriendList();
                                        break;
                                    case "2":
                                        System.out.println("请输入发送内容: ");
                                        String allContent = Utility.readString(100);
                                        messageClientService.sendMessageToAll(allContent, user.getUserId());
                                        break;
                                    case "3":
                                        System.out.println("请输入发送对象: ");
                                        String recevicer = Utility.readString(50);
                                        System.out.println("请输入发送内容: ");
                                        String content = Utility.readString(100);
                                        messageClientService.sendMessageToOne(content, user.getUserId(), recevicer);
                                        break;
                                    case "4":
                                        break;
                                    case "5":
                                        userClientService.logout();
                                        loop=false;
                                        break;
                                }
                            }
                        } else {
                            System.out.println("======登录失败======");
                        }
                        break;
                    case "9":
                        System.out.println("退出系统");
                        loop = false;
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
