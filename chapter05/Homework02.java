/**
 * 课后作业
 *  实现判断一个整数, 属于哪个范围: 大于0, 小于0, 等于0
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework02
{
	public static void main(String[] args)
	{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = myScanner.nextInt();

        if(number > 0) {
            System.out.println("该数大于0");
        } else if(number < 0) {
            System.out.println("该数小于0");
        } else if(number == 0) {
            System.out.println("该数等于0");
        }
	}
}