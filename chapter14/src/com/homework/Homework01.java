package com.homework;

import com.homework.obj.News;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 * 按要求实现：
 * （1）封装一个新闻类，包含标题和内容属性，提供get、set方法，重写toString方法，打印对象时只打印标题；
 * （2）只提供一个带参数的构造器，实例化对象时，只初始化标题；并且实例化两个对象：
 *  新闻一：新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧
 *  新闻二：男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生
 * （3）将新闻对象添加到ArrayList集合中，并且进行倒序遍历；
 * （4）在遍历集合过程中，对新闻标题进行处理，超过15字的只保留前15个，然后在后边加 "..."
 * （5）在控制台打印遍历出经过处理的新闻标题
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
        News news = new News("新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧");
        News news1 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        List list = new ArrayList();
        list.add(news);
        list.add(news1);

        //倒序遍历
        Collections.reverse(list);

        for(Object l:list) {
            if(((News) l).getTitle().length() > 15) {
                ((News) l).setTitle(processTitle(((News) l).getTitle()));
            }

            System.out.println(((News) l));
        }
    }

    public static String processTitle(String title) {
        if(title == null) {
            return "";
        }

        if(title.length() > 15) {
            title = title.substring(0, 15) + "...";
        }

        return title;
    }
}
