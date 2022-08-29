package com.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework01Client {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入发送文本:");
        Scanner scanner = new Scanner(System.in);
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);

        String send = scanner.nextLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(send);
        bw.newLine();
        bw.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String recevice = br.readLine();
        System.out.println(recevice);


        br.close();
        bw.close();
        socket.close();
    }
}
