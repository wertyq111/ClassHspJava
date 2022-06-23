package com.exception_;

/**
 * @author zhouxufeng
 * @version 1.0
 * 当我们接收Person对象年龄时，要求范围在18-120之间，否则抛出一个自定义异常
 * 要求继承 RuntimeException，并给出提示信息
 */
@SuppressWarnings({"all"})
public class CustomException {
    public static void main(String[] args) {
        try {
            Person jack = new Person("jack", 12);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws AgeException {
        this.name = name;
        if(age >=18 && age <= 120) {
            this.age = age;
        } else {
            throw new AgeException("年龄需要在 18-120之间");
        }
    }
}

//自定义异常类
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
