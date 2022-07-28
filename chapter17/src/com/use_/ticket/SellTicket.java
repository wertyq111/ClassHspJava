package com.use_.ticket;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SellTicket {
    public static void main(String[] args) {
        //测试
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();

        //出现超卖的问题，票数会出现负数,也还会出现卖出票时跟别的窗口剩余票数一样
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();

        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
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
