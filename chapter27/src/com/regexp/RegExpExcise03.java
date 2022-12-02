package com.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhouxufeng
 * @version 1.0
 * 正则应用实例
 *
 */
@SuppressWarnings({"all"})
public class RegExpExcise03 {
    public static void main(String[] args) {
        String content = "https://www.google.com.hk/webhp?hl=zh-CN&sa=X&ved=0ahUKEwjs66T9lNr7AhVhNEQIHbENAn4QPAgI";
        //对字符串进项如下验证
        // 1. 汉字
        //String regExpStr = "^[\u0391-\uffe5]+$";
        // 2. 邮政编码.要求: 是 1-9 开头的一个六位数. 比如:123890
        //String regExpStr = "^[1-9]\\d{5}$";
        // 3. QQ 号码.要求: 是 1-9 开头的一个(5位数-10 位数). 比如:123890
        //String regExpStr = "^[1-9]\\d{4,9}$";
        // 4. 手机号码.要求: 是 13,14,15,17,19 开头的一个 11 位数.
        //String regExpStr = "^(?:13|14|15|17|19)\\d{9}$";
        // 5. url. https://www.google.com.hk/webhp?hl=zh-CN&sa=X&ved=0ahUKEwjs66T9lNr7AhVhNEQIHbENAn4QPAgI
        String regExpStr = "^(http[s]?:\\/\\/)([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";


        //说明
        // 1. 当创建 Pattern 对象时, 指定 Pattern.CASE_INSENSITIVE, 表示匹配是不区分子大小写
        Pattern pattern = Pattern.compile(regExpStr);
        //Pattern pattern = Pattern.compile(regExpStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);

        if(matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
    }
}
