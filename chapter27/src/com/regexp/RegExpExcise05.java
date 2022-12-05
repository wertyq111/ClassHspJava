package com.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhouxufeng
 * @version 1.0
 * 经典的结巴程序
 * 把类似"我...我要...学学学学...编程 java"通过正则表达式修改成"我要学变成 java"
 */
@SuppressWarnings({"all"})
public class RegExpExcise05 {
    public static void main(String[] args) {
        //思路
        // 1. 先去掉.符号
        // 2. 再去掉重复的字
        String content = "我...我要...学学学学...编程 java";
        String regStr = "\\.";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        String s = matcher.replaceAll("");
        regStr = "(.)\\1+";
        pattern = Pattern.compile(regStr);
        matcher = pattern.matcher(s);
        // 使用反向引用来替换匹配到的字符串
        s = matcher.replaceAll("$1");
        System.out.println(s);

        //使用一条语句 去掉重复的字
        System.out.println(Pattern.compile(regStr).matcher(s).replaceAll("$1"));
    }
}
