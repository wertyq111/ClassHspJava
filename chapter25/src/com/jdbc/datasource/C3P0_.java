package com.jdbc.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示 C3P0 的使用
 */
@SuppressWarnings({"all"})
public class C3P0_ {
    @Test
    public  void c3p0_conn1() throws Exception {
        // 1. 创建一个数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        // 2. 通过配置文件获取相关的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/jdbc/jdbc.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        // 给数据源 comboPooledDataSource 设置相关的参数
        // 注意: 连接管理是由 comboPooledDataSource 来管理
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        // 设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);
        // 设置最大连接数
        comboPooledDataSource.setMaxPoolSize(50);

        // 3. 进行连接, 从 DataSource 接口实现
        Connection connection = comboPooledDataSource.getConnection();

        System.out.println("连接成功");

        connection.close();

    }

    @Test
    public void c3p0_conn2() throws Exception {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("zhouxufeng");
        System.out.println("开始执行...");
        long start = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("c3p0 的第二种方式耗时=" + (end - start));
    }
}
