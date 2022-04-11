/**
 * 赋值运算操作
 * @author zhouxufeng
 * @version 1.0
 */
public class AssignOperator
{
	public static void main(String[] args)
	{
		int a = 5;

		a += 6;

		System.out.println(a); // 11;

		a /= 2;

		System.out.println(a); //5

		//复合赋值运算会进行类型转换
		byte b = 3;

		b += 2; //等价于 b = (byte)(b + 2);
		b++; //等价于 b = (byte)(b + 1);

		System.out.println(b); //6
	}
}