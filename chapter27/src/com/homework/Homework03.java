package com.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhouxufeng
 * @version 1.0
 * 对一个 url 进行解析
 * https://www.sohu.com:8080/abc/index.htm
 * 1. 要求得到的协议是什么
 * 2. 域名是什么
 * 3. 端口是什么
 * 4. 文件名是什么
 */
@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {
        String url = "https://www.sohu.com:8080/abc/eee/index.htm";
        String regStr = "^(http[s]?)://([\\w.]+):(\\d+)\\/[\\w+\\/]*\\/(\\w+\\.[a-zA-Z]+)$";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(url);
        while(matcher.find()) {
            System.out.println("协议:" + matcher.group(1));
            System.out.println("域名:" + matcher.group(2));
            System.out.println("端口:" + matcher.group(3));
            System.out.println("文件名:" + matcher.group(4));
        }
    }
}
