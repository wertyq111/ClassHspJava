package com.extend;

public class Pupil extends Student {
    public Pupil() {
        super("银角大王"); //写不写都有,默认调用父类的构造方法
    }

    public void testing() {
        System.out.println("小学生: " + name + " 正在考小学数学...");
    }
}
