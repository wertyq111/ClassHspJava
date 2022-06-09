package com.code_block_;

import com.code_block_.exercise_object_.Person;
import com.code_block_.exercise_object_.Sample;
import com.code_block_.exercise_object_.Test;

public class CodeBlockExercise {
    public static void main(String[] args) {
        System.out.println("total="+ Person.total);
        System.out.println("total="+Person.total);

        /**
         * 输出结果
         *  1. in static block
         *  2. total=100
         *  3. total=100
         */

        System.out.println("====================");

        Test a = new Test();
        /**
         * 输出结果
         *  1. 静态成员sam初始化
         *  2. static块执行
         *  3. sam1成员初始化
         *  4.Test默认构造函数被调用
         */

        System.out.println("====================");



    }
}
