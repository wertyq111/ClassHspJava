package com.propertirs_;

import com.enum_.FileEnum;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Properties01 {
    public static void main(String[] args) throws IOException {
        String configDir = FileEnum.DIR_PATH + "file/";
        String configName = "mysql.properties";

        //传统方法读取mysql配置文件
        BufferedReader br = new BufferedReader(new FileReader(configDir + configName));
        String line;
        while((line = br.readLine()) != null) {
            String[] split = line.split("=");
            System.out.println(split[0] + " => " + split[1]);
        }
        br.close();

        //Properties类读取mysql配置文件
        // 1. 创建 Properties 对象
        Properties properties = new Properties();
        // 2. 加载制定配置文件
        properties.load(new FileReader(configDir + configName));
        // 3. 把key，value显示到设备上
        properties.list(System.out);
        System.out.println("==========");
        // 4. 根据 key 获取对应的 value
        String pwd = properties.getProperty("pwd");
        System.out.println(pwd);
        // 4.1 根据 key 修改对应的 value
        properties.setProperty("pwd", "rrr2222");
        pwd = properties.getProperty("pwd");
        System.out.println(pwd);
        // 5. 使用 Properties 类来创建 配置文件， 修改配置文件内容
        // 5.1 创建， 如果该文件没有key 就是创建， 如果该文件有key，就是修改
        Properties properties1 = new Properties();
        properties1.setProperty("charset", "utf-8");
        properties1.setProperty("user", "开化");
        properties1.setProperty("pwd", "aa123");

        // 5.2 将key, value存储文件中
        properties1.store(new FileOutputStream(configDir + "mysql2.properties"), null);
        System.out.println("==========");
        System.out.println("保存配置文件成功");

    }
}
