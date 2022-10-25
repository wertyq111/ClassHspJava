package com.jdbc.utils;

import jdk.nashorn.internal.ir.SplitReturn;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author zhouxufeng
 * @version 1.0
 * JDBC 工具类, 完成 mysql 的连接和关闭资源
 */
@SuppressWarnings({"all"})
public class JDBCUtils {
    static String user;
    static String password;
    static String url;
    static String driver;
    
    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/com/jdbc/jdbc.properties"));
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");

            // 1. 注册驱动
            Class.forName(driver);
        } catch (Exception e) {
            // 转成运行异常抛出
            // 1. 将编译异常转成运行异常
            // 2. 调用者可以捕获该异常, 也可以选择默认处理该异常
            throw new RuntimeException(e);
        }
    }

    // 连接数据库
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 批量处理连接数据库
    public static Connection getBatchConnection() {
        try {
            url += "?rewriteBatchedStatements=true";
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 释放资源
    public static void close(ResultSet set, Statement statement, Connection connection) {
        try {
            if(set != null) {
                set.close();
            }

            if(statement != null) {
                statement.close();
            }

            if(connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
