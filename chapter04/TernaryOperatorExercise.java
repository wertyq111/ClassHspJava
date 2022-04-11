/**
 * 三元运算操作练习
 * @author zhouxufeng
 * @version 1.0
 */
public class TernaryOperatorExercise
{
	public static void main(String[] args)
	{
		//实现三个数的最大值
		int a = 2;
		int b = 3;
		int c = a > b ? (int)2.6 : (int)4.78;

		int x = a > b ? a : b;
		int y = x > c ? x : c;


		System.out.println("最大的数为" + y);
	}
}