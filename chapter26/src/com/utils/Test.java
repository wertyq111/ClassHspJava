package com.utils;

import java.sql.Connection;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
        //测试 ScannerUtility 工具类
        //System.out.println("请输入一个整数");
        //int i = ScannerUtility.readInt();
        //System.out.println("i=" + i);

        //测试 JdbcUtilsByDruid
        Connection connection = JdbcUtilsByDruid.getConnection();
        System.out.println(connection);
    }
}
