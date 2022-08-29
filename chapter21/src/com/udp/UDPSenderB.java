package com.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author zhouxufeng
 * @version 1.0
 *  1. 编写一个接收端A和一个发送端B
 *  2. 接收端A在 9999 端口等待接受数据(receive)
 *  3. 发送端B向接收端A 发送 数据 "hello， 明天吃火锅~"
 *  4. 接收端A接收到发送端B发送的数据， 回复"好的， 明天见", 再退出
 *  5，发送端接受回复的数据再退出
 */
@SuppressWarnings({"all"})
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //1. 创建 DatagramSocket 对象， 准备发送和接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        //2. 将需要发送的数据，封装到 DatagramPacket对象
        byte[] data = "hello, 明天吃火锅~".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("127.0.0.1"), 9999);

        //3. 调用发送方法
        socket.send(packet);

        //4. 接收回复
        byte[] buf = new byte[64 * 1024];
        DatagramPacket receivePacket = new DatagramPacket(buf, buf.length);

        //5. 调用接收方法
        socket.receive(receivePacket);

        //6. 打印回复
        System.out.println(new String(receivePacket.getData(), 0, receivePacket.getLength()));

        //7. 关闭socket
        socket.close();
        System.out.println("B端结束");

    }
}
