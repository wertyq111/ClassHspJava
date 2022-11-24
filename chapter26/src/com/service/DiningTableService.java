package com.service;

import com.dao.DiningTableDAO;
import com.domain.DiningTable;
import com.domain.Employee;

import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class DiningTableService {
    //定义一个 employeeDAO 属性
    private DiningTableDAO diningTableDAO = new DiningTableDAO();

    //根据 empId 和 pwd 返回 Employee 对象
    public DiningTable getDiningTableById(Integer id) {
        DiningTable diningTable =
                diningTableDAO.querySingle(
                        "select * from dining_table where id = ?",
                        DiningTable.class,
                        id
                );
        return diningTable;
    }

    /**
     * 返回餐桌列表
     * @return List<DiningTable>
     */
    public List<DiningTable> getDinigTables() {
        List<DiningTable> list = diningTableDAO.queryMulti(
                "select * from dining_table where 1",
                DiningTable.class
        );

        return list;
    }

    /**
     * 获取最大的餐桌编号
     * @return Integer
     */
    public Integer getMaxDiningTableNumber() {
        DiningTable maxDiningTable = diningTableDAO.querySingle(
                "select max(id) from dining_table where 1",
                DiningTable.class
        );

        return maxDiningTable.getId();
    }

    /**
     * 预定餐桌
     * @param id
     * @param orderName
     * @param orderTel
     * @return boolean
     */
    public boolean orderDiningTable(int id, String orderName, String orderTel) {
        int update = diningTableDAO.update(
                "update dining_table set state = '已经预定', orderName = ?, orderTel = ? where id = ?",
                orderName,
                orderTel,
                id
        );

        return update > 0;
    }

    /**
     * 更新餐桌状态
     * @param id
     * @param state
     * @return boolean
     */
    public boolean updateDiningTableState(int id, String state) {
        int update = diningTableDAO.update(
                "update dining_table set state = ? where id = ?",
                state,
                id
        );

        return update > 0;
    }
}
