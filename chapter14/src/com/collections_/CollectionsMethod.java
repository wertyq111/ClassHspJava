package com.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CollectionsMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");

        System.out.println(list);
        //reverse(list): 翻转list中元素的排序
        Collections.reverse(list);
        System.out.println("反转排序：" + list);
        //shuffle(list): 对list集合元素进行随机排序
        Collections.shuffle(list);
        System.out.println("随机排序：" + list);
        //sort(list, new Comparator(){}): 根据元素的自然顺序对执行 list 集合元素按升序排序
        Collections.sort(list);
        System.out.println("从小到大排序：" + list);
        //swap(list, int i, int j): 将制定 list 集合中的 i 处元素和 j 处元素进行交换
        Collections.swap(list, 1,2);
        System.out.println("调换位置：" + list);

        //Object max(Collection): 根据元素的自然顺序,返回给定集合中的最大元素
        System.out.println("自然顺序最大元素：" + Collections.max(list));
        //Object max(Collection, Comparator): 根据Comparator 指定的顺序,返回给定集合中的最大元素
        System.out.println("比较长度最大元素：" + Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        }));
        //Object min(Collection)
        System.out.println("自然顺序最小元素：" + Collections.min(list));
        //Object min(Collection, Comparator)
        System.out.println("比较长度最小元素：" + Collections.min(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        }));
        //int frequency(Collection, Object): 返回指定集合中指定元素的出现次数
        list.add("tom");
        System.out.println(Collections.frequency(list, "tom"));
        //void copy(List dest, List src): 将src中的内容复制到dest中
        List dest = new ArrayList();
        for(int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        //目标集合需要长度与源集合一致
        Collections.copy(dest, list);
        System.out.println("复制后的list1：" + dest);
        //boolean repalceAll(List list, Object oldVal, Object newVla): 使用新值替换 List 对象的所有旧值
        System.out.println("替换结果：" + Collections.replaceAll(list, "tome", "汤姆"));
        System.out.println("替换后的list：" + list);
    }
}
