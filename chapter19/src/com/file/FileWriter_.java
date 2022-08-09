package com.file;

import com.enum_.FileEnum;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zhouxufeng
 * @version 1.0
 * 将"风雨之后，定见彩虹" 写入 file/hello.txt文件中
 */
@SuppressWarnings({"all"})
public class FileWriter_ {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter(FileEnum.DIR_PATH + "file/hello.txt" ,true); //追加模式

        //直接写入字符串
        fileWriter.write("风雨之后，定见彩虹");
        //写入字符数组
        fileWriter.write(" 你好，世界".toCharArray());
        //写入字符数组指定部分
        fileWriter.write(" 你好，杭州".toCharArray(), 4, 2);


        //需要关闭(close)或者刷新(flush)才能写入到文件当中
        //刷新(flush)方法作用是刷新该流的缓冲， 如果没有执行，内容不会写入到文件中
        fileWriter.flush();
        fileWriter.close();

        System.out.println("写入完成");
    }
}
