package com.set_;

import java.util.Arrays;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetStructure {
    public static void main(String[] args) {
        //模拟一个HashSet的底层(HashMap 的底层结构)

        // 1. 创建一个数组，数组的类型是Node[]
        // 2. 也可以把 Node[] 数组称为 表
        Node[] table = new Node[16];
        System.out.println("table:" + table);
        // 3. 创建结点
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;//将jack结点挂载到john
        Node rose = new Node("Rose", null);
        jack.next = rose;//将rose结点挂载到jack
        System.out.println("table:" + table);

    }
}

class Node { //结点， 存储数据，可以指向下一个结点， 从而形成单向链表
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
