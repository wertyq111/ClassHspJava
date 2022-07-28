package com.use_;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示通过继承Thread 类创建线程
 */
@SuppressWarnings({"all"})
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //创建Cat对象， 可以当做线程使用
        Cat cat = new Cat();
        cat.start();//启动线程 -> 最终会执行Cat的run方法
        //cat.run();//run方法就是一个普通的方法，没有真正的启动一个线程， 就会把run执行完毕才向下执行
        //说明：当main线程启动一个子线程 Thread-0， 主线程不会阻塞，会继续执行

        Dog dog = new Dog();
        //创建Thred对象，把 doy对象(实现Runnable接口)放入Thread
        //底层使用了设计模式[代理模式]
        Thread threadDog = new Thread(dog);
        threadDog.start();

        new Thread(new Runnable() {
            private int times;

            @Override
            public void run() {
                while(true) {
                    System.out.println("匿名内部类" + (++times) + ",线程名称"+Thread.currentThread().getName());

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if(times == 10) {
                        break;
                    }
                }
            }
        }).start();


        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程 i=" + i);
            //让主线程休眠
            Thread.sleep(1000);
        }
    }
}

//1. 当一个类继承了 Thread 类， 该类就可以当做线程使用
//2. 我们会重写 run 方法， 协商自己的业务代码
//3. run Thread 类 实现了 Runnable 接口的 run 方法
/*
     @Override
     public void run() {
         if (target != null) {
            target.run();
         }
     }
 */
@SuppressWarnings({"all"})
class Cat extends Thread {
    int times;
    @Override
    public void run() {
        while(true) {
            System.out.println("喵喵，我是小猫咪, 线程名=" + Thread.currentThread().getName());
            //让该线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(++times == 8) {
                break; //当 times 到8，退出while， 这时线程也就退出了
            }
        }
    }
}

@SuppressWarnings({"all"})
class Dog implements Runnable {
    int times;
    @Override
    public void run() {
        while(true) {
            System.out.println("汪汪，我是小狗狗, 线程名=" + Thread.currentThread().getName());
            //让该线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(++times == 5) {
                break; //当 times 到8，退出while， 这时线程也就退出了
            }
        }
    }
}
