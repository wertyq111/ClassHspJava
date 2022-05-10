package com.extend.exercise;

/**
 * 课堂练习
 * 编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回
 * Computer的详细信息
 * 编写PC子类，继承Computer类，添加特有属性【品牌brand】
 * 编写NotePad子类，继承Computer类，添加特有属性【颜色color】
 * 编写Test类，在main方法中创建PC和NotePad对象，分别给对象中特有的属性
 * 赋值，以及从Computer类继承的属性赋值，并使用方法并打印输出信息。
 */
public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC();
        NotePad notePad = new NotePad("M1 PRO", "256G", "1T", "灰色");

        //给PC特有属性赋值
        pc.setBrand("华为");
        //给Computer继承的属性赋值
        pc.setCpu("inter i7");
        pc.setMemory("64G");
        pc.setHardDisk("5T");
        //给NotePad特有属性赋值
        notePad.setColor("银灰色");

        //使用方法并打印输出信息
        pc.showPC();
        System.out.println("===================================================");
        notePad.showNotePad();
    }
}

