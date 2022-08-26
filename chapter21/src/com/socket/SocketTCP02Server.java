package com.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zhouxufeng
 * @version 1.0
 * 使用字符流完成要求
 *  1. 编写一个服务端和一个客户端
 *  2. 服务端在9999端口监听
 *  3. 客户端连接到服务端，发送"hello,server", 并接收服务端回发的"hello,client",再退出
 *  4. 服务端接收到客户端发送的信息输出，并发送"hello,clinet",再退出
 */
@SuppressWarnings({"all"})
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听，等待连接..");
        Socket socket = serverSocket.accept();
        System.out.println("服务端返回socket: " + socket.getClass());

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("hello,client");
        //插入一个换行符，表示写入的内容结束,主要，要求对方使用readLine()
        bw.newLine();
        //如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
        bw.flush();

        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端结束退出");
    }
}
