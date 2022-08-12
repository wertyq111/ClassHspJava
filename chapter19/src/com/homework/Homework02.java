package com.homework;

import com.enum_.FileEnum;

import java.io.*;

/**
 * @author zhouxufeng
 * @version 1.0
 * 要求:
 *  使用BufferedReader读取一个文本文件，为每行加上行号，
 *  再连同内容一起输出到屏幕上。
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) throws IOException {
        //给homework01中的文件写入内容
        String fileDir = FileEnum.DIR_PATH + "homework";
        String fileName = "hello.txt";

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileDir + "/" + fileName));
        bw.write("Hello, Homework01");
        bw.newLine();
        bw.write("这是一行中文");
        bw.close();
        System.out.println("写入完成");
        System.out.println("==============");

        //根据编码读取文件
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileDir + "/" + fileName),
                        "utf8"
                )
        );
        String line;
        int num = 0;
        while((line = br.readLine()) != null) {
            System.out.println(++num + ": " + line);
        }

        System.out.println("==============");
        System.out.println("读取完毕");
        br.close();
    }
}
