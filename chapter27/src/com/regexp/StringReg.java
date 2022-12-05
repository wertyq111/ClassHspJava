package com.regexp;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class StringReg {
    public static void main(String[] args) {
        //替换功能
        String content = "2000年5月，JDK1.3、JDK1.4和J2SE1.3相继发布，几周后其获得了Apple公司Mac OS X的工业标准的支持。" +
                "2001年9月24日，J2EE1.3发布。2002年2月26日，J2SE1.4发布。自此Java的计算能力有了大幅提升，" +
                "与J2SE1.3相比，其多了近62%的类和接口。" +
                "在这些新特性当中，还提供了广泛的XML支持、安全套接字（Socket）支持（通过SSL与TLS协议）、" +
                "全新的I/OAPI、正则表达式、日志与断言。";

        String regStr = "(JDK)1\\.(?:3|4)";

        String s = content.replaceAll(regStr, "$1");
        System.out.println("替换后的字符串 = " + s);

        //判断功能 - 验证手机号是否是 138,139 开头的
        System.out.println("==========");
        content = "13888631304";
        System.out.println("是否是正确的手机号: " + content.matches("^1(?:38|39)\\d{8}"));

        //分割功能 - 按照#或者-或者~或者数字来分割
        System.out.println("==========");
        content = "hello#abc-jack12smith~杭州";
        String[] strings = content.split("#|-|~|\\d+");
        for(String ss:strings) {
            System.out.println(ss);
        }
    }
}
