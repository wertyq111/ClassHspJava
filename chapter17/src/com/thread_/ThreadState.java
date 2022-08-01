package com.thread_;

/**
 * @author zhouxufeng
 * @version 1.0
 * 线程状态
 */
@SuppressWarnings({"all"})
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        TS ts = new TS();
        System.out.println(ts.getName() + " 状态： " + ts.getState());
        ts.start();

        while (true) {
            if (ts.getState() != Thread.State.TERMINATED) {
                System.out.println(ts.getName() + " 状态： " + ts.getState());
                Thread.sleep(500);
            } else {
                break;
            }
        }

        System.out.println(ts.getName() + " 状态： " + ts.getState());
    }
}

class TS extends Thread {
    @Override
    public void run() {
        TS2 ts2 = new TS2();
        System.out.println(ts2.getName() + " 状态： " + ts2.getState());
        while (true) {
            for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    ts2.start();
                    try {
                        ts2.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("hi " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}

class TS2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
