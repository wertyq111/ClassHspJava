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
public class SocketTCPFileCopyClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        String srcImagePath = "/Users/zhouxufeng/program/ClassHspJava/chapter21/img/ximi.png";

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcImagePath));

        StreamUtils streamUtils = new StreamUtils();
        byte[] fileBytes = streamUtils.streamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(fileBytes);
        bis.close();
        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine());

        br.close();
        bos.close();
        socket.close();
        System.out.println("客户端结束关闭");

    }
}
