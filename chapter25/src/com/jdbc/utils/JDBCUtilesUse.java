package com.jdbc.utils;

import org.testng.annotations.Test;

import java.sql.*;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class JDBCUtilesUse {
    @Test
    public void testSelect() {
        // 1. 得到连接
        Connection connection = null;

        // 2. dml 的 sql 语句
        String sql = "select * from actor where name = ?";
        PreparedStatement preparedStatement = null;

        // 3. 创建 PreparedStatement 对象
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "刘德华");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);//获取改行的第一列数据
                String name = resultSet.getString(2);
                String sex = resultSet.getString(3);
                Date date = resultSet.getDate(4);
                int phone = resultSet.getInt(5);
                System.out.println("|" + id + "|\t" + name + "|\t" + sex + "|\t" + date + "｜\t" + phone + "|");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }

    @Test
    public void testDML() {
        // 1. 得到连接
        Connection connection = null;

        // 2. dml 的 sql 语句
        String sql = "update actor set phone = ? where name = ?";
        PreparedStatement preparedStatement = null;

        // 3. 创建 PreparedStatement 对象
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, 150);
            preparedStatement.setString(2, "刘德华");

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
