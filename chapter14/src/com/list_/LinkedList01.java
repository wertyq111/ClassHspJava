package com.list_;

/**
 * @author zhouxufeng
 * @version 1.0
 * 简单的双向链表演示
 */
@SuppressWarnings({"all"})
public class LinkedList01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node mary = new Node("mary");
        Node jerry = new Node("jerry");
        Node hanmeimei = new Node("韩梅梅");
        Node lilei = new Node("李雷");

        //连接3个节点，形成双向链表
        jack.next = tom;
        tom.next = mary;
        mary.next = jerry;
        jerry.next = hanmeimei;
        hanmeimei.next = lilei;

        tom.prev = jack;
        mary.prev = tom;
        jerry.prev = mary;
        hanmeimei.prev = jerry;
        lilei.prev = hanmeimei;

        Node first= jack; //让first引用指向jack，就是双向链表的头节点
        Node last = lilei; //让last引用指向lilei，就是双向链表的尾节点

        //演示 从头到尾进行遍历
        System.out.println("===从头到尾遍历===");
        firstShow(first);
        System.out.println("===从尾到头遍历===");
        lastShow(last);

        //演示 链表的添加/删除操作
        System.out.println("===添加节点===");
        Node simth = new Node("simth");
        tom.next = simth;
        mary.prev = simth;
        simth.prev = tom;
        simth.next = mary;
        firstShow(first);

        System.out.println("===删除节点===");
        mary.next = hanmeimei;
        hanmeimei.prev = mary;
        firstShow(first);

    }

    public static void firstShow(Node first) {
        while(true) {
            if(first == null) {
                break;
            }

            System.out.println(first.item);
            first = first.next;
        }
    }

    public static void lastShow(Node last) {
        while(true) {
            if(last == null) {
                break;
            }

            System.out.println(last.item);
            last = last.prev;
        }
    }
}

//定义一个Node 类， Node 对象表示双向链表的一个节点
class Node {
    public Object item; // 存放数据
    public Node next; // 存放下一个节点的地址
    public Node prev; // 存放上一个节点的地址

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}
