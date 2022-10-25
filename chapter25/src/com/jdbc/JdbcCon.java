package com.jdbc;

import com.mysql.cj.jdbc.Driver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Dictionary;
import java.util.Properties;

/**
 * @author zhouxufeng
 * @version 1.0
 * 分析 java 连接 mysql 的 5 种方式
 */
@SuppressWarnings({"all"})
public class JdbcCon {

    /**
     * 使用静态类加载Driver 驱动
     * @throws SQLException
     */
    @Test
    public void connect01() throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://xxx.xxx.xxx.xxx:xxxx/xx";
        // 将用户名和密码放入到 properties 对象
        Properties properties = new Properties();
        properties.setProperty("user", "xxxx");
        properties.setProperty("password", "*******");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

    /**
     * 使用反射加载 Driver 类,动态加载,减少依赖性
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    @Test
    public void connect02() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 使用反射加载 Driver 类,动态加载,减少依赖性
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver)clazz.newInstance();

        String url = "jdbc:mysql://xxx.xxx.xxx.xxx:xxxx/xx";
        // 将用户名和密码放入到 properties 对象
        Properties properties = new Properties();
        properties.setProperty("user", "xxxx");
        properties.setProperty("password", "*******");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

    /**
     * 使用 DriverManager 替换 Driver
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    @Test
    public void connect03() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 使用 DriverManager 替换 Driver
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver)clazz.newInstance();

        String url = "jdbc:mysql://xxx.xxx.xxx.xxx:xxxx/xx";
        String user = "xxxx";
        String password = "*******";

        DriverManager.registerDriver(driver); //注册 driver 驱动

        Connection connect = DriverManager.getConnection(url, user, password);
        System.out.println(connect);
    }

    /**
     * 使用 Class.forName自动完成注册驱动,简化代码, 推荐使用
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    @Test
    public void connect04() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 使用 Class.forName自动完成注册驱动,简化代码
        /**
         *   Driver.class 静态代码块在类加载时会执行一次
         *     static {
         *         try {
         *             DriverManager.registerDriver(new Driver());
         *         } catch (SQLException var1) {
         *             throw new RuntimeException("Can't register driver!");
         *         }
         *     }
         */
        // 1. mysql 5.1.6之后可以无需 Class.forName("com.mysql.cj.jdbc.Driver").
        // 2. 会自动调用驱动 jar 包下META-INF\services\java.sql.Driver 文本中的类名称去注册
        // 3. 建议还是写上Class.forName("com.mysql.cj.jdbc.Driver"); 更加明确
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver)clazz.newInstance();

        String url = "jdbc:mysql://xxx.xxx.xxx.xxx:xxxx/xx";
        String user = "xxxx";
        String password = "*******";

        Connection connect = DriverManager.getConnection(url, user, password);
        System.out.println(connect);
    }

    /**
     * 使用配置文件,连接数据库更灵活
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    @Test
    public void connect05() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/jdbc/jdbc.properties"));
        Class<?> clazz = Class.forName(properties.getProperty("driver"));
        Driver driver = (Driver)clazz.newInstance();

        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Connection connect = DriverManager.getConnection(url, user, password);
        System.out.println(connect);
    }

}
