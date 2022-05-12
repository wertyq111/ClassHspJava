package com.polymorphic_;

import com.polymorphic_.object_.Animal;
import com.polymorphic_.object_.Cat;
import com.polymorphic_.object_.Dog;

public class PolyObject {
    public static void main(String[] args) {

        //animal 编译类型是 Animal , 运行类型是 Dog
        Animal animal = new Dog("Tom");
        animal.cry();

        //animal 编译类型是 Animal , 运行类型是 Cat
        animal = new Cat("Jerry");
        animal.cry();
    }
}
