package com.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhouxufeng
 * @version 1.0
 * Matches 类的常用方法
 */
@SuppressWarnings({"all"})
public class MatchesMethod {
    public static void main(String[] args) {
        String content = "hello jack tom hello smith hello";
        //String regStr = "hello";
        String regStr = "hello.*";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()) {
            System.out.println("=========");
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println("找到: " + content.substring(matcher.start(), matcher.end()));
        }


        //整体匹配方法,常用于去校验某个字符串是否满足某个跪着
        System.out.println("整体匹配=" + matcher.matches());


        //将 tom 改成 jerry
        regStr = "tom";
        pattern = Pattern.compile(regStr);
        matcher = pattern.matcher(content);
        //注意: 返回的字符串才是替换后的字符串,原来的 content 不变化
        String newContent = matcher.replaceAll("jerry");
        System.out.println("新的 content = " + newContent);
    }
}
