package com.enum_;

/**
 * @author zhouxufeng
 * @version 1.0
 *
 * 练习需求：
 *  1. 声明Week枚举类， 其中包含星期一至星期日的定义： MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
 *  2. 使用valuse 返回所有的枚举数组并变脸， 输出所有的枚举对象的名称
 */
public class EnumerationExercise02 {
    public static void main(String[] args) {
        System.out.println("===所有星期的信息如下===");
        for(Week week : Week.values()) {
            System.out.println(week);
        }
    }
}

enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private String name;

    private Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
