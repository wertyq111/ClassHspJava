package com.extend.exercise;

public class NotePad extends Computer{
    private String color;

    public NotePad() {
    }

    public NotePad(String cpu, String memory, String hardDisk, String color) {
        super(cpu, memory, hardDisk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showNotePad() {
        Computer computer = this.getDetails();
        System.out.println("笔记本颜色：" + this.getColor());
        System.out.println("CPU：" + computer.getCpu());
        System.out.println("内存：" + computer.getMemory());
        System.out.println("硬盘：" + computer.getHardDisk());
    }
}
