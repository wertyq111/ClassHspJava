package com.file;

import com.enum_.FileEnum;
import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class FileInformation {
    public static void main(String[] args) {

    }

    /**
     * 获取文件信息
     */
    @Test
    public void information() {
        File file = new File(FileEnum.DIR_PATH + "file/news1.txt");

        //获取文件名
        System.out.println("文件名：" + file.getName());
        //获取文件绝对路径
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        //获取文件父级
        System.out.println("文件父级目录：" + file.getParent());
        //获取文件大小
        System.out.println("文件大小：" + file.length());
        //判断文件是否存在
        System.out.println("文件是否存在：" + file.exists());
        //判断是否是个文件
        System.out.println("是否是一个文件：" + file.isFile());
        //判断是否是个目录
        System.out.println("是否是一个目录：" + file.isDirectory());
    }

    /**
     * 目录的操作和文件的删除
     * java中目录也被当做一个文件
     */
    @Test
    public void operate() {
        //文件删除
        String filePath = String.valueOf(FileEnum.DIR_PATH) + "file/news1.txt";

        File file = new File(filePath);
        if(file.exists()) {
            if(file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println(filePath + "不存在");
        }

        //创建目录
        String fileDir = String.valueOf(FileEnum.DIR_PATH) + "data/file";
        File dir = new File(fileDir);
        if(dir.exists()) {
            System.out.println(dir + "已存在");
        } else {
            if(dir.mkdirs()) { //创建一级目录使用mkdir(), 创建多级目录使用mkdirs()
                System.out.println(dir + "创建成功");
            } else {
                System.out.println(dir + "创建失败");
            }
        }
    }
}
