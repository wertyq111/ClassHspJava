package com.service;

import com.dao.BillDAO;
import com.domain.Bill;
import com.domain.Menu;

import java.util.List;
import java.util.UUID;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BillService {
    //定义一个 billDAO 属性
    private BillDAO billDAO = new BillDAO();
    private MenuService menuService = new MenuService();
    private DiningTableService diningTableService = new DiningTableService();

    //根据 id 返回 Bill 对象
    public Bill getBillById(Integer id) {
        Bill bill =
                billDAO.querySingle(
                        "select * from bill where id = ?",
                        Bill.class,
                        id
                );
        return bill;
    }

    /**
     * 返回账单列表
     * @return List<Bill>
     */
    public List<Bill> getBills() {
        List<Bill> list = billDAO.queryMulti(
                "select * from bill where 1",
                Bill.class
        );

        return list;
    }

    //点餐
    //1. 生成账单
    //2. 更新对应餐桌的状态
    public boolean orderMenu(int menuId, int num, int diningTableId) {
        //生成账单唯一编号
        String billId = UUID.randomUUID().toString();

        //获取菜单对象
        Menu menu = menuService.getMenuById(menuId);
        //计算金额
        Double money = menu.getPrice() * num;

        // 创建账单
        int update = billDAO.update(
                "insert into bill(billId, menuId, diningTableId, num, money,billDate, state) " +
                        "values(?, ?, ?, ?, ?, now(), '未结算')",
                billId,
                menuId,
                diningTableId,
                num,
                money
        );

        if(update > 0) {
            //更新餐桌状态
            diningTableService.updateDiningTableState(diningTableId, "就餐中");
        }

        return update > 0;
    }

    /**
     * 根据餐桌号查询未结清账单数量
     * @param diningTableId
     * @return
     */
    public boolean hasPayBillByDiningTableId(int diningTableId) {
        Object o = billDAO.queryScalar(
                "select count(id) from bill where state != '已结账' and diningTableId = ?",
                diningTableId
        );

        Integer hasPayBillNumbers = Integer.parseInt(o.toString());

        return hasPayBillNumbers > 0;
    }

    /**
     * 结账
     * @param diningTableId
     * @return
     */
    public boolean payBill(int diningTableId) {

        //修改订单状态
        int update = billDAO.update(
                "update bill set state = '已结账' where diningTableId = ? and state != '已结账'",
                diningTableId
        );

        if(update > 0) {
            return false;
        }

        //更新餐桌状态
        boolean payEnd = diningTableService.diningTableStateToFree(diningTableId);
        return payEnd;
    }
}
