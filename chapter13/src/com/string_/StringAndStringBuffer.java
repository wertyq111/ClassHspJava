package com.string_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class StringAndStringBuffer {
    public static void main(String[] args) {
        // String -> StringBuffer
        String str = "hello tom";

        // 方式1 使用构造器
        // 注意： 返回的才是StringBuffer对象， 对str 本身没影响
        StringBuffer stringBuffer = new StringBuffer(str);

        //方式2 使用 append 方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str).append(100);

        // StringBuffer -> String
        StringBuffer stringBuffer2 = new StringBuffer(str);
        //方式1 使用StringBuffer提供的 toString 方法
        String str1 = stringBuffer2.toString();
        System.out.println(str1);
    }
}
