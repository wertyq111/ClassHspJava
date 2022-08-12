package com.homework;

import com.enum_.FileEnum;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author zhouxufeng
 * @version 1.0
 * 要求:
 * (1）在判断/Users/zhouxufeng/program/ClassHspJava/chapter19/(目录Enum: enum_/FileEnum)下是否有文件夹homework,如果没有就创建homework
 * (2） 在homework 目录下，创建文件 hello.txt
 * (3）如果hello.txt 已经存在，提示该文件已经存在，就不要再重复创建了
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) throws IOException {
        String fileDir = FileEnum.DIR_PATH + "homework/";
        String fileName = "hello.txt";

        //判断目录是否存在，不存在则创建
        File dir = new File(fileDir);
        if(!dir.exists()) {
            if(dir.mkdirs()) {
                System.out.println("目录创建成功");
            } else {
                System.out.println("目录创建失败");
            }
        }

        //判断文件是否存在，存在就不创建
        File filePath = new File(fileDir + fileName);
        if(!filePath.exists()) {
            if(filePath.createNewFile()) {
                System.out.println("文件创建成功");
            } else {
                System.out.println("文件创建失败");
            }
        } else {
            System.out.println("文件已创建");
        }
    }
}
