package com.file;

import com.enum_.FileEnum;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zhouxufeng
 * @version 1.0
 * 文件拷贝
 */
@SuppressWarnings({"all"})
public class FileCopy {
    public static void main(String[] args) throws IOException {
        String fileDir = String.valueOf(FileEnum.DIR_PATH);

        FileInputStream fileInputStream = new FileInputStream(fileDir + "data/file/hello.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(fileDir + "file/hello.txt");

        byte[] buff = new byte[1024];
        int len = 0;
        while((len = fileInputStream.read(buff)) != -1) {
            fileOutputStream.write(buff, 0, len);
        }

        fileInputStream.close();
        fileOutputStream.close();

        System.out.println("拷贝完毕");
    }
}
