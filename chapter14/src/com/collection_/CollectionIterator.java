package com.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("西游记", "吴承恩", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 8.1));
        col.add("2222");

        //System.out.println("col=" + col);
        //遍历col集合
        // 1. 先得到col对应的迭代器
        Iterator it = col.iterator();
//        while(it.hasNext()) {
//            //返回下一个元素，类型是Object
//            Book book = (Book)it.next();
//            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getPrice());
//        }
        //快捷键快速生成whil循环
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println("obj = " + next);
        }

        //3. 当退出while循环后，这是iterator迭代器，指向最后的元素
        //it.next();//NoSuchElementException异常
        //4. 如果需要再次遍历，需要重置我们的迭代器
        it = col.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println("obj2 = " + next);
        }

        //增强for
        // 1. 使用增强for， 再Collection集合中，可以使用增强for遍历集合中的元素
        // 2. 底层仍然是迭代器
        // 3. 快捷键方式 I
        for (Object o : col) {
            System.out.println("obj3 = " + o);
        }
    }
}
@SuppressWarnings({"all"})
class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
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
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
