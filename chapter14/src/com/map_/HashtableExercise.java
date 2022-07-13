package com.map_;

import java.util.Hashtable;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashtableExercise {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("john", 100);
        //hashtable.put(null, 100);// 抛出异常
        //hashtable.put("jack", null); // 抛出异常
        hashtable.put("john", 200); // 替换
        System.out.println(hashtable);

        //简单说明一下Hashtable的底层
        // 1. 底层有数组 Hashtable$Entry[] 初始化大小为 11
        // 2. 临界值 threshold 8 = 11 * 0.75
        // 3. 扩容: 按照自己的扩容机制来进行即可
        //      1. 执行 方法 addEntry(hash, key, value, index); 添加 K-V 封装到Entry
        //      2. 当 if(count >= threshold) 满足时，就进行扩容
        //      3. 按照 int newCapacity = (oldCapacity << 1) + 1; 的大小扩容
    }
}
