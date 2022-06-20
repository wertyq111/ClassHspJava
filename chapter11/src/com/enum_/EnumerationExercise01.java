package com.enum_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
public class EnumerationExercise01 {
    public static void main(String[] args) {
        Gender boy = Gender.BOY;
        Gender boy2 = Gender.BOY;

        System.out.println(boy); //调用父类 Enum类的toString 方法
        System.out.println(boy2 == boy);
    }
}

enum Gender {
    BOY, GIRL;
}
