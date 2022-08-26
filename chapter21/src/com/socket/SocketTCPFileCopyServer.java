package com.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zhouxufeng
 * @version 1.0
 *  1. 编写一个服务端和一个客户端
 *  2. 服务端在 8888 端口监听
 *  3. 客户端链接到服务端， 发送一张图片
 *  4. 服务端接收到 客户端发送的图片， 奥村到src/img下，发送"收到图片"再退出
 *  5. 客户端接收到服务端发送的"收到图片"再退出
 *  6，该程序要求使用 StreamUtils.java
 */
@SuppressWarnings({"all"})
public class SocketTCPFileCopyServer {
    public static void main(String[] args) throws Exception {
        String destImagePath = "/Users/zhouxufeng/program/ClassHspJava/chapter21/src/img/ximi.png";

        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("图片上传服务端在 8888 端口监听，等待连接..");

        Socket socket = serverSocket.accept();

        StreamUtils streamUtils = new StreamUtils();
        byte[] fileBytes = streamUtils.streamToByteArray(socket.getInputStream());

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destImagePath));
        bos.write(fileBytes);
        bos.close();
        System.out.println("图片上传完毕..");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("图片接收完成");
        bw.newLine();
        bw.flush();

        bw.close();
        socket.close();
        serverSocket.close();
    }
}
