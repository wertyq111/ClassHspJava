package com.inner_class_;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();

        outer03.method();
    }
}

class Outer03 {
    private int n1 = 99;

     public void cry(){};

    public void method() {
        new Person("jack") {
            @Override
            public void hi() {
                System.out.println("Hi my name is " + super.name);
            }
        }.hi();
    }
}

class Person {
    public String name;
    public Person(String name) {
        this.name = name;
    }

    public void hi() {

    }
}
