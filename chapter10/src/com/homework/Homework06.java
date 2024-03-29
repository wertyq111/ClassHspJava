package com.homework;

import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 * 1. 有一个交通工具接口类 Vehicles, 有 work 方法
 * 2. 有 Horse 类和 Boat 类分辨实现 Vehicles
 * 3. 创建交通工具工厂类, 有两个方法分别获的交通工具 Horse 和 Boat
 * 4. 有 Person 类 有 name 和 Vehicles 属性, 在构造器中为两个属性赋值
 * 5. 实例化 Person 对象"唐僧", 要求一般情况下用 Horse 作为交通工具, 遇到大河时用 Boat 作为交通工具
 */
@SuppressWarnings({"all"})
public class Homework06 {
    public static void main(String[] args) {
        Person tangsen = new Person("唐僧", new Horse());

        Scanner scanner = new Scanner(System.in);

        while(true) {
            String way = scanner.next();

            if("大河".equals(way) && !(tangsen.getVehicles() instanceof Boat)) {
                tangsen.setVehicles(VehiclesFactory.getBoatInstance());
            } else if("火焰山".equals(way) && !(tangsen.getVehicles() instanceof Plane)) {
                tangsen.setVehicles(VehiclesFactory.getPlaneInstance());
            }else if(!(tangsen.getVehicles() instanceof Horse)) {
                tangsen.setVehicles(VehiclesFactory.getHorseInstance());
            }

            tangsen.learnToWest();
        }
    }
}

interface Vehicles {
    void work();
}

class VehiclesFactory {
    //马始终是同一匹
    private static Horse horse = new  Horse(); //饿汉式

    public static Horse getHorseInstance() {
        return horse;
    }

    public static Boat getBoatInstance() {
        Boat boat = new Boat();
        return boat;
    }

    public static Plane getPlaneInstance() {
        Plane plane = new Plane();
        return plane;
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public void learnToWest() {
        if(vehicles instanceof Horse) {
            VehiclesFactory.getHorseInstance().work();
        }else if(vehicles instanceof Boat) {
            VehiclesFactory.getBoatInstance().work();
        }else if(vehicles instanceof Plane) {
            VehiclesFactory.getPlaneInstance().work();
        }
    }

}

class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("现在正在用马赶路");
    }
}

class Boat implements Vehicles {

    @Override
    public void work() {
        System.out.println("现在正在用船赶路");
    }
}

class Plane implements Vehicles {

    @Override
    public void work() {
        System.out.println("现在正在用飞机赶路");
    }
}
