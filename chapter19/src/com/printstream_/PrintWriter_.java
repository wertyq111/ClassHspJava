package com.printstream_;

import com.enum_.FileEnum;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示 PrintWriter 使用方法
 */
@SuppressWarnings({"all"})
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        //PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(FileEnum.DIR_PATH + "file/print_writer.txt"));
        printWriter.println("Hello， 开化");
        printWriter.close();
    }
}
