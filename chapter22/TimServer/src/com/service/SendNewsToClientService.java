package com.service;

import com.common.Message;
import com.common.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SendNewsToClientService implements Runnable{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("请输入你想要推送的新闻内容：");
            String news = scanner.nextLine();
            Message message = new Message();
            message.setMesType(MessageType.MESSAGE_ALL_MES);
            message.setSender("服务器");
            message.setContent(news);
            message.setSendTime(new Date().toString());

            System.out.println("发送新闻：" + news);

            try {
                HashMap<String, ServerConnectClientThread> hm = ManageServerConnectClientThread.getHm();
                Iterator<String> iterator = hm.keySet().iterator();
                while (iterator.hasNext()) {
                    String onlineUserId =  iterator.next();
                    Socket socket = ManageServerConnectClientThread.getServerConnectClientThread(onlineUserId).getSocket();
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
