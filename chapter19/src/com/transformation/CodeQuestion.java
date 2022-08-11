package com.transformation;

import com.enum_.FileEnum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author zhouxufeng
 * @version 1.0
 * 看一个中文乱码问题
 */
@SuppressWarnings({"all"})
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        //读取hello.txt
        String fileDir = FileEnum.DIR_PATH + "file/";
        String fileName = "hello.txt";

        //思路
        // 1. 创建字符输入流 BufferedReader [处理流]
        // 2. 使用 BufferedReader 对象读取文件 3. 默认情况下，读取文件是按照 utf-8 编码
        BufferedReader br = new BufferedReader(new FileReader(fileDir + fileName));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
