package com.collection_;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Collection {
    public static void main(String[] args) {
        //解读
        // 1. 集合主要是两组(单列集合, 双列集合)
        // 2. Collection 接口有两个重要的子接口 List Set, 他们的实现子类都是单列集合
        // 3. Map接口的实现子类是双列集合, 存放的K-V
        //Collection
        //Map

        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tim");

        HashMap hashMap = new HashMap();
        hashMap.put("No1", "北京");
        hashMap.put("No2", "上海");
    }
}
