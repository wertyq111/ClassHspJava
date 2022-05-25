package com.house_rent_hierarchical.view;

import com.house_rent.model.HouseRentSys;
import com.house_rent_hierarchical.model.House;
import com.house_rent_hierarchical.service.HouseService;
import com.house_rent_hierarchical.tool.Utility;

import java.util.Scanner;

public class HouseView {
    private boolean loop = true; //控制显示菜单
    private char key = ' ';//接收用户选择
    private HouseService houseService = new HouseService(2);

    public void mainMenu() {
        do {
            System.out.println("-----------------房源出租系统-----------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退 出 系 统");
            System.out.print("请选择(1-6):");
            key = Utility.readMenuSelection();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    deleteHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    logout();
                    break;
            }
        } while (loop);
    }

    public void addHouse() {
        System.out.println("--------------添加房屋--------------");
        System.out.print("姓名: ");
        String name = Utility.readString(6);
        System.out.print("电话: ");
        String phone = Utility.readString(11);
        System.out.print("地址: ");
        String address = Utility.readString(120);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态: ");
        String state = Utility.readString(3);
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("--------------房屋添加成功--------------");
        } else {
            System.out.println("--------------房屋添加失败--------------");
        }
    }

    public void findHouse() {
        System.out.println("--------------查找房屋--------------");
        System.out.print("请输入你要查找的房屋id: ");
        int id = Utility.readInt();
        House house = houseService.find(id);
        if (house == null) {
            System.out.println("--------------没有找到房屋--------------");
            return;
        }

        System.out.println(house);
    }

    public void deleteHouse() {
        System.out.println("--------------删除房屋--------------");
        System.out.print("请选择待删除房屋编号(-1)退出: ");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("--------------退出删除---------------");
            return;
        }

        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("--------------房屋删除成功--------------");
            } else {
                System.out.println("--------------房屋删除失败--------------");
            }
        }
    }

    public void updateHouse() {
        System.out.println("--------------修改房源--------------");
        System.out.print("清选择待修改的房屋编号(-1)退出:");
        int updateId = Utility.readInt();

        if(updateId == -1) {
            System.out.println("--------------退出修改功能--------------");
            return;
        }
        House house = houseService.find(updateId);
        if (house == null) {
            System.out.println("--------------没有找到房屋--------------");
            return;
        }

        System.out.print("姓名(" + house.getName() + "): ");
        String name = Utility.readString(8, null);
        System.out.print("电话(" + house.getPhone() + "): ");
        String phone = Utility.readString(11, null);
        System.out.print("地址(" + house.getAddress() + "): ");
        String address = Utility.readString(120, null);
        System.out.print("月租(" + house.getRent() + "): ");
        Integer rent = Utility.readInt(0);
        System.out.print("状态(" + house.getState() + "): ");
        String state = Utility.readString(3, null);

        if (houseService.update(house, name, phone, address, rent, state)) {
            System.out.println("--------------房屋修改成功--------------");
        } else {
            System.out.println("--------------房屋修改失败--------------");
        }
    }

    public void listHouses() {
        House[] houses = houseService.list();
        if (houses.length > 0) {
            System.out.println("编号\t\t房东\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
            for (int i = 0; i < houses.length; i++) {
                if(houses[i] == null) {
                    break;
                }
                System.out.println(houses[i]);
            }
        } else {
            System.out.println("--------------没有房屋--------------");
        }
    }

    public void logout() {
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            System.out.println("--------------欢迎下次光临--------------");
            loop = false;
        }
    }
}
