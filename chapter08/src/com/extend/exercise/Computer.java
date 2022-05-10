package com.extend.exercise;

public class Computer {
    private String cpu;
    private String memory;
    private String hardDisk;

    public Computer() {
    }
    
    public Computer(String cpu, String memory, String hardDisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Computer getDetails() {
        return this;
    }
}
