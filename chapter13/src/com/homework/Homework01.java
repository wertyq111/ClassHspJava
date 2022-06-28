package com.homework;

/**
 * @author zhouxufeng
 * @version 1.0
 * 将字符串中制定部分进行翻转，比如将"abcdef" 反转为"aedcbf"
 * 编写方法 public static String reverse(String str, int start, int end)搞定
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
        String str = "abcdef";
        try {
            System.out.println(reverse(str, 1, 4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String reverse(String str, int start, int end) {
        //对输入的参数做一个验证
        // 1. 写出正确的情况
        // 2. 然后取反即可
        if(!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
//        StringBuilder sb = new StringBuilder();
//        StringBuilder str1 = new StringBuilder(str);
//        for (int i = start; i <= end; i++) {
//            sb.append(str.charAt(i));
//        }
//        str1.replace(start, end + 1, sb.reverse().toString());
//        return str1.toString();
        char[] chars = str.toCharArray();
        char temp;
        for (int i = 0; i < (int)Math.ceil((double)(end - start) / 2); i++) {
            temp = chars[start + i];
            chars[start + i] = chars[end - i];
            chars[end - i] = temp;
        }
        return new String(chars);
    }
}
