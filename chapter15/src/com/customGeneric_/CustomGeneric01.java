package com.customGeneric_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CustomGeneric01 {
    public static void main(String[] args) {

    }
}

//解读
// 1. Tiger 后面泛型， 所以我们把 Tiger 就称为自定义泛型类
// 2. T, R, M 法宁的标识符， 一半是单个大写祖母
// 3. 泛型标识符可以有多个
// 4. 普通成员可以使用泛型 (属性， 方法)
class Tiger<T, R, M> {
    String name;
    T t; // 属性使用泛型
    R r;
    M m;
    // 因为静态适合类相关的， 在类加载时， 对象还没有创建
    // 所以， 如果静态方法和静态属性使用了泛型， JVM就无法完成初始化
    //static M m;


    public Tiger(String name, T t, R r, M m) { // 构造器使用泛型
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
