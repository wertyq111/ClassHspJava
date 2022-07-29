package com.thread_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread01 thread01 = new Thread01();
        thread01.start();

        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);

            System.out.println("主线程 吃了" + (i + 1) + "个包子");

            if ((i + 1) == 5) {
                //join 让子线程插队，先执行完该线程再继续
                //thread01.join();

                //yield 让主线程礼让，不一定成功(资源充足的时候)
                thread01.yield();
            }
        }
    }
}

class Thread01 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("子线程 吃了" + (i + 1) + " 个包子");
        }
    }
}
