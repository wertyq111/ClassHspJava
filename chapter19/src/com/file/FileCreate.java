package com.file;

import com.enum_.FileEnum;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import java.io.File;
import java.io.IOException;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class FileCreate {
    public static void main(String[] args) {

    }

    @Test
    public void create01() throws IOException {
        String filePath = FileEnum.DIR_PATH + "file/news1.txt";
        File file = new File(filePath);

        file.createNewFile();
        System.out.println("文件创建成功");
    }

    @Test
    public void create02() throws IOException {
        File parentFile = new File(FileEnum.DIR_PATH + "file");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);

        file.createNewFile();
        System.out.println("文件创建成功");
    }

    @Test
    public void create03() throws IOException {
        String parentPath = String.valueOf(FileEnum.DIR_PATH);
        String fileName = "file/news3.txt";

        File file = new File(parentPath, fileName);

        file.createNewFile();
        System.out.println("创建成功");
    }
}
