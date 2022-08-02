package com.homework;

import com.homework.threads.Card;

/**
 * @author zhouxufeng
 * @version 1.0
 * 有2个用户分别从一个卡上取钱 (总额: 10000)
 * 每次都取1000，当余额不足时，就不能取款了
 * 不能出现超取现象(线程同步问题)
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        Card card = new Card();

        Thread customer1 = new Thread(card);
        Thread customer2 = new Thread(card);
        customer1.setName("A");
        customer2.setName("B");

        customer1.start();
        customer2.start();
    }
}
