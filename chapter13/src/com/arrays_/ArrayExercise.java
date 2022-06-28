package com.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zhouxufeng
 * @version 1.0
 * 自定义Book类， 里面包含 name 和price，
 * 按 price 排序(从大到小)。
 * 要求使用两种方式排序，对对象的某个属性排序，
 * 有一个Booke[] books = 5 本书对象
 * 使用学习过的传递实现Comparator接口匿名内部类，也称为定制排序
 */
@SuppressWarnings({"all"})
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("java", 100);
        books[1] = new Book("python", 90);
        books[2] = new Book("php", 200);
        books[3] = new Book("c++", 180);
        books[4] = new Book("c", 500);

        // 对象的价格从小到大排序
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double p1 = o1.getPrice();
                double p2 = o2.getPrice();

                return (p1 > p2) ? 1 : (p1 < p2) ? -1 : 0;
            }
        });
        System.out.println(Arrays.toString(books));


        // 对象的价格从大到小排序, 不使用泛型(还没有学到)
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double p1 = ((Book)o1).getPrice();
                double p2 = ((Book)o2).getPrice();

                return (p2 > p1) ? 1 : (p2 < p1) ? -1 : 0;
            }
        });
        System.out.println(Arrays.toString(books));


        // 对象的书名长度从大到小排序
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int l1 = o1.getName().length();
                int l2 = o2.getName().length();

                return (l2 > l1) ? 1 : (l2 < l1) ? -1 : 0;
            }
        });

        System.out.println(Arrays.toString(books));
    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名：" + name + ", 价格：" + price;
    }
}
