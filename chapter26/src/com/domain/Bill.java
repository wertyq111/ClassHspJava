package com.domain;

import java.util.Date;

/**
 * @author zhouxufeng
 * @version 1.0
 * 这是一个 javabean 和 menu 的对应关系
 */
@SuppressWarnings({"all"})
public class Bill {
    private Integer id;
    private String billId;
    private Integer menuId;
    private Integer diningTableId;
    private Integer num;
    private Double money;
    private Date billDate;

    public Bill() {
    }

    public Bill(Integer id, String billId, Integer menuId, Integer diningTableId, Integer num, Double money, Date billDate) {
        this.id = id;
        this.billId = billId;
        this.menuId = menuId;
        this.diningTableId = diningTableId;
        this.num = num;
        this.money = money;
        this.billDate = billDate;
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
