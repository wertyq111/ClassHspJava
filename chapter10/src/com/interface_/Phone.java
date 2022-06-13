package com.interface_;

public class Phone implements UsbInterface {
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机结束工作");
    }

    public void call() {
        System.out.println("正在打电话");
    }
}
