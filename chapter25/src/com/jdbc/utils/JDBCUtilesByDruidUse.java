package com.jdbc.utils;

import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class JDBCUtilesByDruidUse {
    @Test
    public void testSelect() {
        // 1. 得到连接
        Connection connection = null;

        // 2. dml 的 sql 语句
        String sql = "select * from actor where name = ?";
        PreparedStatement preparedStatement = null;
        ArrayList<Actor> list = new ArrayList<>();

        // 3. 创建 PreparedStatement 对象
        try {
            connection = JDBCUtilsByDruid.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "刘德华");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);//获取改行的第一列数据
                String name = resultSet.getString(2);
                String sex = resultSet.getString(3);
                Date date = resultSet.getDate(4);
                int phone = resultSet.getInt(5);
                list.add(new Actor(id, name, sex, date, phone));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCUtilsByDruid.close(null, preparedStatement, connection);
        }

        for(Actor actor: list) {
            System.out.println("|" +
                    actor.getId() + "|\t" +
                    actor.getName() + "|\t" +
                    actor.getSex() + "|\t" +
                    actor.getBornDate() + "｜\t" +
                    actor.getPhone() + "|");
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
            connection = JDBCUtilsByDruid.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, 150);
            preparedStatement.setString(2, "刘德华");

            int rows = preparedStatement.executeUpdate();
            if(rows > 0) {
                System.out.println("修改成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCUtilsByDruid.close(null, preparedStatement, connection);
        }
    }
}
