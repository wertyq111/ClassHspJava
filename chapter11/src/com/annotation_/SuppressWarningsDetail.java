package com.annotation_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 */
public class SuppressWarningsDetail {
    // 1. @SuppressWarnings 注解表示忽略某些警告。
    // 2. 在{""}中，可以写入多个警告的属性名称。
    // 3. 作用范围适合你放置的位置相关。
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("jerry");
        int i;
    }
}


