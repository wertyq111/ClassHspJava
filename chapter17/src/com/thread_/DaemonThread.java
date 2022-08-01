package com.thread_;

/**
 * @author zhouxufeng
 * @version 1.0
 * 守护线程
 */
@SuppressWarnings({"all"})
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        Thread daemonThread = new Thread(myDaemonThread);
        //设置为守护线程，主线程结束后自动结束
        daemonThread.setDaemon(true);
        daemonThread.start();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("我在辛勤的工作...");
        }

    }
}

class MyDaemonThread implements Runnable{
    @Override
    public void run() {
        for(;;) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("我在勤勤恳恳的守护着你~~~");
        }
    }
}
