package com.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhouxufeng
 * @version 1.0
 * 元字符练习
 */
@SuppressWarnings({"all"})
class RegExpExcise01 {
    public static void main(String[] args) {
        String content = "a11c8 a_B@Cmabcabc abcabcabc";

        //字符匹配符
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
        //String regExpStr = "."; //匹配除\n之外的所有任意字符

        //选择匹配符
        //String regExpStr = "ab|bc"; //匹配 ab 或者 bc

        //限定符
        //细节: java匹配默认贪婪匹配,即竟可能匹配多的
        //String regExpStr = "(abc)*"; //匹配仅包含任意个 abc 的字符串
        //String regExpStr = "(abc)+"; //匹配仅包含至少一次 abc 的字符串
        //String regExpStr = "m+abc?"; //至少一次 m 后接任意 ab 或 abc
        //String regExpStr = "[abc]{3}"; //匹配abc组成的长度 3 的字符串
        //String regExpStr = "[abc]{3,}"; //匹配abc组成的长度大于等于 3 的字符串
        //String regExpStr = "[abc]{3,4}"; //匹配abc组成的长度大于等于 3 小于等于 4 的字符串
        //非贪婪匹配,匹配尽可能的短的字符
        String regExpStr = "(abc)+?"; //匹配仅包含任意个 ab 的字符串

        //定位符
        //String regExpStr = "^[ab]+[a-z]*"; //匹配以至少 ab 中的 1 个字母开头,后接任意小写字母的字符串
        //String regExpStr = "^[ab](.)+[a-z]$"; //匹配以至少 ab 中的 1 个字母开头,接任意个任意字符,后接任意小写字母结束的字符串
        //String regExpStr = "bc\\b"; //匹配bc后面是空格或者 bc 结尾的的字符串, 表示匹配bc边界
        //String regExpStr = "bc\\B"; //匹配bc后面是非空格或者 bc 非结尾的的字符串, 表示匹配bc非边界



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
