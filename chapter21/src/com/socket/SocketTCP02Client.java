package com.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端返回socket: " + socket.getClass());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("hello,server");
        //插入一个换行符，表示写入的内容结束,主要，要求对方使用readLine()
        bw.newLine();
        //如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
        bw.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine());

        br.close();
        bw.close();
        socket.close();
        System.out.println("客户端结束退出");

    }
}
