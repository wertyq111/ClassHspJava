package com.jdbc;


import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        // 1. 注册驱动
        Driver driver = new Driver();

        // 2. 得到连接
        // 解读:
        // (1) jdbc:mysql://  规定好表示协议, 通过 jdbc 的方式连接 mysql
        // (2) localhost 主机, 可以使 ip 地址
        // (3) 3306 表示 mysql 监听的端口
        // (4) java 连接到 mtsql dbms 的哪个数据库
        // (5) mysql 的链接本质就是socket 连接
        String url = "jdbc:mysql://xxx.xxx.xxx.xxx:xxxx/xx";
        // 将用户名和密码放入到 properties 对象
        Properties properties = new Properties();
        properties.setProperty("user", "xxxxxx");
        properties.setProperty("password", "*******");
        Connection connect = driver.connect(url, properties);

        // 3. 执行 sql
        String sql = "insert into actor values(null, '范冰冰', '女', '1980-11-11', '120')";
        //statement 用于执行静态 SQL 语句并返回其生成的结果对象
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql); //如果是 dml 语句,返回的就是影响行数

        System.out.println(rows > 0 ? "成功" : "失败");

        // 4. 关闭连接
        statement.close();
        connect.close();
    }
}
