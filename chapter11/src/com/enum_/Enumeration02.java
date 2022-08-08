package com.enum_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.CHANGE);
    }
}

//使用enumeration关键字来实现枚举类
enum Season2 {
    //如果使用了enum来实现枚举类
    // 1. 使用关键字 enum 替代 class
    // 2. public static final Season SPRING = new Season("春天", "春暖花开"); 直接使用 SPRING("春天", "春暖花开")
    // 3. 如果有多个常量(对象)，那么使用 , 分割
    // 4. 如果使用 enum 来实现枚举，要求将定义常量对象卸载最前面
    CHANGE,
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "冬日凛冽");
    private String name;
    private String description;

    private Season2(){
        System.out.println("选择枚举类");
    }

    private Season2(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name;
    }
}
