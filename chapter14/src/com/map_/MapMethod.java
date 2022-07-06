package com.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("张三", "孙艺伟");
        map.put("王宝强", "孙悦");
        map.put("李四", "孙武");
        map.put(null, "赵五");

        System.out.println("map=" + map);

        //put: 添加
        map.put("鹿晗", "关晓彤");
        System.out.println("演示put: " + map);
        //remove: 根据键删除映射关系
        map.remove(null);
        System.out.println("演示remove: " + map);
        //get: 根据键获取值
        System.out.println("演示get: " + map.get("邓超"));
        //size: 获取元素个数
        System.out.println("演示size: " + map.size());
        //isEmpty: 判断个数是否为0
        System.out.println("演示isEmpty: " + map.isEmpty());
        //containskey: 查找键是否存在
        System.out.println("演示containskey: " + map.containsKey("邓超"));
        //clear: 清除
        //map.clear();
        System.out.println("演示clear" + map);

        //遍历
        Set keySet = map.keySet();
        System.out.println("===增强for===");
        for(Object key : keySet) {
            System.out.println(key + "=" + map.get(key));
        }

        System.out.println("===迭代地===");
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "=" + map.get(key));
        }

        Set entrySet = map.entrySet();
        System.out.println("===增强for===");
        for(Object entry : entrySet) {
            Map.Entry m = (Map.Entry)entry;

            System.out.println(m.getKey() + "=" + m.getValue());
        }

        System.out.println("===迭代地===");
        Iterator iterator1 = entrySet.iterator();
        while(iterator1.hasNext()) {
            Map.Entry m = (Map.Entry)iterator1.next();

            System.out.println(m.getKey() + "=" + m.getValue());
        }
    }
}
