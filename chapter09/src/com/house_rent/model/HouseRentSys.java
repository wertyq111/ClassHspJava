package com.house_rent.model;

/**
 * 房源出租类
 * 包含字段: price(月租价格), status(出租状态)
 * 包含业务公共方法: add(添加房源), update(修改房源), delete(删除房源), list(房源列表), findById(通过查找房源)
 * 包含内部类方法: getMaxId(获取已有房源最大的id)
 * 包含业务显示方法: displayMenu(主界面显示)
 */
public class HouseRentSys extends House {
    private House[] houseList;

    public HouseRentSys() { }

    public HouseRentSys(String name, String phone, String address, double price, int status) {
        super(name, phone, address, price, status);
    }
    public House add(String name, String phone, String address, double price) {
        House house = new House();
        //设置id: 获取已有房源最大的id + 1
        house.setId(getMaxId() + 1);
        //设置其他字段
        house.setName(name);
        house.setPhone(phone);
        house.setAddress(address);
        house.setPrice(price);
        //设置出租状态: 0-未出租, 1-已出租
        house.setStatus(0);

        addHouseList(house);
        return house;
    }

    protected void addHouseList(House house) {
        int length;
        if(houseList == null) {
            length = 0;
        } else {
            length = houseList.length;
        }
        House[] temp = new House[length + 1];
        for (int i = 0; i < length; i++) {
            temp[i] = houseList[i];
        }
        temp[temp.length - 1] = house;
        houseList = temp;
    }

    @Override
    public House update(House house, String name, String phone, String address, double price, int status) {
        return super.update(house, name, phone, address, price, status);
    }

    public boolean delete(int id) {
        //根据id查找是否存在该房源
        House house = findById(id);
        if(house != null) {
            if (houseList.length > 0) {
                House[] tempHouses = new House[houseList.length - 1];
                if(tempHouses.length > 0) {
                    for (int i = 0; i < houseList.length; i++) {
                        if (houseList[i].getId() != id) {
                            tempHouses[i] = houseList[i];
                        }
                    }
                }
                houseList = tempHouses;
            }
            return true;
        }
        return false;
    }

    public House[] list() {
        return houseList;
    }

    /**
     * 通过id查找房源
     * @param id
     * @return House|null
     */
    public House findById(int id) {
        if(houseList == null) {
            return null;
        }

        for(int i = 0; i < houseList.length; i++) {
            if(houseList[i].getId() == id) {
                return houseList[i];
            }
        }

        return null;
    }

    /**
     * 获取已有房源最大的id
     * @return int
     */
    protected int getMaxId() {
        if(houseList != null) {
            int maxId = 0;
            for(int i = 0; i < houseList.length; i++) {
                if(houseList[i].getId() > maxId) {
                    maxId = houseList[i].getId();
                }
            }
            return maxId;
        } else {
            return 0;
        }
    }

    /**
     * 主界面显示
     * @return String
     */
    public String displayMenu() {
        String mainMenu = "-----------------房源出租系统-----------------\n";
        mainMenu += "\t\t\t1 新 增 房 源\n";
        mainMenu += "\t\t\t2 查 找 房 屋\n";
        mainMenu += "\t\t\t3 删 除 房 屋\n";
        mainMenu += "\t\t\t4 修 改 房 屋 信 息\n";
        mainMenu += "\t\t\t5 房 屋 列 表\n";
        mainMenu += "\t\t\t6 退 出 系 统\n";

        return mainMenu;
    }

    public void addHouse() {

    }
}
