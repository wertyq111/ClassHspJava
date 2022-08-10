package com.writer_;

import com.enum_.FileEnum;

import java.io.*;

/**
 * @author zhouxufeng
 * @version 1.0
 * BufferedCopy 拷贝演示
 */
@SuppressWarnings({"all"})
public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {
        String srcFilePath = FileEnum.DIR_PATH + "file/note.txt";
        String destFilePath = FileEnum.DIR_PATH + "file/note1.txt";

        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;

        //说明:
        // 1. BufferedReader 和 BufferedWriter 是按照字符操作
        // 2. 不要去操作二进制文件[声音, 视频, doc, pdf等等], 可能造成文件损坏
        br = new BufferedReader(new FileReader(srcFilePath));
        bw = new BufferedWriter(new FileWriter(destFilePath));

        while((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("拷贝成功");
    }
}
