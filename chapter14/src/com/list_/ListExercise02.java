package com.list_;

import java.util.*;

/**
 * @author zhouxufeng
 * @version 1.0
 * 使用List的实现类添加三本图书并遍历
 * 要求：
 *  1. 按价格排序，从低到高(使用冒泡排序)
 *  2. 要求使用ArrayList, LinkedList 和 Vector三种集合实现
 *  3. 结论，主要说明，只要实现了List接口，nameList的实现类都可以使用List接口中的方法
 */
@SuppressWarnings({"all"})
public class ListExercise02 {
    public static void main(String[] args) {
        //List list = new ArrayList();
        List list = new LinkedList();
        //List list = new Vector();

        list.add(new Book("Java编程思想", "Bruce Eckel", 79));
        list.add(new Book("Head First Java", "Kathy Sierra", 99));
        list.add(new Book("Effective Java", "Joshua Bloch", 49));
        System.out.println("===原始数据===");
        System.out.println(list);

        list.remove(new Book("Head First Java", "Kathy Sierra", 99));

//        list.sort(new Comparator(){
//            @Override
//            public int compare(Object o1, Object o2) {
//                double p1 = ((Book)o1).getPrice();
//                double p2 = ((Book)o2).getPrice();
//                return (p1 < p2) ? -1 : (p1 > p2) ? 1 : 0;
//            }
//        });

        list = bulletSort(list);

        for(Object b: list){
            System.out.println(String.format("名称：%s  价格：%.2f  作者：%s",
                    ((Book)b).getName(),
                    ((Book)b).getPrice(),
                    ((Book)b).getAuthor()
            ));
        }
    }

    public static List bulletSort(List list){
        int listSize = list.size();
        for(int i = 0; i < listSize - 1; i++){
            for(int j = 0; j < listSize - 1 - i; j++){
                if(((Book)list.get(j)).getPrice() > ((Book)list.get(j + 1)).getPrice()){
                    Object temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }
}

@SuppressWarnings({"all"})
class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
