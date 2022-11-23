package com.service;

import com.dao.EmployeeDAO;
import com.domain.Employee;

import static com.google.common.hash.Hashing.md5;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class EmployeeService {
    //定义一个 employeeDAO 属性
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    //根据 empId 和 pwd 返回 Employee 对象
    public Employee getEmployeeByIdAndPwd(String empId, String pwd) {
        Employee employee =
                employeeDAO.querySingle("select * from employee where empId = ? and pwd = md5(?)", Employee.class, empId, pwd);
        return employee;
    }
}
