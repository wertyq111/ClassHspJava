package com.jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.testng.annotations.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示 druid 数据库连接池使用
 */
@SuppressWarnings({"all"})
public class Druid_ {
    @Test
    public void testDruid() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = dataSource.getConnection();
            connection.close();
        }
        long end = System.currentTimeMillis();

        System.out.println("Druid 的第二种方式耗时=" + (end - start));

    }
}
