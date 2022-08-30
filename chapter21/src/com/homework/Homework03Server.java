package com.homework;

import com.socket.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

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
public class Homework03Server {
    public static void main(String[] args) throws Exception {
        //图片文件存放路径
        String imgDir = "/Users/zhouxufeng/program/ClassHspJava/chapter21/img";

        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端口 8888 等待连接...");

        Socket socket = serverSocket.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String name = br.readLine();

        File imgFile = new File(imgDir + "/" + name);
        if(!imgFile.exists()) {
            imgFile = new File(imgDir + "/defalut.jpg");
        }

        StreamUtils streamUtils = new StreamUtils();
        byte[] imgData = streamUtils.streamToByteArray(new BufferedInputStream(new FileInputStream(imgFile)));

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(imgData);
        socket.shutdownOutput();

        bos.close();
        br.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端结束..");
    }
}
