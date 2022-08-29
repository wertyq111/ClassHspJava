package com.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1. 创建一个DatagramSocket 对象, 准备在 9999 端口接受数据
        DatagramSocket socket = new DatagramSocket(9999);
        //2. 构建一个 DatagramPacket 对象， 准备接收数据
        //   在前面讲解UDP协议时， 一个数据包最大 64K
        byte[] buf = new byte[64 * 1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //3. 调用接收方法， 将通过网络传输的 DatagramPacket 对象
        //   填充到 packet对象
        //   当有数据包发送到 本机的9999端口时，就会接收到数据。
        //   如果没有数据包发送到 9999端口就会阻塞等待
        System.out.println("接收端A 等待接收数据...");
        socket.receive(packet);

        //4. 可以把packet 进行拆包，取出数据并显示
        int length = packet.getLength();
        byte[] data = packet.getData();

        String s = new String(data, 0, length);
        System.out.println(s);

        //5. 接收到信息后进行回复
        byte[] receiveData = "好的，明天见".getBytes();
        DatagramPacket sendPacket = new DatagramPacket(receiveData, receiveData.length, InetAddress.getByName("127.0.0.1"), 9998);

        //6. 发送回复信息到 9998端口
        socket.send(sendPacket);

        //5. 关闭 socket
        socket.close();
        System.out.println("A端结束");
    }
}
