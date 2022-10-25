package com.jdbc.statement_;

import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示使用 PreparedStatement 预处理使用
 */
@SuppressWarnings({"all"})
public class PreparedStatement_ {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/jdbc/jdbc.properties"));
        Class<?> clazz = Class.forName(properties.getProperty("driver"));
        Driver driver = (Driver)clazz.newInstance();

        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        // 连接
        Connection connect = DriverManager.getConnection(url, user, password);

        //用户输入具体姓名查询
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入姓名: ");
        String queryName = scanner.nextLine(); //next(): 当接收到 空格或者 ' 就是表示结束
        //输入具体姓名 "刘德华" 查询结果
        //输入 "1' OR '1' = '1" 获取不了结果
        String sql = "select * from actor where name = ? ";
        System.out.println(sql);

        // 得到 PreparedStatement
        PreparedStatement preparedStatement = connect.prepareStatement(sql);

        // 给 ? 赋值
        preparedStatement.setString(1, queryName);

        // 这里执行 executeQuery 不需要传入值
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()) {
            int id = resultSet.getInt(1);//获取改行的第一列数据
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println("|" + id + "|\t" + name + "|\t" + sex + "|\t" + date + "|");
        }

        resultSet.close();
        preparedStatement.close();
        connect.close();
    }
}
