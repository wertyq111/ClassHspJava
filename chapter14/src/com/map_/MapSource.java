package com.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MapSource {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "张无忌");
        map.put("no2", "张三丰");

        //解读:
        // 1. k-V 最后是 HashMap$Node node= newNode (hash, key, value, null)
        // 2.k-y 为了方便程序员的遍历，还会 创建 Entryset 集合，该集合存放的元素的类型 Entry，
        //   而一个Entry对象就有k,V EntrySet<Entry<K,V>＞即： transient Set -Map .Entry-k, V>>entryset;
        // 3.entryset 中，定义的类型是 Map.Entry，但是实际上存放的还是 HashMap$Node
        //   这是因为 HashMap$Node implements Map.Entry
        // 4.当把 HashMap$Node 对象 存放到 entrySet 就方便我们的遍历啊，因为 Map.Entry 提供了重要方法
        //   K getKey(); V getValue();

        Set set = map.entrySet();
        System.out.println(set.getClass());//HashMap$EntrySet
        for(Object obj : set) {
            System.out.println(obj.getClass());//HashMap$Node
            //向下转型 取出Hash$Node中对应的值
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        Set set1 = map.keySet();
        System.out.println(set1.getClass());

        Collection values = map.values();
        System.out.println(values.getClass());
    }
}
