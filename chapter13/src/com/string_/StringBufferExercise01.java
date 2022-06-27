package com.string_;

/**
 * @author zhouxufeng
 * @version 1.0
 *
 */
@SuppressWarnings({"all"})
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());// 输出4

        System.out.println(sb); // 输出 null
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1); // 输出异常 NullPointerException
    }
}
