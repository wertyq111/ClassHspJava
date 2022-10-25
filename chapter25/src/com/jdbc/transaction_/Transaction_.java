package com.jdbc.transaction_;

import com.jdbc.statement_.PreparedStatement_;
import com.jdbc.utils.JDBCUtils;

import java.sql.*;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示 JDBC 控制事务
 */
@SuppressWarnings({"all"})
public class Transaction_ {
    public static void main(String[] args) {
        Connection connection = null;

        String sql = "update actor set phone = phone - ? where name = ?";
        String querySql = "select * from actor where name = ?";


        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 100);
            preparedStatement.setString(2, "刘德华");
            int rows = preparedStatement.executeUpdate();
            if(rows > 0) {
                System.out.println("修改失败");
                throw new RuntimeException("回滚");
            }

            preparedStatement = connection.prepareStatement(querySql);
            preparedStatement.setString(1, "刘德华");
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                int id = resultSet.getInt(1);//获取改行的第一列数据
                String name = resultSet.getString(2);
                String sex = resultSet.getString(3);
                Date date = resultSet.getDate(4);
                int phone = resultSet.getInt(5);
                System.out.println("|" + id + "|\t" + name + "|\t" + sex + "|\t" + date + "｜\t" + phone + "|");
            }

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, -100);
            preparedStatement.setString(2, "范冰冰");
            int i = preparedStatement.executeUpdate();
            if(i > 0) {
                System.out.println("修改成功");
            }
            connection.commit();

            preparedStatement = connection.prepareStatement(querySql);
            preparedStatement.setString(1, "范冰冰");
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                int id = resultSet.getInt(1);//获取改行的第一列数据
                String name = resultSet.getString(2);
                String sex = resultSet.getString(3);
                Date date = resultSet.getDate(4);
                int phone = resultSet.getInt(5);
                System.out.println("|" + id + "|\t" + name + "|\t" + sex + "|\t" + date + "｜\t" + phone + "|");
            }
        } catch (Exception e) {
            System.out.println("发生异常,撤销事务");
            try {
                connection.rollback();
                preparedStatement = connection.prepareStatement(querySql);
                preparedStatement.setString(1, "刘德华");
                resultSet = preparedStatement.executeQuery();

                while(resultSet.next()) {
                    int id = resultSet.getInt(1);//获取改行的第一列数据
                    String name = resultSet.getString(2);
                    String sex = resultSet.getString(3);
                    Date date = resultSet.getDate(4);
                    int phone = resultSet.getInt(5);
                    System.out.println("|" + id + "|\t" + name + "|\t" + sex + "|\t" + date + "｜\t" + phone + "|");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, preparedStatement, connection);
        }
    }
}
