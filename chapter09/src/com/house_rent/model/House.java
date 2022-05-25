package com.house_rent.model;

/**
 * 房源信息类
 * 包含字段: id(房源id), name(房主姓名), phone(房主电话), address(房源地址), price(月租价格), status(出租状态)
 * 包含业务方法: update(修改房源)
 */
public class House {
    private int id;
    private String name;
    private String phone;
    private String address;
    private double price;
    private int status;

    public House() { }

    public House(String name, String phone, String address, double price, int status) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public House update(House house, String name, String phone, String address, Double price, Integer status) {
        if(name != null) {
            house.setName(name);
        }

        if(phone != null) {
            house.setPhone(phone);
        }

        if(address != null) {
            house.setAddress(address);
        }

        if(price != null) {
            house.setPrice(price);
        }

        if(status != null) {
            house.setStatus(status);
        }

        return house;
    }
}
