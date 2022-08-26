package com.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author zhouxufeng
 * @version 1.0
 * 客户端
 */
@SuppressWarnings({"all"})
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //思路
        // 1. 连接服务器(ip, 端口)
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回： " + socket.getClass());
        // 2. 连接上后,生成Socket,通过 socket.getOutStream()
        //   得到 和 socket关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        // 3. 通过输出流,写入数据到服务端
        outputStream.write("hello, server".getBytes());
        // 4. 关闭流对象和socket
        outputStream.close();
        socket.close();
    }
}
