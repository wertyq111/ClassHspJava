package com.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhouxufeng
 * @version 1.0
 * 思考题: 请在字符串中检索商品编号,形式如: 12321-333999111 这样的号码,
 * 要求满足前面是一个五位数,然后一个-号,然后是一个九位数,连续的每三位要相同
 */
@SuppressWarnings({"all"})
public class RegExpExcise04 {
    public static void main(String[] args) {
        String content = "产品编号: 56765-222111777.";
        //String regStr = "(\\d)(\\d)(\\d)\\2\\1-(\\d)\\4{2}(\\d)\\5{2}(\\d)\\6{2}";
        String regStr = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
