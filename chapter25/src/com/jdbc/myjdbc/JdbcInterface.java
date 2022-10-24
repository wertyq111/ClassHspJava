package com.jdbc.myjdbc;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
interface JdbcInterface {
    //连接
    public Object getConnection();

    //调用
    public void crud();

    //关闭
    public void close();
}
