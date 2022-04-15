/**
 * 课后作业
 * 编程实现如下功能
 *  某人有100,000元, 每经过一次路口,需要交费.规则如下:
 *      1. 当现金 > 50000 时,每次交 5%
 *      2. 当现金 <= 50000 时, 每次交 1000
 *  编程计算该人可以经过多少次路口. 
 *  要求: 使用 while break 方式完成
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework01
{
	public static void main(String[] args)
	{
        // 剩余金额
        double amount = 100000;
        // 路过次数
        int num = 0;
        // 过路费比例
        double rato = 0.05;
        // 过路费金额
        double passAmount = 1000;

        while(true) {
            if(amount > 50000.0) {
                amount -= amount * rato;
            } else if(amount <= 50000.0 && amount >= passAmount) {
                amount -= passAmount;
            } else { //现金低于 passAmount
                break;
            }
            num++;
        }

        System.out.println("通过" + num + "次路口, 现在剩余" + amount + "元,已经不能经过路口了");

	}
}