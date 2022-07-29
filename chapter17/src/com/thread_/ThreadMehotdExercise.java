package com.thread_;

/**
 * @author zhouxufeng
 * @version 1.0
 * 主线程每隔 1s 输出 hi ，一共10次
 * 当输出到 hi 5次后，启动一个子线程(要求实现Runnable)， 每隔 1s 输出 hello ， 等该线程输出10次 hello 后，退出
 * 主线程继续输出 hi ， 知道主线程退出
 */
@SuppressWarnings({"all"})
public class ThreadMehotdExercise {
    public static void main(String[] args) throws InterruptedException {
        Thread thread01 = new Thread(new T());

        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
            if(i == 5) {
                thread01.start();
                thread01.join();
            }
        }
        System.out.println("主线程结束");
    }
}

@SuppressWarnings({"all"})
class T implements Runnable {
    private static boolean loop = true;
    private static int num = 0;

    @Override
    public void run() {
        while(loop) {
            System.out.println("hello " + (++num));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(num == 10) {
                loop = false;
                System.out.println("子线程结束");
            }
        }
    }
}
