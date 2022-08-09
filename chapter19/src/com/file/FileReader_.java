package com.file;

import com.enum_.FileEnum;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author zhouxufeng
 * @version 1.0
 * 用FileReader 从 file/hello.txt 读取内容并显示
 */
@SuppressWarnings({"all"})
public class FileReader_ {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(FileEnum.DIR_PATH + "file/hello.txt");
        int len;
//        while((len = fileReader.read()) != -1) {
//            System.out.print((char)len);
//        }

        char[] buf = new char[1024];
        while((len = fileReader.read(buf)) != -1) {
            System.out.print(new String(buf, 0, len));
        }
        fileReader.close();
    }
}
