package com.extend.exercise;

public class PC extends Computer{
    private String brand;

    public PC() {
    }

    public PC(String cpu, String memory, String hardDisk, String brand) {
        super(cpu, memory, hardDisk);
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void showPC() {
        Computer computer = this.getDetails();
        System.out.println("PC品牌：" + this.getBrand());
        System.out.println("CPU：" + computer.getCpu());
        System.out.println("内存：" + computer.getMemory());
        System.out.println("硬盘：" + computer.getHardDisk());
    }
}
