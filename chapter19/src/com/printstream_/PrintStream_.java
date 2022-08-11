package com.printstream_;

import com.enum_.FileEnum;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示 PrintStream(字节打印流|输出流)
 */
@SuppressWarnings({"all"})
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        //在默认情况下， PrintStream 输出数据的位置是 标准输出， 即显示器
        out.println("Hello, Jhon");
        //因为print底层使用的是write， 所以我们可以直接调用write进行打印/输出
        out.write("Hello, 杭州".getBytes());

        out.close();

        //我们可以修改打印流输出的位置/设备
        System.setOut(new PrintStream(FileEnum.DIR_PATH + "file/print_stream.txt"));
        System.out.println("Hello, 打印流");
        System.out.println("Hello, 打印流");
    }
}
