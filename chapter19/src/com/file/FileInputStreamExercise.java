package com.file;

import com.enum_.FileEnum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author zhouxufeng
 * @version 1.0
 * 使用FileInputStream 读取 hello.txt 文件， 并将文件内容显示到控制到
 */
@SuppressWarnings({"all"})
public class FileInputStreamExercise {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(FileEnum.DIR_PATH + "data/file/hello.txt");

        //读取方式1， 一个一个字节的读取
        readFile01(fileInputStream);
        fileInputStream.close();//文件读取完毕应将文件流关闭释放资源

        System.out.println("\n===========");
        fileInputStream = new FileInputStream(FileEnum.DIR_PATH + "data/file/hello.txt");
        //读取方式2， 多个字节的读取
        readFile02(fileInputStream);
        fileInputStream.close();
    }

    /**
     * 单个字节读取，效率比较低，出现汉字会出现乱码
     * @param file
     * @throws IOException
     */
    public static void readFile01(FileInputStream file) throws IOException {
        int read;
        while((read = file.read()) != -1) {
            System.out.print((char)read);//转成char显示
        }
    }

    /**
     * 多个字节读取
     * @param file
     * @throws IOException
     */
    public static void readFile02(FileInputStream file) throws IOException {
        byte[] buffer = new byte[1024*8]; //为了提高效率，可以将byte 空间扩大byte[1024*8]
        int len;
        //如果读取正常， 返回实际读取的字节数
        //如果读取完毕， 返回-1
        while ((len = file.read(buffer)) != -1) {
            // 将读取到的字节的0 - len, 转换成String输出
            System.out.println(new String(buffer, 0, len));
        }
    }
}
