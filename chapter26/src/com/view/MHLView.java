package com.view;

import com.domain.DiningTable;
import com.domain.Employee;
import com.domain.Menu;
import com.service.BillService;
import com.service.DiningTableService;
import com.service.EmployeeService;
import com.service.MenuService;
import com.utils.ScannerUtility;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 * 满汉楼界面
 */
@SuppressWarnings({"all"})
public class MHLView {
    private boolean loop = true;
    private String key;
    private EmployeeService employeeService = new EmployeeService();
    private DiningTableService diningTableService = new DiningTableService();
    private MenuService menuService = new MenuService();
    private BillService billService = new BillService();

    public static void main(String[] args) {
        new MHLView().mainMenu();
    }

    @Test
    public void mainMenu() {
        while(loop) {
            System.out.println("================满汉楼==============");
            System.out.println("\t\t 1. 登录满汉楼");
            System.out.println("\t\t 2. 退出满汉楼");
            System.out.print("请输入你的选择: ");
            key = ScannerUtility.readString(1);
            switch (key) {
                case "1":
                    System.out.print("请输入员工号: ");
                    String id = ScannerUtility.readString(11);
                    System.out.print("请输入密  码: ");
                    String pwd = ScannerUtility.readString(20);
                    //到数据库去判断
                    Employee employee = employeeService.getEmployeeByIdAndPwd(id, pwd);
                    if(employee != null) {
                        System.out.println("==========登录成功(" + employee.getName() + ")==========");
                        while(loop) {
                            //显示二级菜单,这里是循环操作,也要做一个 whil
                            System.out.println("==========满汉楼二级菜单==========");
                            System.out.println("\t\t 1. 显示餐桌状态");
                            System.out.println("\t\t 2. 预定餐桌");
                            System.out.println("\t\t 3. 显示所有的菜品");
                            System.out.println("\t\t 4. 点餐服务");
                            System.out.println("\t\t 5. 查看账单");
                            System.out.println("\t\t 6. 结账");
                            System.out.println("\t\t 9. 退出满汉楼");
                            System.out.print("请输入你的选择: ");
                            key = ScannerUtility.readString(1);
                            switch (key) {
                                case "1":
                                    diningTablesView();
                                    break;
                                case "2":
                                    reserveDinningTable();
                                    break;
                                case "3":
                                    menuView();
                                    break;
                                case "4":
                                    orderMenu();
                                    break;
                                case "5":
                                    break;
                                case "6":
                                    break;
                                case "9":
                                    loop = false;
                                    break;
                            }
                        }
                    } else {
                        System.out.println("==========登录失败==========");
                    }
                    break;
                case "2":
                    loop = false;
                    break;
                default:
                    System.out.print("输入错误,请重新输入: ");
            }
        }
    }

    /**
     * 餐桌状态列表
     */
    public void diningTablesView() {
        List<DiningTable> list = diningTableService.getDinigTables();
        System.out.println("餐桌编号\t\t状态");
        for(DiningTable diningTable : list) {
            System.out.println(diningTable.getId() + "\t\t\t" + diningTable.getState());
        }
        System.out.println("===========显示完毕==========");
    }

    /**
     * 预定餐桌
     */
    public void reserveDinningTable() {
        System.out.println("==========预定餐桌==========");
        System.out.print("请选择要预定餐桌编号(-1 退出):");
        boolean loop = true;
        //检测餐桌是否存在
        //检测餐桌的状态
        while(loop) {
            int orderId = ScannerUtility.readInt();
            if(orderId == -1) {
                System.out.println("==========取消预订==========");
                return;
            }


            DiningTable diningTable = diningTableService.getDiningTableById(orderId);

            if(diningTable == null) {
                System.out.print("餐桌编号" + orderId + "不存在, 请重新选择:");
            } else if(!diningTable.getState().equals("空")) {
                System.out.println("餐桌编号" + orderId + "不能被预定,请重新选择");
            } else {
                System.out.print("确认是否预定编号" + orderId + "餐桌(Y/N):");
                char key = ScannerUtility.readConfirmSelection();
                if(key == 'Y') {
                    System.out.print("请输入预订人名字:");
                    String orderName = ScannerUtility.readString(50);
                    System.out.print("请输入预订人电话:");
                    String orderTel = ScannerUtility.readString(20);
                    if(diningTableService.orderDiningTable(orderId, orderName, orderTel)) {
                        System.out.println("==========预订成功==========");
                        loop = false;
                    } else {
                        System.out.println("==========预订失败===========");
                        return;
                    }

                } else {
                    System.out.println("==========取消预订==========");
                    return;
                }
            }
        }
    }

    /**
     * 菜单列表
     */
    public void menuView() {
        List<Menu> list = menuService.getMenus();
        System.out.println("菜品编号\t\t菜品名\t\t类别\t\t 价格");
        for(Menu menu : list) {
            System.out.println(menu.getId() + "\t\t\t" + menu.getName() + "\t\t" + menu.getType() + "\t\t" + menu.getPrice());
        }
        System.out.println("===========显示完毕==========");
    }

    /**
     * 点餐功能
     */
    public void orderMenu() {
        System.out.println("==========点餐服务==========");
        boolean loop = true;
        int menuId = 0;
        int diningTableId = 0;
        int num = 0;
        while(loop) {
            if(diningTableId == 0) {
                System.out.print("请输入点餐的桌号(-1 退出): ");
                diningTableId = ScannerUtility.readInt();
                if(diningTableId == -1) {
                    System.out.println("==========点餐取消==========");
                    return;
                }
                DiningTable diningTable = diningTableService.getDiningTableById(diningTableId);
                if(diningTable == null) {
                    diningTableId = 0;
                    System.out.println("==========餐桌编号不存在==========");
                    continue;
                }
            }

            if(menuId == 0) {
                System.out.print("请输入点餐的菜品号(-1 退出): ");
                menuId = ScannerUtility.readInt();
                if(menuId == -1) {
                    System.out.println("==========点餐取消==========");
                    return;
                }
                Menu menu = menuService.getMenuById(menuId);
                if(menu == null) {
                    menuId = 0;
                    System.out.println("==========菜单编号不存在==========");
                    continue;
                }
            }

            System.out.print("请输入点餐的菜品量(-1 退出): ");
            num = ScannerUtility.readInt();
            if(num == -1) {
                System.out.println("==========点餐取消==========");
                return;
            }

            loop = false;
        }

        //点餐操作
        if(billService.orderMenu(menuId, num, diningTableId)) {
            System.out.println("==========点餐成功==========");
        } else {
            System.out.println("==========点餐失败==========");
        }
    }
}
