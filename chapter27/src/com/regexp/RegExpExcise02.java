package com.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhouxufeng
 * @version 1.0
 * 分组练习
 */
@SuppressWarnings({"all"})
public class RegExpExcise02 {
    public static void main(String[] args) {
        String content = "jkaslfj s7789 kla231jk";

        //常用分组
        //说明
        // 1. matcher.group(0) 得到匹配到的字符串
        // 2. matcher.group(1) 得到匹配到的字符串的第 1 个分组内容
        // 2. matcher.group(2) 得到匹配到的字符串的第 2 个分组内容
        //String regExpStr = "(\\d\\d)(\\d\\d)";

        //命名分组
        // 通过组名获取 matcher.group("name1");
        //String regExpStr = "(\\d\\d)(?<name1>\\d\\d)";


        //特殊分组(非捕获分组)
        // 不会捕获到分组当中,不能使用 matcher.group(1)
        content = "Java学习 Java课程 Java大纲";
        //指定条件的或
        //String regExpStr = "Java(?:学习|课程|大纲)";
        //指定条件下的字符串,只找到 2 个
        //String regExpStr = "Java(?=课程|大纲)";
        //不同于指定条件下的字符串,只找到 1 个
        String regExpStr = "Java(?!课程|大纲)";

        //说明
        // 1. 当创建 Pattern 对象时, 指定 Pattern.CASE_INSENSITIVE, 表示匹配是不区分子大小写
        Pattern pattern = Pattern.compile(regExpStr);
        //Pattern pattern = Pattern.compile(regExpStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);

        while(matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
