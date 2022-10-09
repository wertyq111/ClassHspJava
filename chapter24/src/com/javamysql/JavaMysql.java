package com.javamysql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class JavaMysql {
    public static void main(String[] args) throws Exception {
        //加载类, 得到mysql 连接
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://1.117.211.237:3306/?serverTimezone=GMT%2B8", "wertyq111", "zhouXufeng123_");

        //编写 sql 语句
        String sql = "select * from oa_sale.commodity where 1";

        //得到statement
        Statement statement = connection.createStatement();
        statement.execute(sql);

        statement.close();
        connection.close();
        System.out.println("成功!");
    }
}
