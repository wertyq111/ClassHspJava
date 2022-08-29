package com.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 * 1. 编写一个接收端A和一个发送端B，使用UDP协议完成
 * 2. 接收端在 8888 端口等待接收数据(receive)
 * 3. 发送端向接收端发送数据 "四大名著是哪些"
 * 4. 接收端接收到发送端发送的问题后，返回"四大名著是《红楼梦》，《西游记》，《三国演义》，《水浒传》", 否则返回"what？"
 * 5. 接收端和发送端程序退出
 */
@SuppressWarnings({"all"})
public class Homework02SenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(7777);

        System.out.println("请输入问题：");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        byte[] sendBytes = s.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendBytes, sendBytes.length, InetAddress.getByName("127.0.0.1"), 8888);
        socket.send(sendPacket);

        byte[] buf = new byte[64 * 1024];
        DatagramPacket recevicePacket = new DatagramPacket(buf, buf.length);

        socket.receive(recevicePacket);

        System.out.println(new String(recevicePacket.getData(), 0, recevicePacket.getLength()));

        socket.close();
        System.out.println("发送端端程序退出");
    }
}
