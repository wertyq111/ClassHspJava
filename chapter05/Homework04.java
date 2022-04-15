/**
 * 课后作业
 *  判断一个整数是否是水仙花数.
 *  水仙花数: 指一个3位数,其各个位上数字立方和等于其本身.
 *  例如: 153 = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework04
{
	public static void main(String[] args)
	{
        /**
         * 整数提去方式
         * 百位数: number / 100
         * 十位数: number % 100 / 10
         * 个位数: number % 10
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个3位的整数");
        String number = myScanner.next();
        int sum = 0;

        //判断数字是否是三位数或
        // number / 1000  > 0 超过三位数
        // number / 100 < 1 低于三位数
        while(true) {
            if(Integer.parseInt(number) / 1000 > 0 || Integer.parseInt(number) / 100 < 1) {
                System.out.println("你输入的不是3位整数");
                number = myScanner.next();
            } else {
                break;
            }
        }

        for(int i = 0; i <= 2; i++) {
            //根据字符转换获得每个数
            int num = Integer.parseInt(number.charAt(i) + "");
            int numCubic = 1;
            for(int j = 1; j <= 3; j++) {
                numCubic *= num;
            }
            sum += numCubic;
        }

        if(Integer.parseInt(number) == sum) {
            System.out.println("这是水仙花数");
        } else {
            System.out.println("这不是水仙花数");
        }
	}
}