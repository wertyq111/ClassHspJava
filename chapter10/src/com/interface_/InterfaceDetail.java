package com.interface_;

public class InterfaceDetail {
    public static void main(String[] args) {
        //创建手机和相机类
        Phone phone = new Phone();
        Camera camera = new Camera();

        //连接电脑
        Computer computer = new Computer();

        computer.work(phone);
        System.out.println("==========");
        computer.work(camera);

        System.out.println("==========");

        UsbInterface[] usbs = new UsbInterface[2];

        usbs[0] = new Phone();
        usbs[1] = new Camera();

        for (int i = 0; i < usbs.length; i++) {
            if(usbs[i] instanceof Phone) {
                ((Phone)usbs[i]).call();
            }

        }
    }
}

interface IA {
    void say();
    void hi();
}

interface IB {
    void say();
    void hello();
}

interface IC {
    void say();
    void nice();
}

class Cat implements IA { //alt + enter | option + shit + enter 填充接口必须添加的抽象方法
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

class Dog implements IA, IB, IC {
    @Override
    public void say() {

    }

    @Override
    public void nice() {

    }

    @Override
    public void hello() {

    }

    @Override
    public void hi() {

    }
}
