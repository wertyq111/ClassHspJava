package com.object_;

import com.object_.object_.Monster;

public class ToString_ {
    public static void main(String[] args) {
        /**
         *     public String toString() {
         *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
         *     }
         */

        Monster monster = new Monster("小妖怪！");
        System.out.println(monster.toString());
        System.out.println("==当直接输出一个对象时,toString 方法会被默认的调用==");
        System.out.println(monster);
    }
}
