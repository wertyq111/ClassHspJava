package com.homework;

import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 * 输入用户名，密码，邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
 * 要求：
 * 1. 用户长度为2/3/4
 * 2. 密码的长度为6， 要求全是数字
 * 3. 邮箱中包含@和. 并且@在.的前面 isDigital
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入用户名");
        String login = scanner.next();

        System.out.println("请输入密码");
        String passwd = scanner.next();

        System.out.println("请输入邮箱");
        String email = scanner.next();

        try {
            register(login, passwd, email);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void register(String login, String passwd, String email) {
        //验证参数
        if (!(login != null && passwd != null && email != null)) {
            throw new RuntimeException("参数不能为空");
        }
        //用户长度为2/3/4
        if (!(login.length() >= 2 && login.length() <= 4)) {
            throw new RuntimeException("用户名长度不正确");
        }

        //密码的长度为6， 要求全是数字
        if (!((passwd.length() == 6 && isDigital(passwd)))) {
            throw new RuntimeException("密码格式不正确");
        }

        //邮箱中包含@和. 并且@在.的前面 isDigital
        if (!isEmail(email)) {
            throw new RuntimeException("邮箱格式不正确");
        }

        System.out.println("注册成功");
    }

    public static boolean isDigital(String num) {
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!(chars[i] >= '0' && chars[i] <= '9')) {
                return false;
            }
        }

        return true;
    }

    public static boolean isEmail(String email) {
        int index1 = email.indexOf("@");
        int index2 = email.indexOf(".");
        if (index1 > 0 && index2 > 0 && index2 > index1) {
            return true;
        } else {
            return false;
        }
    }
}
