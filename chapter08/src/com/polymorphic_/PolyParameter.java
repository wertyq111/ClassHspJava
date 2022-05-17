package com.polymorphic_;

import com.polymorphic_.polyparameter_.Employee;
import com.polymorphic_.polyparameter_.GeneralStaff;
import com.polymorphic_.polyparameter_.Manager;

public class PolyParameter {
    public static void main(String[] args) {
        PolyParameter poly = new PolyParameter();
        GeneralStaff general = new GeneralStaff("张三", 5000);
        Manager manager = new Manager("李四", 8000, 1500);
        System.out.println("普通员工:" + general.getName() + "的年薪是" + poly.showEmpAnnual(general));
        System.out.println("经理:" + manager.getName() + "的年薪是" + poly.showEmpAnnual(manager));
        System.out.println(poly.testWork(general));
        System.out.println(poly.testWork(manager));
    }

    public double showEmpAnnual(Employee emp) {
        return emp.getAnnual();
    }

    public String testWork(Employee emp) {
        if(emp instanceof GeneralStaff) {
            return ((GeneralStaff) emp).work();
        } else if(emp instanceof Manager) {
            return ((Manager) emp).manage();
        } else {
            return "";
        }
    }
}
