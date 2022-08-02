package com.homework.threads;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Card implements Runnable{
    public static double balance = 10000;

    public boolean getMoney() throws InterruptedException {
        synchronized (this) {
            if(balance <= 0) {
                System.out.println(Thread.currentThread().getName() + "因为余额不足不能继续取钱了");
                return false;
            }
            balance -= 1000;

            return true;
        }
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);

                if(!getMoney()) {
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "取了1000, 剩余余额: " + balance);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
