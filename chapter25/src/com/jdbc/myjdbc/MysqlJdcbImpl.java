package com.jdbc.myjdbc;

/**
 * @author zhouxufeng
 * @version 1.0
 * 模拟mysql 连接数据库
 *
 */
@SuppressWarnings({"all"})
public class MysqlJdcbImpl implements JdbcInterface {

    @Override
    public Object getConnection() {
        System.out.println("连接了 mysql 数据库");
        return null;
    }

    @Override
    public void crud() {

    }

    @Override
    public void close() {

    }
}
