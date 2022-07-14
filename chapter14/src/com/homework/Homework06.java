package com.homework;

import com.homework.obj.Person;

import java.util.HashSet;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework06 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");

        set.add(p1);
        set.add(p2);
        p1.name = "CC";
        set.remove(p1); //因为Person对象中hashCode是根据id和name进行生成的，p1的name已经变为了CC，所以hash值不同无法删除
        System.out.println(set);//{id=1001,name="CC"}, {id=1002,name="BB"}
        //虽然跟现在的p1中id和name相同，但是p1添加的时候hashCode是根据1001，
        // AA来生成的，所以能添加到一个新的结点
        set.add(new Person(1001, "CC"));
        System.out.println(set);//{id=1001,name="CC"}, {id=1002,name="BB"},{id=1001,name="CC"}
        set.add(new Person(1001, "AA"));//添加的hash跟p1相同，所以在该结点生成链表
        System.out.println(set);//id=1001,name="CC"}, {id=1002,name="BB"},{id=1001,name="CC"},{id=1001,name="AA"}
    }
}
