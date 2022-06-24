package com.wrapper_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class WrapperVsString {
    public static void main(String[] args) {
        //包装类(Integer)->String
        Integer i = 100;
        //方式1
        String str1 = i + "";
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);

        //String -> 包装类(Integer)
        String str4 = "123";
        //方式1
        Integer i2 = Integer.parseInt(str4);
        //方式2
        Integer i3 = new Integer(str4);
    }
}
