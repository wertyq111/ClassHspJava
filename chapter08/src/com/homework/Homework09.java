package com.homework;

import com.homework.object_.LabeledPoint;
import com.homework.object_.Point;

/**
 * 设计一个Point类
 * 其x和y坐标可以通过构造器提供
 * 提供一个子类LabeledPoint,
 * 其构造器接受一个标签值和x,y坐标，比如：new LabeledPoint(“BlackThursday”,1929,230.07),
 * 写出对应的构造器即可
 */
public class Homework09 {
    public static void main(String[] args) {
        Point blackThursday = new LabeledPoint("BlackThursday", 1929, 230.07);
    }
}
