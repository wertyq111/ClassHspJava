package com.house_rent_hierarchical.service;

import com.house_rent_hierarchical.model.House;

public class HouseService {
    private House[] houses;
    private int houseNum = 0; //记录当前有多少个房屋信息
    private int idCounter = 0;//id自增计数器

    public HouseService(int size) {
        houses = new House[size];
    }

    public boolean add(House newHouse) {
        arrayExpansion();

        //将新的房屋信息加入到数组中,房屋信息数量+1
        houses[houseNum++] = newHouse;
        //设计一个id自增长机制
        newHouse.setId(++idCounter);

        return true;
    }

    public boolean update(House house, String name, String phone, String address, Integer rent, String state) {
        if(name != null) {
            house.setName(name);
        }

        if(phone != null) {
            house.setPhone(phone);
        }

        if(address != null) {
            house.setAddress(address);
        }

        if(rent > 0) {
            house.setRent(rent);
        }

        if(state != null) {
            house.setState(state);
        }

        return true;
    }

    public boolean del(int delId) {
        //先找到要删除的房屋信息对应的下标
        int delIndex = findIndex(delId);

        if(delIndex < 0) {
            return false;
        }

        //先把当前下标值设为null
        //当前下标开始循环,将后位数组值向前覆盖,最后一个值设置为null
        for(int i = delIndex; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNum] = null;

        return false;
    }

    public House[] list() {
        return houses;
    }

    /**
     * 通过id查找房源
     * @param id
     * @return House|null
     */
    public House find(int id) {
        for(int i = 0; i < houseNum; i++) {
            if(houses[i].getId() == id) {
                return houses[i];
            }
        }

        return null;
    }

    /**
     * 通过id查找房源下标index
     * @param id
     * @return int
     */
    public int findIndex(int id) {
        for(int i = 0; i < houseNum; i++) {
            if(houses[i].getId() == id) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 数组扩容
     */
    public void arrayExpansion() {
        if(houseNum == houses.length) {
            House[] tempHouses = new House[houses.length + 1];
            for(int i = 0; i < houseNum; i++) {
                tempHouses[i] = houses[i];
            }
            houses = tempHouses;
        }
    }
}
