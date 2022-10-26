package com.jdbc.batch_;

import com.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Batch_ {
    public static void main(String[] args) {
        Connection batchConnection = null;
        PreparedStatement preparedStatement = null;
        try {
            batchConnection = JDBCUtils.getBatchConnection();

            String sql = "delete from actor where name = ?";

            preparedStatement = batchConnection.prepareStatement(sql);

            for(int i = 0; i <= 5000; i++) {
                preparedStatement.setString(1, "jack" + i);
                //将 sql 语句加入到批处理列表中
                preparedStatement.addBatch();
                //当有 1000 条记录是,在批量执行
                if((i + 1) % 1000 == 0) {
                    preparedStatement.executeBatch();
                    //清空批量列表
                    preparedStatement.clearBatch();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, batchConnection);
        }
    }
}
