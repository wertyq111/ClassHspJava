package com.string_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class String01 {
    public static void main(String[] args) {
        // 1. String 对象用于保存字符串，也就是一组字符序列
        // 2. "jack"字符串常量， 双引号括起的字符序列
        // 3. 字符串的字符使用Unicode字符编码，一个字符(不区分字母还是汉字)占两个字节
        // 4. String 类又很多构造器，构造器的重载
        //     常用的有
        //         String str1 = new String();
        //         String str2 = new String(String original);
        //         String str3 = new String(char[] a);
        //         String str4 = new String(char[] a, int startIndex. int count);
        //         String str5 = new Srting(byte[] b);
        // 5.String 类实现了接口 Serializable [String 可以串行化:可以在网络传输]
        //                 接口 Comparable [String 对象可以比较大小]
        // 6. String 是 final 类，不能被其他的类继承
        // 7.String 有属性 private final char value[]; 用于存放字符串内容
        // 8.一定要注意： value 是一个 final 类型， 不可以修改: 即value不能指向新的地址，但是单个字符内容是可以变化

        String name = "jack";
        name = "tom";

        final char[] value = {'t', 'o', 'm'};
        char[] v2 = {'j', 'a', 'c', 'k'};

        //value = v2; //地址不能被修改
    }
}
