package com.use_.ticket;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SellTicket {
    public static void main(String[] args) throws InterruptedException {
        //测试
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();

        //出现超卖的问题，票数会出现负数,也还会出现卖出票时跟别的窗口剩余票数一样
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
//
//        SellTicket02 sellTicket02 = new SellTicket02();
//        Thread thread01 = new Thread(sellTicket02);
//        Thread thread02 = new Thread(sellTicket02);
//        Thread thread03 = new Thread(sellTicket02);
//        thread01.setName("1号");
//        thread02.setName("2号");
//        thread03.setName("3号");
//        thread01.setPriority(Thread.MIN_PRIORITY);
//        thread02.setPriority(Thread.MAX_PRIORITY);
//        thread01.start();
//        thread02.join();
//        thread03.start();

        SellTicket03 sellTicket03 = new SellTicket03();
        Thread thread01 = new Thread(sellTicket03);
        Thread thread02 = new Thread(sellTicket03);
        Thread thread03 = new Thread(sellTicket03);
        thread01.setName("1号");
        thread02.setName("2号");
        thread03.setName("3号");
        thread01.start();
        thread02.start();
        thread03.start();
    }
}

@SuppressWarnings({"all"})
class SellTicket01 extends Thread {
    private static int tickeNnum = 100; //让多个线程共享 ticketNum

    @Override
    public void run() {
        while (true) {
            if (tickeNnum <= 0) {
                System.out.println("窗口" + Thread.currentThread().getName() + "售票结束...");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票，剩余票数:" + tickeNnum);
            tickeNnum--;
        }
    }
}

@SuppressWarnings({"all"})
class SellTicket02 implements Runnable {
    private static int tickeNnum = 100; //让多个线程共享 ticketNum
    private static boolean loop = true;

    public static void setLoop(boolean loop) {
        SellTicket02.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            if (tickeNnum <= 0) {
                System.out.println("窗口" + Thread.currentThread().getName() + "售票结束...");
                loop = false;
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                //当该线程执行到一个 interrupt 方法时， 就会 catche 一个异常， 可以进入自己的业务代码
                //InterruptedException 是捕获到一个中断异常
                e.printStackTrace();
            }

            System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票，剩余票数:" + tickeNnum);
            tickeNnum--;
        }
    }
}

//实现接口方式， 使用synchronized实现线程同步
class SellTicket03 implements Runnable {
    private static int ticketNum = 10000; //让多个线程共享 ticketNum

    //如果在静态方法中实现一个同步代码块
    public /*synchronized*/static void m1() { //同步静态方法
        synchronized (SellTicket03.class) { //同步静态代码块 默认锁对象：当前类.class
            System.out.println("m1");
        }
    }

    //说明
    // 1. public synchronized boolean sell() {} 就是一个同步方法
    // 2. 这时锁在 this 对象
    // 3.  也可以在代码块上写 synchronized ,同步代码块
    private /*synchronized*/ boolean sell() { //同步方法， 在同一时刻， 只能有一个线程来执行sell方法
        synchronized (this) { //同步代码块
            if (ticketNum <= 0) {
                System.out.println("窗口" + Thread.currentThread().getName() + "售票结束...");
                return false;
            }

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票，剩余票数:" + ticketNum);
            ticketNum--;

            return true;
        }
    }

    @Override
    public void run() {
        while (true) {
            if(!sell()) {
                break;
            }
        }
    }
}
