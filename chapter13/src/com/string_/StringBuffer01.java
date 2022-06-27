package com.string_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class StringBuffer01 {
    public static void main(String[] args) {
        //解读：
        // 1. StringBuffer 的直接父类是 AbstractStringBuilder
        // 2. StringBuffer 实现了 Serializable, 即 StringBuffer 的对象可以串行化(对象可以网络传输， 可以保存到文件)
        // 3. 在父类中 AbstractStringBuilder 有属性 char[], value, 不是final
        //    该value 数组存放字符串内容，引出存放在堆中的
        // 4. StringBuffer 是一个 final类，不能被继承
        // 5. 因为 StringBuffer 字符内容是存在父类 AbstractStringBuilder 的 char[] value， 所有在变化(增加 / 删除)
        //    不用每次都更换地址(即不是每次创建新对象), 所以效率高于String
        StringBuffer stringBuffer = new StringBuffer();
    }
}
