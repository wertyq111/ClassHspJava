package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zhouxufeng
 * @version 1.0
 * 服务端
 */
@SuppressWarnings({"all"})
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //思路
        // 1. 在本机的9999端口监听，等待链接
        //  细节: 要求在本机没有其他服务在监听9999端口 ServerSocket 可以通过 accept() 返回多个Socket[多个客户端链接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在 9999 端口监听，等待连接..");
        // 2. 当没有客户端链接9999端口时， 程序会阻塞，等待链接
        //   如果有客户端链接，则会返回Socket对象， 程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务端 socket返回：" + socket.getClass());
        // 3. 通过socket.getInpuStream() 读取客户端写入到数据通道的数据，显示
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }
        // 4. 关闭流对象和socket
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
