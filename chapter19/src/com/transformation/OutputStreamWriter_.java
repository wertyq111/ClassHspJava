package com.transformation;

import com.enum_.FileEnum;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示 OutputStreamWriter 使用
 * 把 FileOutputStream 字节流， 转成字符流 OutputStreamWriter
 * 制定处理的编码 gbk/utf-8/utf8
 */
@SuppressWarnings({"all"})
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        //hello_gbk.txt
        String fileDir = FileEnum.DIR_PATH + "file/";
        String fileName = "hello_gbk.txt";

        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(fileDir + fileName, true),
                        "utf-8"
                )
        );

        bw.write("hello， gbk杭州");
        bw.close();
        System.out.println("保存成功");
    }
}
