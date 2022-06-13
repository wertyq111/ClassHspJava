package com.interface_;

/**
 * 演示多态传递现象
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量可以指向，实现了该接口的类的对象实例
        IG ig = new Teacher();
        //如果 IG 继承了 IH 接口， 而 Teacher 类实现了 IG 接口
        //那么实际上就相当于 Teacher 类也实现了 IH 接口
        //也就是接口的多态传递现象
        IH ih = new Teacher();
        ig.hi();
    }
}

interface IH {
    void hi();
}
interface IG extends IH {}
class Teacher implements IG {

    @Override
    public void hi() {
        System.out.println("hello");
    }
}
