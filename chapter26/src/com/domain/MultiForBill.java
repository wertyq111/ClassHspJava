package com.domain;

import java.util.Date;

/**
 * @author zhouxufeng
 * @version 1.0
 * 这是一个 javabean 和 bill 的多表关系
 */
@SuppressWarnings({"all"})
public class MultiForBill {
    private Integer id;
    private String billId;
    private Integer menuId;
    private Integer diningTableId;
    private Integer num;
    private Double money;
    private Date billDate;
    private String state;
    // 引入 menu 表中的 name 字段
    private String menuName;


    public MultiForBill() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getDiningTableId() {
        return diningTableId;
    }

    public void setDiningTableId(Integer diningTableId) {
        this.diningTableId = diningTableId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", billId='" + billId + '\'' +
                ", menuId=" + menuId +
                ", diningTableId=" + diningTableId +
                ", num=" + num +
                ", money=" + money +
                ", billDate=" + billDate +
                '}';
    }
}
