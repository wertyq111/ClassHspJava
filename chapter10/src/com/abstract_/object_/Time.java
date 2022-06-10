package com.abstract_.object_;

public class Time {
    public void job() {
        long start = System.currentTimeMillis();
        long num = 0;
        for (int i = 0; i < 800000; i++) {
            num += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("执行时间 " + (end - start));
    }
}
