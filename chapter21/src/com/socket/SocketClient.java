package com.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author zhouxufeng
 * @version 1.0
 * 客户端
 */
@SuppressWarnings({"all"})
public class SocketClient {
    public static void main(String[] args) throws IOException {
        //思路
        // 1. 连接服务器(ip, 端口)
        Socket socket = new Socket("218.93.250.18", 9999);
        System.out.println("客户端 socket返回 = " + socket.getClass());
        // 2. 连接上后,生成Socket,通过 socket.getOutStream()
        // 3. 通过输出流,写入数据到服务端
    }
}
