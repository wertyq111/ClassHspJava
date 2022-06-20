package com.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season1.AUTUMN);
        System.out.println(Season1.SPRING);
        System.out.println(Season1.WINTER);
    }
}

class Season1 {
    private String name;
    private String description;

    public static final Season1 SPRING = new Season1("春天", "春暖花开");
    public static final Season1 SUMMER = new Season1("夏天", "夏日炎炎");
    public static final Season1 AUTUMN = new Season1("秋天", "秋高气爽");
    public static final Season1 WINTER = new Season1("冬天", "冬日凛冽");

    private Season1(String name, String description) {
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
        return "Season{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
