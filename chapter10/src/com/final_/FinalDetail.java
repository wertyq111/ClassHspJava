package com.final_;

public class FinalDetail {
    public static void main(String[] args) {
        System.out.println(BB.i);
    }
}

class AA {
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;
    public static final double TAX_RATE4;

    public AA() {
        TAX_RATE2 = 1.1;
        //TAX_RATE4 = 5.5; //静态属性不能在构造器中赋值
    }
    static {
        TAX_RATE4 = 6.6; //静态属性可以在静态代码块和初始化的时候赋值
    }
    {
        TAX_RATE3 = 8.8;
    }
}

//final和static往往搭配使用,效率更高,不会导致类加载，底层编译器做了优化处理
class BB {
    public final static int i = 3;

    static {
        System.out.println("BB 类静态代码块被加载");
    }
}
