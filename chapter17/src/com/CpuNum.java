package com;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑的cpu数量
        int cpuNums = runtime.availableProcessors();
        System.out.println("当前cpu数量有: " + cpuNums + "个");
    }
}
