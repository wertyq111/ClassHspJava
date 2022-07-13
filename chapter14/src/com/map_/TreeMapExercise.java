package com.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TreeMapExercise {
    public static void main(String[] args) {
        //TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 按照传入的 k(String) 的大小进行排序
                //return ((String) o2).compareTo((String) o1);
                // 按照长度排序, 相同长度的key不能添加到数组中
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        treeMap.put("jack", "杰克");
        treeMap.put("john", "约翰");
        treeMap.put("mary", "玛丽");
        treeMap.put("simth", "史密斯");
        treeMap.put("christina", "克里斯提那");
        treeMap.put("tom", "汤姆");

        System.out.println(treeMap);
    }
}
