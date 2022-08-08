package com.file;

import com.enum_.FileEnum;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author zhouxufeng
 * @version 1.0
 * 使用 FileOutStream 在 a.txt 文件中写入 "Heollo, World!", 如果文件不存在，会创建文件
 */
@SuppressWarnings({"all"})
public class FileOutputStreamExercise {
    public static void main(String[] args) {
        String fileDir = String.valueOf(FileEnum.DIR_PATH + "data/file");
        String fileName = "a.txt";
        try{
            // 如果文件存在就得到该文件对象， 不存在则创建
            FileOutputStream fileOutputStream = new FileOutputStream(fileDir + "/" + fileName);
            //true表示为 追加模式， 如果不写，默认为覆盖模式
            FileOutputStream fileOutputStream1 = new FileOutputStream(fileDir + "/" + fileName, true);
            //写入单个字节
            //fileOutputStream1.write('H');
            //批量写入整个byte数组
            //getBytes 是返回 "Hello" 这个字符串对应的字节数组
            fileOutputStream1.write("Hello, World!".getBytes());
            /*
            参数1： b the data ：待写入的字节数组
            参数2： off 起始索引， 从0开始计算
            参数3： 写入的实际字节个数
             */
            //fileOutputStream1.write("People".getBytes(), 0, 5);
            fileOutputStream.close();
            fileOutputStream1.close();
            System.out.println("写入完成");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
