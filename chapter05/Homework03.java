/**
 * 课后作业
 *  判断一个年份是否为闰年
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework03
{
	public static void main(String[] args)
	{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = myScanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("该年是闰年");
        } else {
            System.out.println("该年不是闰年");
        }
	}
}