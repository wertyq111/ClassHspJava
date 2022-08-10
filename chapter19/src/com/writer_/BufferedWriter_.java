package com.writer_;

import com.enum_.FileEnum;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = FileEnum.DIR_PATH + "file/note.txt";
        //创建一个 BufferedWriter
        //说明: 覆盖/追加模式需要通过底层的写入方法(new FileWriter(filePath, true))来决定
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath)); //覆盖模式
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true)); //追加模式
        bufferedWriter.write("hello, 这是一个笔记本");
        //插入换行
        bufferedWriter.newLine();
        bufferedWriter.write("笔记本第一页");
        //插入换行
        bufferedWriter.newLine();
        bufferedWriter.write("笔记本第一行");

        //说明: 关闭外层流即可， 传入的 new FileWriter(filePath)会在底层关闭
        bufferedWriter.close();
    }
}
