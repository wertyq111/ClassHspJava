package com.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Api_ {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机的InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("localHost=" + localHost);

        //根据指定主机名 获取 InetAddress 对象
        InetAddress host1 = InetAddress.getByName("zhouxufengdeMacBook-Air.local");
        System.out.println("host1=" + host1);

        //根据域名返回 InetAddress 对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2=" + host2);

        //通过 InetAddress 对象，获取对应的地址
        String host2Address = host2.getHostAddress();
        System.out.println("host2对应的IP地址：" + host2Address);

        //通过 InetAddress 对象， 获取对应的主机名/域名
        String host2Name = host2.getHostName();
        System.out.println("host2对应的主机名/域名：" + host2Name);
    }
}
