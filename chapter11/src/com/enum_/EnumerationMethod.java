package com.enum_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
public class EnumerationMethod {
    public static void main(String[] args) {
        Season2 season = Season2.SUMMER;
        //继承父类 Enum类的toString 方法输出对象名称
        System.out.println(season);
        //输出该枚举对象的名称
        System.out.println(season.name());
        //输出的是该枚举对象的次序/编号，从0开始
        System.out.println(season.ordinal());
        //从反编译可以看到 values 方法，返回 Season[] 数组， 含有定义的所有枚举对象
        Season2[] seasons = Season2.values();
        for (Season2 s : seasons) {
            System.out.println(s.name());
        }
        //valueOf 方法，根据枚举对象的名称，返回枚举对象
        // 1. 根据你输入的 "SUMMER" 到Season2 的枚举对象去查找
        // 2. 如果找到，那么返回该枚举对象，没有则返回报错
        Season2 season2 = Season2.valueOf("SUMMER");
        System.out.println(season2);

        //compareTo 方法，比较两个枚举对象的次序，如果相等，返回0，如果不同返回ordinal的差值
        System.out.println(Season2.SPRING.compareTo(Season2.WINTER));
    }
}


