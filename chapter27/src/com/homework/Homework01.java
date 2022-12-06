package com.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhouxufeng
 * @version 1.0
 * 验证电子邮件格式是否合法
 * 1. 只能有一个@
 * 2. @前面是用户名,可以使 a-z A-Z 0-9 _-字符
 * 3. @后面是域名,并且域名只能是英文字母,比如 sohu.com 或者 tsinghua.org.cn
 * 4. 写出对应的正则表达式,验证输入的字符串是否为满足规则
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
        System.out.print("请输入邮箱地址:");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();

        String regStr = "^[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$";

        //说明
        //1. String 的 matches 是整体匹配,可以不带定位符
        if(email.matches(regStr)) {
            System.out.println("匹配成功");
        } else{
            System.out.println("匹配失败");
        }

    }
}
