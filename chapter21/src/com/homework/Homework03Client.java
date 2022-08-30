package com.homework;

import com.socket.StreamUtils;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 * 1. 编写客户端程序和服务端程序
 * 2. 客户端可以输入一个 图片 文件名, 比如 ximi, 服务端 收到图片名后,可以给客户端返回这个音乐文件,
 *    如果服务端没有这个文件, 返回一个默认的图片即可
 * 3. 客户端收到文件后,保存到src/img
 * 4. 提示: 该程序可以使用StreamUtil.java
 */
@SuppressWarnings({"all"})
public class Homework03Client {
    public static void main(String[] args) throws Exception {
        //图片保存目录
        String imgDir = "/Users/zhouxufeng/program/ClassHspJava/chapter21/src/com/homework/img";

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入图片名: ");
        String name = scanner.nextLine();

        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 8888);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(name);
        bw.newLine();
        bw.flush();

        StreamUtils streamUtils = new StreamUtils();
        byte[] imgData = streamUtils.streamToByteArray(socket.getInputStream());

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(imgDir + "/" + name));
        bos.write(imgData);

        bos.close();
        bw.close();
        socket.close();
        System.out.println("客户端结束");
    }
}
