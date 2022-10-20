package com.javamysql;

import org.testng.annotations.Test;

import java.sql.*;

/**
 * @author zhouxufeng
 * @version 1.0
 * CURD 练习
 */
@SuppressWarnings({"all"})
public class CURDExcise {
    public static void main(String[] args) {

    }

    @Test
    public static void create() throws Exception {
        //加载类, 得到mysql 连接
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://1.117.211.237:3306/?serverTimezone=GMT%2B8", "wertyq111", "zhouXufeng123_");

        //编写 sql 语句 向表 emp 中插入 2个员工信息
        String sql = "Insert into java.emp(name, sex, birthday, entry_date, job, salary, resume) values " +
                "(\"tom\", \"男\",\"1998-07-16\", \"2011-08-09\", \"管家\", 3287.6, \"汤姆猫\")," +
                "(\"jerry2\", \"男\", \"1998-09-11\", \"2011-08-09\", \"破坏王\", 54821.55, \"老鼠杰瑞\")";

        //得到statement
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

        statement.close();
        connection.close();
        System.out.println("添加成功!");
        new CURDExcise().read();
    }

    @Test
    public void update() throws Exception {
        //加载类, 得到mysql 连接
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://1.117.211.237:3306/?serverTimezone=GMT%2B8", "wertyq111", "zhouXufeng123_");

        //编写 sql 语句
        String sql = "update java.emp set salary = 64278.99 where name='tom'";

        //得到statement
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

        statement.close();
        connection.close();
        System.out.println("添加成功!");
        new CURDExcise().read();
    }

    @Test
    public void delete() throws Exception {
        //加载类, 得到mysql 连接
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://1.117.211.237:3306/?serverTimezone=GMT%2B8", "wertyq111", "zhouXufeng123_");

        //编写 sql 语句
        String sql = "delete from java.emp where name='tom'";

        //得到statement
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

        statement.close();
        connection.close();
        System.out.println("删除成功!");
        new CURDExcise().read();
    }

    @Test
    public void read() throws Exception {
        //加载类, 得到mysql 连接
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://1.117.211.237:3306/?serverTimezone=GMT%2B8", "wertyq111", "zhouXufeng123_");

        //编写 sql 语句 向表 emp 中插入 2个员工信息
        String sql = "select * from java.emp where 1";

        //得到statement
        PreparedStatement ps = connection.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            System.out.println("编号: " + rs.getInt("id") +
                    "\t姓名: " + rs.getString("name") +
                    "\t性别: " + rs.getString("sex") +
                    "\t出生日期: " + rs.getDate("birthday") +
                    "\t入职日期: " + rs.getDate("entry_date") +
                    "\t薪水: " + rs.getDouble("salary") +
                    "\t简历: " + rs.getString("resume"));
        }

        rs.close();
        ps.close();
        connection.close();
        System.out.println("查询成功!");
    }
}
