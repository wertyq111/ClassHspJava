package com.dao;

import com.utils.JdbcUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BasicDAO<T> {
    private QueryRunner qr = new QueryRunner();

    //开发通用的 dml 方法,针对任意的表
    public int update(String sql, Object... parameters) {
        Connection connection = null;

        try {
            connection = JdbcUtilsByDruid.getConnection();
            int rows = qr.update(connection, sql, parameters);
            return rows;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtilsByDruid.close(null, null, connection);
        }
    }

    /**
     * 返回多个对象(即查询结果是多行), 针对人意表
     *
     * @param sql
     * @param clazz 传入一个二类的 Class 对象 比如 Actor.class
     * @param parameters 传入 sql 语句中 ? 的具体值
     * @return List<T> 根据 返回对应的 ArrayList 集合
     */
    public List<T> queryMulti(String sql, Class<T> clazz, Object... parameters) {
        Connection connection = null;

        try {
            connection = JdbcUtilsByDruid.getConnection();
            return qr.query(connection, sql, new BeanListHandler<T>(clazz), parameters);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtilsByDruid.close(null, null, connection);
        }
    }

    /**
     * 查询单行结果的通用方法
     * @param sql
     * @param clazz
     * @param parameters
     * @return T
     */
    public T querySingle(String sql, Class<T> clazz, Object... parameters) {
        Connection connection = null;

        try {
            connection = JdbcUtilsByDruid.getConnection();
            return qr.query(connection, sql, new BeanHandler<T>(clazz), parameters);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtilsByDruid.close(null, null, connection);
        }
    }

    /**
     * 查询单行单列通用方法
     * @param sql
     * @param parameters
     * @return Object
     */
    public Object queryScalar(String sql, Object... parameters) {
        Connection connection = null;

        try {
            connection = JdbcUtilsByDruid.getConnection();
            return qr.query(connection, sql, new ScalarHandler(), parameters);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtilsByDruid.close(null, null, connection);
        }
    }
}
