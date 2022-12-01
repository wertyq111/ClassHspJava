package com.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class RegExpExcise {
    public static void main(String[] args) {
        String content = "a11c8 a_B@C";

        //String regExpStr = "[a-z]"; //匹配 a-z 之间任意一个字符
        //String regExpStr = "[A-Z]"; //匹配 A-Z 之间任意一个字符
        //String regExpStr = "abc"; //匹配 abc 字符串[默认区分大小写]
        //String regExpStr = "(?i)abc"; //匹配 abc 字符串[不区分大小写]
        //String regExpStr = "a(?i)bc"; //匹配 abc 字符串[不区分 bc 大小写]
        //String regExpStr = "a((?i)b)c"; //匹配 abc 字符串[不区分 b 大小写]
        //String regExpStr = "a((?i)b)c"; //匹配 abc 字符串[不区分 b 大小写]
        //String regExpStr = "[abcd]"; //匹配 abcd 中任意一个字符
        //String regExpStr = "[^abcd]"; //匹配 abcd 中任意一个字符
        //String regExpStr = "\\w"; //匹配 数字,字母,下划线 中任意一个字符
        //String regExpStr = "\\W"; //匹配非数字,字母,下划线 中任意一个字符
        //String regExpStr = "\\s"; //匹配空字符
        //String regExpStr = "\\S"; //匹配非空字符
        String regExpStr = "."; //匹配除\n之外的所有任意字符


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
