package com.exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ThrowsDetail {
    public static void main(String[] args) {
        try {
            new ThrowsDetail().f1();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void f1() throws FileNotFoundException {
        //创建一个文件流对象
        // 1. 这里的异常是一个FileNotFoundException 变异异常
        // 2. 使用前面讲过的 try-catch-finally
        // 3. 使用throws，抛出异常， 让调用f1方法的调用者(方法)处理
        FileInputStream file = new FileInputStream("../index");
    }

    public static void f2() throws FileNotFoundException {
        //解读
        // 1. 因为f1() 方法抛出的是一个编译异常
        // 2. 即这时，就要f2() 方法必须处理这个编译异常
        // 3. 在f2() 中要么try-catch-finally , 或者继续throws这个编译异常
        f1();
    }

    public static void f3() {
        //解读：
        // 1. 在f3()中调用f4() 不用要求处理运行异常
        // 2. 运行异常有默认的处理机制
        f4();
    }

    public static void f4() throws ArithmeticException {

    }
}
