package com.polymorphic_;

import com.polymorphic_.object_.Animal;
import com.polymorphic_.object_.Cat;
import com.polymorphic_.object_.Fish;
import com.polymorphic_.object_.Food;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型: 父类的引用指向了子类的对象
        //语法: 父类类型引用名 = new 子类类型();
        Animal animal = new Cat("西米");

        //可以调用父类的所有成员(遵循访问源则)
        //但是不能调用子类的特有成员
        //因为在编译阶段,能调用哪些成员,是由编译类型来决定的
        //animal.catchMouse();
        //最终运行效果看子类(运行类型)的具体实现, 即调用方法时,按照子类的开始查找方法
        animal.sleep();
        animal.eat();
        animal.run();

        //向下转型
        //语法: 子类类型 引用名 = (子类类型) 父类引用;
        //编译类型是 Cat , 运行类型是 Cat
        Cat cat = (Cat) animal;
        cat.catchMouse();

        //要求父类的引用必须指向的是当前目标类型对象: animal 的运行类型必须是 Cat
        //Dog dog = (Dog) animal;

        //instanceOf 比较操作符, 用于判断对象的运行类型是否为 XX类型 或者 XX类型的子类型
        Fish fish = new Fish("fish");
        System.out.println(fish instanceof Fish); //true
        System.out.println(fish instanceof Food); //true

        Food fish1 = new Fish("fish1");
        System.out.println(fish1 instanceof Fish); //true
        System.out.println(fish1 instanceof Food); //true

        Object obj = new Object();
        System.out.println(obj instanceof Food); //false

        String str = "hello";
        System.out.println(str instanceof Object); //
    }
}
