package com.homework;

import com.homework.threads.RandomNumber;
import com.homework.threads.ScannerString;

import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 * 在main方法中启动两个线程
 * 第一个线程循环随机打印100以内的整数
 * 直到第二个线程从键盘读取了"Q"命令
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) throws InterruptedException {
        RandomNumber randomNumber = new RandomNumber();
        ScannerString scannerString = new ScannerString(randomNumber);
        new Thread(randomNumber).start();
        new Thread(scannerString).start();
    }
}
