package com.reader_;

import com.enum_.FileEnum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = FileEnum.DIR_PATH + "file/hello.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line; //按行读取，效率高
        //说明
        // 1. bufferedReader.readLine() 是按行读取文件
        // 2. 当返回null 时，表示读取完毕
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        //关闭流, 只需要关闭 BufferedReader, 因为底层会自动的去关闭 节点流
        bufferedReader.close();
    }
}
