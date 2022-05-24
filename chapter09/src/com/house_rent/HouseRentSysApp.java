package com.house_rent;

import com.house_rent.model.House;
import com.house_rent.model.HouseRentSys;

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
                    app.addHouse(scanner, houseRentSys);
                    break;
                case 2:
                    app.findHouse(scanner, houseRentSys);
                    break;
                case 3:
                    app.deleteHouse(scanner, houseRentSys);
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
}
