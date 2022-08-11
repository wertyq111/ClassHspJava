package com.transformation;

import com.enum_.FileEnum;

import java.io.*;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示使用 InputStreamReader 转换流结局中文乱码问题
 * 将字节流 FileInputStream 转换成字符流 InputStreamReader， 制定编码 gbk/utf-8
 */
@SuppressWarnings({"all"})
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        //读取hello.txt
        String fileDir = FileEnum.DIR_PATH + "file/";
        String fileName = "hello_gbk.txt";

        //解读
        // 1. 把 FileInputStream 转换成 InputStreamReader
        // 2. 制定编码 gbk
        InputStreamReader isr = new InputStreamReader(new FileInputStream(fileDir + fileName), "gbk");
        // 3. 把InputStreamReader 传入 BufferedReader
        BufferedReader br = new BufferedReader(isr);
        // 4. 读取文件
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        // 5. 关闭外层流
        br.close();
    }
}
