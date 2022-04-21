/**
 * 类与对象详情
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class RecursionExercise
{
	public static void main(String[] args)
	{
		/**
		 * 请使用递归的方式求出斐波那契数1,1,2,3,5,8,13.…给你一个整数n
		 * 求出它的值是多少
		 * 
		 * 思路分析
		 * 	1. 斐波那契数 表达式: F[n]=F[n-1]+F[n-2](n>=2,F[0]=0,F[1]=1)
		 * 	2. n = 1 -> 1
		 * 	3. n = 2 -> 0 + 1 = 1
		 * 	4. n = 3 -> 1 + 1 = 2
		 * 	5. n = 4 -> 2 + 1 = 3
		 * 	6. n = 5 -> 3 + 2 = 4
		 * 	7. n >= 3 前两个数之和
		 * 
		 */
		Tools tool = new Tools();
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入一个大于等于0的整数");
		int num = myScanner.nextInt();
		int fibonacci = tool.getSum(num);
		System.out.println("斐波那契数: " + fibonacci);
	}
}

class Tools
{
	public int getSum(int n)
	{
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return getSum(n - 1) + getSum(n - 2);
		}
	}
}