package com.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zhouxufeng
 * @version 1.0
 * 1. 使用字符流的方式编写一个客户端程序和服务端程序
 * 2. 客户端发送 "name"，服务端接收到后返回 "我是nova"， nova是你自己的名字
 * 3. 客户端发送 "hobby"， 服务端接收到后返回"编写java程序"
 * 4. 不是这两个问题，回复"你说啥呢"
 */
@SuppressWarnings({"all"})
public class Homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在 9999 端口监听，等待连接..");
        Socket socket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String s = br.readLine();
        String receive = "";

        switch(s) {
            case "name":
                receive = "我是nova";
                break;
            case "hobby":
                receive = "编写java程序";
                break;
            default:
                receive = "你说啥呢";
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(receive);
        bw.newLine();

        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
    }
}
