package com.view;

import com.domain.Employee;
import com.service.EmployeeService;
import com.utils.ScannerUtility;
import org.testng.annotations.Test;

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
                    System.out.println("请输入员工号: ");
                    String id = ScannerUtility.readString(11);
                    System.out.println("请输入密  码: ");
                    String pwd = ScannerUtility.readString(20);
                    //到数据库去判断
                    Employee employee = employeeService.getEmployeeByIdAndPwd(id, pwd);
                    System.out.println(employee);
                    if(employee != null) {
                        System.out.println("==========登录成功==========");
                        //显示二级菜单,这里是循环操作,也要做一个 whil
                        System.out.println("==========满汉楼二级菜单==========");
                        System.out.println("\t\t 1. 显示餐桌状态");
                        System.out.println("\t\t 2. 预定餐桌");
                        System.out.println("\t\t 3. 显示所有的菜品");
                        System.out.println("\t\t 4. 点餐服务");
                        System.out.println("\t\t 5. 查看账单");
                        System.out.println("\t\t 6. 结账");
                        System.out.println("\t\t 9. 退出满汉楼");
                        System.out.println("请输入你的选择: ");
                        key = ScannerUtility.readString(1);

                    } else {
                        System.out.println("==========登录失败==========");
                    }
                    break;
                case "2":
                    loop = false;
                    break;
                default:
                    System.out.println("输入错误,请重新输入: ");
            }
        }
    }
}
