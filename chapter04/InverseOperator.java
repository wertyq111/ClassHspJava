/**
 * 取反运算操作
 * @author zhouxufeng
 * @version 1.0
 */
public class InverseOperator
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 10;

		//! 取反操作 Ture -> False, False -> Ture
		System.out.println(a < b);
		System.out.println(!(a < b));

		//^ 逻辑异或, 当 a 和 b 不同时, 则结果为 true, 否则为false
		boolean c = (a < b) ^ (a > 0);

		System.out.println("c= " + c);
	}
}