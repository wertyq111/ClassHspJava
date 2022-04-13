/**
 * if(分支)快速入门练习
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class IfOperatorExercise
{
	public static void main(String[] args)
	{
        //程序输出结果?
        //  输出: 程序继续
        int x = 7;
        int y = 4;

        if (x > 5) {
            if (y > 5) {
                System.out.println(x + y);
            }

            System.out.println("程序继续");
        } else {
            System.out.println("x is " + x);
        }

        Scanner myScanner = new Scanner(System.in);

        //声明2个double变量并赋值.判断第一个数大于10.0且第二个数小于20.0,打印两数之和
        System.out.println("请输入两个小数");
        double num1 = myScanner.nextDouble();
        double num2 = myScanner.nextDouble();
        if (num1 > 10.0 && num2 < 20.0) {
            System.out.println(num1 + num2);
        } else {
            System.out.println("您输入的两个小数分别是: " + num1 + ", " + num2);
        }

        //定义两个int变量,判断二者之和是否能被3和5整除
        System.out.println("请输入两个整数");
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        int c = a + b;
        if (c % 3 == 0 && c % 5 == 0) {
            System.out.println("恭喜您,你猜中了盲数");
        } else {
            System.out.println("您输入的两个整数分别是: " + a + ", " + b);
        }

        //判断一个年份是否是闰年.
        //  闰年条件(符合二者之一):
        //      1. 年份能被4整除,但不能被100整除
        //      2. 能被400整除
        System.out.println("请输入一个年份");
        int year = myScanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("该年是闰年");
        } else {
            System.out.println("又是一年");
        }

    }
}