/**
 * 三元运算操作
 * @author zhouxufeng
 * @version 1.0
 */
public class TernaryOperator
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 5;

		/**
		 * 解读
		 * 1. a > b 为 false
		 * 2. 返回 b-- ,先赋值,再 b - 1
		 * 3. result = 5
		 */
		int result = a > b ? a++ : b--;

		System.out.println(result); // 5

		//表达式1和表达式2要为可以赋值给接收变量的类型(或可以自动转换)
		a = 2;
		b = 3;
		int c = a > b ? (int)2.6 : (int)3.78;
		double d = a > b ? a++ : b--; //可以编译, 符合int --> double

		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
	}
}