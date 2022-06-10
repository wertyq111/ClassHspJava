package com.abstract_.object_;

public class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println("普通员工" + super.getName() + "工作中");
    }
}
