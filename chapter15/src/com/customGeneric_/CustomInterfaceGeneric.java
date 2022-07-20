package com.customGeneric_;

/**
 * @author zhouxufeng
 * @version 1.0
 * 自定义泛型接口
 */
@SuppressWarnings({"all"})
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

//当我们去实现IA接口时， 因为IA在继承IUsb 接口时， 制定了 U 为String， R 为Double
//在实现IUsb接口的方法时，使用String 替换U， 使用Double替换 R
@SuppressWarnings({"all"})
class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

// 实现接口时，直接制定泛型接口类型
// 给U指定为String， 给R 指定为Integer
@SuppressWarnings({"all"})
class BB implements IUsb<String, Integer> {

    @Override
    public Integer get(String s) {
        return null;
    }

    @Override
    public void hi(Integer integer) {

    }

    @Override
    public void run(Integer r1, Integer r2, String u1, String u2) {

    }
}

// 不指定泛型类型的时候默认指定为Object
@SuppressWarnings({"all"})
class CC implements IUsb {

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}

// 继承接口时制定泛型的类型
interface IA extends IUsb<String, Double> {}

@SuppressWarnings({"all"})
interface IUsb<U, R> {
    //静态成员不能使用泛型
    //U name = "hsp";

    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //在jdk8中，
}
