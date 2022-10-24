package com.jdbc.resultset_;

import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ResultSet_ {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/jdbc/jdbc.properties"));
        Class<?> clazz = Class.forName(properties.getProperty("driver"));
        Driver driver = (Driver)clazz.newInstance();

        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Connection connect = DriverManager.getConnection(url, user, password);

        Statement statement = connect.createStatement();

        String sql = "select * from actor where 1";

        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()) {
            int id = resultSet.getInt(1);//获取改行的第一列数据
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println("|" + id + "|\t" + name + "|\t" + sex + "|\t" + date + "|");
        }

        resultSet.close();
        statement.close();
        connect.close();
    }
}
