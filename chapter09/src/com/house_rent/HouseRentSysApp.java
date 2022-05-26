package com.house_rent;

import com.house_rent.model.House;
import com.house_rent.model.HouseRentSys;
import com.house_rent_hierarchical.tool.Utility;

import java.util.Scanner;

public class HouseRentSysApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HouseRentSys houseRentSys = new HouseRentSys();

        HouseRentSysApp app = new HouseRentSysApp();
        boolean loop = true;
        do{
            System.out.println(houseRentSys.displayMenu());
            System.out.print("请选择(1-6):");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    houseRentSys = app.addHouse(scanner, houseRentSys);
                    break;
                case 2:
                    app.findHouse(scanner, houseRentSys);
                    break;
                case 3:
                    houseRentSys = app.deleteHouse(scanner, houseRentSys);
                    break;
                case 4:
                    houseRentSys = app.updateHouse(scanner, houseRentSys);
                    break;
                case 5:
                    app.listHouse(houseRentSys);
                    break;
                case 6:
                    loop = app.logout(scanner);
                    break;
            }
        }while(loop);
    }

    public HouseRentSys addHouse(Scanner scanner, HouseRentSys houseRentSys) {
        System.out.println("--------------添加房屋--------------");
        System.out.print("姓名: ");
        String name = scanner.next();
        System.out.print("电话: ");
        String phone = scanner.next();
        System.out.print("地址: ");
        String address = scanner.next();
        System.out.print("月租: ");
        double price = scanner.nextDouble();
        House house = houseRentSys.add(name, phone, address, price);
        if(house.getId() > 0) {
            System.out.println("--------------房屋添加成功--------------");
        } else {
            System.out.println("--------------房屋添加失败--------------");
        }

        return houseRentSys;
    }

    public void findHouse(Scanner scanner, HouseRentSys houseRentSys) {
        System.out.println("--------------查找房屋--------------");
        System.out.print("请输入你要查找的房屋id: ");
        int id = scanner.nextInt();
        House house = houseRentSys.findById(id);
        if(house == null) {
            System.out.println("--------------没有找到房屋--------------");
            return;
        }

        System.out.println(house.getId() + "\t"
                + house.getName() + "\t" + house.getPhone()+ "\t"
                + house.getAddress() + "\t" + house.getPrice() + "\t"
                + (house.getStatus() == 0 ? "未出租" : "已出租")
        );
    }

    public HouseRentSys deleteHouse(Scanner scanner, HouseRentSys houseRentSys) {
        System.out.println("--------------删除房屋--------------");
        System.out.print("请选择待删除房屋编号(-1)退出: ");
        int id = scanner.nextInt();
        if(id <= 0) {
            return houseRentSys;
        }

        System.out.println("确认是否删除(y/n): 请小心选择:");
        while(true) {
            System.out.println("请输入(y/n): ");
            char choice = scanner.next().charAt(0);
            if(choice == 'y' || choice == 'n') {
                if(choice == 'y') {
                    if(houseRentSys.delete(id)) {
                        System.out.println("--------------房屋删除成功--------------");
                    } else {
                        System.out.println("--------------房屋删除失败--------------");
                    }
                }
                break;
            }
        }

        return houseRentSys;
    }

    public HouseRentSys updateHouse(Scanner scanner, HouseRentSys houseRentSys) {
        System.out.println("--------------修改房源--------------");
        System.out.print("清选择待修改的房屋编号(-1)退出:");
        int id = scanner.nextInt();
        House house = houseRentSys.findById(id);
        if(house == null) {
            System.out.println("--------------没有找到房屋--------------");
            return houseRentSys;
        }

        System.out.print("姓名(" + house.getName() + "): ");
        String name = Utility.readString(8, house.getName());
        System.out.print("电话(" + house.getPhone() + "): ");
        String phone = Utility.readString(11, house.getPhone());
        System.out.print("地址(" + house.getAddress() + "): ");
        String address = Utility.readString(120, house.getAddress());
        System.out.print("月租(" + house.getPrice() + "): ");
        Double price = Utility.readDouble(house.getPrice());
        System.out.print("状态(" + (house.getStatus() == 0 ? "未出租" : "已出租") + "): ");
        Integer status = Utility.readInt(house.getStatus());

        house = houseRentSys.update(house, name, phone, address, price, status);

        if(house.getId() > 0) {
            System.out.println("--------------房屋修改成功--------------");
        } else {
            System.out.println("--------------房屋修改失败--------------");
        }

        return houseRentSys;
    }

    public void listHouse(HouseRentSys houseRentSys) {
        House[] houses = houseRentSys.getHouseList();
        if(houses.length > 0) {
            System.out.println("编号\t房东\t电话\t地址\t月租\t状态");
            for(int i = 0; i < houses.length; i++) {
                System.out.print(houses[i].getId() + "\t");
                System.out.print(houses[i].getName() + "\t");
                System.out.print(houses[i].getPhone() + "\t");
                System.out.print(houses[i].getAddress() + "\t");
                System.out.print(houses[i].getPrice() + "\t");
                System.out.println((houses[i].getStatus() == 0 ? "未出租" : "已出租"));
            }
        } else {
            System.out.println("--------------没有房屋--------------");
        }
    }

    public boolean logout(Scanner scanner) {
        System.out.println("请输入你的选择(y/n):");
        char choice = 'n';
        while(true) {
            choice = scanner.next().charAt(0);
            if(choice == 'y' || choice == 'n') {
                break;
            } else {
                System.out.print("选择错误, 请重新输入:");
            }
        }
        if(choice == 'y') {
            System.out.println("--------------欢迎下次光临--------------");
            return false;
        }

        return true;
    }
}
