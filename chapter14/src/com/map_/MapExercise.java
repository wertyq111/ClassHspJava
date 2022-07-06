package com.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author zhouxufeng
 * @version 1.0
 * 使用HashMap添加3个员工对象
 * 要求：
 *  1. 键： 员工ID
 *  2. 值： 员工对象
 * 遍历显示工资>18000的员工(遍历方式最少两种)
 * 员工类(姓名， 工资，员工id)
 */
@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();

        Employee zs = new Employee("张三", 18000, 1);
        Employee ls = new Employee("李四", 16000, 2);
        Employee ww = new Employee("王五", 27000, 3);

        hashMap.put(zs.getId(), zs);
        hashMap.put(ls.getId(), ls);
        hashMap.put(ww.getId(), ww);

        System.out.println("===keySet增强for遍历===");
        Set keySet = hashMap.keySet();
        for(Object key : keySet) {
            Employee employee = (Employee)hashMap.get(key);
            if(employee.getSalary() >= 18000) {
                System.out.println(employee);
            }
        }

        System.out.println("===entrySet迭代器遍历===");
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();

            Employee employee = (Employee) entry.getValue();

            if(employee.getSalary() >= 18000) {
                System.out.println(employee);
            }
        }

    }
}

@SuppressWarnings({"all"})
class Employee {
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
