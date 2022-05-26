package com.static_;

public class ChildGame {
    public static void main(String[] args) {

        /**问题分析
         * 1. count 是一个独立于对象,很尴尬
         * 2. 以后我们访问 count 很麻烦, 没有使用到OOP
         * 3. 因此我们引出 类变量/静态变量
         */
        int count = 0;
        Child c1 = new Child("白骨精");
        Child c2 = new Child("老鼠精");
        Child c3 = new Child("狐狸精");
        c1.join();
        count++;
        c2.join();
        count++;
        c3.join();
        count++;

        System.out.println("共有" + Child.totalNum + "小孩加入游戏");
    }
}

class Child {
    private String name;
    //定义一个变量 totalNum ,是一个类变量(静态变量) static 静态
    //该变量最大的特点就是会被 Child 类的所有的实例对象共享
    public static int totalNum = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏");
        totalNum++;
    }
}
