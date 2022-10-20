package com.javamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author zhouxufeng
 * @version 1.0
 * 创建一个员工表 emp, 选用适当的数据类型
 */
@SuppressWarnings({"all"})
public class MysqlExercise {
    public static void main(String[] args) throws Exception {
        //加载类, 得到mysql 连接
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://1.117.211.237:3306/?serverTimezone=GMT%2B8", "wertyq111", "zhouXufeng123_");

        //编写 sql 语句
        String sql = "CREATE TABLE `java`.`emp` ( " +
                "`id` INT NOT NULL AUTO_INCREMENT COMMENT 'id' , " +
                "`name` VARCHAR(32) NOT NULL COMMENT '姓名' , " +
                "`sex` CHAR(2) NOT NULL COMMENT '性别' , " +
                "`birthday` DATE NOT NULL COMMENT '生日' , " +
                "`entry_date` DATE NOT NULL COMMENT '入职日期' , " +
                "`job` VARCHAR(32) NOT NULL COMMENT '工作' , " +
                "`salary` VARCHAR(32) NOT NULL COMMENT '薪资' , " +
                "`resume` TEXT NOT NULL COMMENT '简历' , " +
                "PRIMARY KEY (`id`), " +
                "UNIQUE `uk_name` (`name`)) " +
                "ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_unicode_ci COMMENT = '员工表';";

        //得到statement
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

        statement.close();
        connection.close();
        System.out.println("成功!");
    }
}
