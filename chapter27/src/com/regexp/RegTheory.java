package com.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhouxufeng
 * @version 1.0
 * 分析 java 的正则表达式底层实现原理
 */
@SuppressWarnings({"all"})
public class RegTheory {
    public static void main(String[] args) {
        String content = "1998年12月8日，第二代Java平台的企业版J2EE发布。" +
                "1999年6月，Sun公司发布了第二代Java平台（简称为Java2）的3个版本：J2ME（Java2 Micro Edition，Java2平台的微型版），" +
                "应用于移动、无线及有限资源的环境；J2SE（Java 2 Standard Edition，Java 2平台的标准版），" +
                "应用于桌面环境；J2EE（Java 2Enterprise Edition，Java 2平台的企业版），应用于基于Java的应用服务器。Java 2平台的发布，" +
                "是Java发展过程中最重要的一个里程碑，标志着Java的应用开始普及9989。";

        //例子: 请找出所有四个数字连载一起的字串.比如: 1998 1999 9989
        //1. \\d 表示一个任意数字
        //String regExpStr = "\\d\\d\\d\\d";
        // (1) 什么是分组?正则表达式中有(),表示分组,第一个()表示第一组,第二个()表示第二组以此类推
        String regExpStr = "(\\d\\d)(\\d\\d)";
        //2. 创建模式对象[即正则表达式对象]
        Pattern pattern = Pattern.compile(regExpStr);
        //3. 创建匹配器
        Matcher matcher = pattern.matcher(content);
        //4. 循环匹配
        while(matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
