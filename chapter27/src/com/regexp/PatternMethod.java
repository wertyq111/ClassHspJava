package com.regexp;

import java.util.regex.Pattern;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示 Pattern 方法,用于整体匹配,在验证输入的字符串是否满足条件使用
 */
@SuppressWarnings({"all"})
public class PatternMethod {
    public static void main(String[] args) {
        String content = "hell0 abc hello, 你好";
//        String regStr = "hello";
        String regStr = "hello.*";

        boolean matches = Pattern.matches(regStr, content);

        System.out.println("整体匹配 = " + matches);
    }
}
