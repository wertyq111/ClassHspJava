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
		int fibonacci = tool.getFibonacci(num);
		System.out.println("斐波那契数: " + fibonacci);

		/**
		 * 猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
		 * 想再吃时（即还没吃），发现只有1个桃子了。
		 * 问题：最初共多少个桃子？
		 * 
		 * 思路分析
		 * 	1. 桃子 = n
		 * 	2. day 10 -> 1
		 * 	3. day 9  -> (1 + 1) * 2 = 4
		 * 	4. day 8  -> (4 + 1) * 2 = 10
		 * 	5. day 7  -> (10 + 1) * 2 = 22
		 * 	6. day 6  -> (22 + 1) * 2 = 46
		 * 	7. 规律: n天的桃子 = ((n + 1)天桃子 + 1) * 2
		 */
		int days = 10;
		int peach = tool.monkeyEat(days);
		System.out.println("猴子最开始有: " + peach + "个桃");
	}
}

class Tools
{
	/**
	 * 斐波那契数
	 */
	public int getFibonacci(int n)
	{
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return getFibonacci(n - 1) + getFibonacci(n - 2);
		}
	}

	/**
	 * 猴子吃桃
	 */
	public int monkeyEat(int day)
	{
		if(day == 1) {
			return 1;
		} else {
			return (monkeyEat(day - 1) + 1) * 2;
		}
	}
}