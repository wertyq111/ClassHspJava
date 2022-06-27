package com.string_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class StringBuffer02 {
    public static void main(String[] args) {

        // 创建一个 大小为16 的char[], 用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();

        // 通过构造器制定 char[] 大小 创建StringBuffer
        StringBuffer stringBuffer1 = new StringBuffer(100);

        // 通过 给一个 String 创建StringBuffer， char[] 大小就是String的长度 + 16
        StringBuffer hello = new StringBuffer("hello");


    }
}
