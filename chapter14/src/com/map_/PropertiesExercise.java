package com.map_;

import java.util.Properties;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class PropertiesExercise {
    public static void main(String[] args) {

        //解读
        // 1. Preperties 继承 Hashtabl
        // 2. 可以通过 k-v 存放数据, 当然 key 和 value 不能为 null
        Properties properties = new Properties();
        properties.put("john", 100);
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88); // 替换

        System.out.println(properties);

        // 通过k 获取对应的值
        System.out.println(properties.get("lic"));
        System.out.println(properties.getProperty("lic")); //值如果不是字符串(String) 返回 null
        // 删除
        properties.remove("lucy");
        System.out.println(properties);
    }
}
