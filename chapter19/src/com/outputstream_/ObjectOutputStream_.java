package com.outputstream_;

import com.enum_.FileEnum;

import java.io.*;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示ObjectOutputStream的使用，完成数据的序列化
 */
@SuppressWarnings({"all"})
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        String fileDir = FileEnum.DIR_PATH + "data/dat/";
        String filePath = fileDir + "data.dat";

        //判断是否存在目录，不存在则进行创建
        File dir = new File(fileDir);
        if(!dir.exists()) {
            dir.mkdirs();
        }

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到 data.dat
        oos.writeInt(100); //int -> Integer(实现了 Serializable)
        oos.writeBoolean(true); //boolean -> Boolean(实现了 Serializable)
        oos.writeChar('a'); //char -> Charter(实现了 Serializable)
        oos.writeDouble(10.1); //double -> Double(实现了 Serializable)
        oos.writeUTF("hello, 杭州"); //String(实现了 Serializable)

        //保存一个Dog对象
        oos.writeObject(new Dog("旺财", 2, "中国", "黄色"));

        oos.close();
        System.out.println("数据保存完毕(序列化形式)");
    }
}

