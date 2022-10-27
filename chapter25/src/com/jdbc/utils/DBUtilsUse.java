package com.jdbc.utils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 * 使用 DBUtils + Druid 的方式完成对表 crud 操作
 */
@SuppressWarnings({"all"})
public class DBUtilsUse {
    /**
     * 查询多行记录
     */
    @Test
    public void testQueryMany() {
        // 1. 得到连接
        Connection connection = null;

        String sql = "select * from actor where id >= ?";

        try {
            // 2. 使用 DBUtils 类和接口, 先引入 DBUtils 相关的jar
            // 3. 创建 QueryRunner
            QueryRunner queryRunner = new QueryRunner();
            // 4. 现在就可以执行相关的方法,返回 ArrayList 结果集
            connection = JDBCUtilsByDruid.getConnection();
            // 解读
            // (1) query 方法就是执行 sql 语句, 得到 resultset --- 封装到 --> ArrayList 集合中
            // (2) 返回集合
            // (3) connections: 连接
            // (4) sql: 执行的 SQL 语句
            // (5) new BeanListHandler<>(Actor.class): 在讲 resultset -> Actor 对象 --> 封装到 ArrayList
            //     底层使用发射机制 去获取 Actor 对象
            // (6) 1: 给 sql 语句中的?赋值,可以有多个值,因为是可变参数
            // (7) 底层得到的 resultset,preparedStatement 会在 query 中关闭
            List<Actor> list = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);
            System.out.println("输出集合的信息");
            System.out.println(list);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCUtilsByDruid.close(null, null, connection);
        }

    }

    /**
     * 查询单行记录
     */
    @Test
    public void testQuerySingle() {
        // 1. 得到连接
        Connection connection = null;

        String sql = "select * from actor where id = ?";

        try {
            // 2. 使用 DBUtils 类和接口, 先引入 DBUtils 相关的jar
            // 3. 创建 QueryRunner
            QueryRunner queryRunner = new QueryRunner();
            // 4. 现在就可以执行相关的方法,返回 ArrayList 结果集
            connection = JDBCUtilsByDruid.getConnection();

            Actor actor = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 1);
            System.out.println("输出集合的信息");
            System.out.println(actor);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    /**
     * 查询单行单列的值
     */
    @Test
    public void testScalar() {
        // 1. 得到连接
        Connection connection = null;

        String sql = "select name from actor where id = ?";

        try {
            // 2. 使用 DBUtils 类和接口, 先引入 DBUtils 相关的jar
            // 3. 创建 QueryRunner
            QueryRunner queryRunner = new QueryRunner();
            // 4. 现在就可以执行相关的方法,返回 ArrayList 结果集
            connection = JDBCUtilsByDruid.getConnection();

            // 返回的是单行单列,返回的对象就是输出的值
            Object obj = queryRunner.query(connection, sql, new ScalarHandler(), 1);
            System.out.println("输出集合的信息");
            System.out.println(obj);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    /**
     * 完成 DML 操作
     */
    @Test
    public void testDML() {
        // 1. 得到连接
        Connection connection = null;

        String sql = "update actor set name=? where id = ?";

        try {
            // 2. 使用 DBUtils 类和接口, 先引入 DBUtils 相关的jar
            // 3. 创建 QueryRunner
            QueryRunner queryRunner = new QueryRunner();
            // 4. 现在就可以执行相关的方法,返回 ArrayList 结果集
            connection = JDBCUtilsByDruid.getConnection();

            // 解读
            // (1) 执行 dml 操作是 queryRunner.update()
            // (2) 返回值是受影响的行数(affected: 受影响)
            int affectedRows = queryRunner.update(connection, sql, "周星驰", 1);
            System.out.println("输出集合的信息");
            System.out.println(affectedRows > 0 ? "执行成功" : "执行没有影响到表");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }
}
