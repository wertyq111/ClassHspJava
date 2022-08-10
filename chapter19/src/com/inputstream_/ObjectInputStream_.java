package com.inputstream_;

import com.enum_.FileEnum;
import com.outputstream_.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示ObjectInputStream的使用，完成数据的反序列化
 */
@SuppressWarnings({"all"})
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException {
        String fileDir = FileEnum.DIR_PATH + "data/dat/";
        String filePath = fileDir + "data.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //读取解读
        // 1. 读取(反序列化)的顺序需要和你保存数据(序列化)的顺序一致
        // 2. 否则会出现异常
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        try {
            Dog dog = (Dog) ois.readObject();//底层 Object->Dog
            //Dog 类需要跟写入的时候保持一致， 将Dog类公有化
            System.out.println("运行类型: " + dog.getClass());
            System.out.println("dog的内容: " + dog);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        ois.close();
    }
}
