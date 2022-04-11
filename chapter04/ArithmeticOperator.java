/**
 * 运算符操作
 * @author zhouxufeng
 * @version 1.0
 */
public class ArithmeticOperator
{
	public static void main(String[] args)
	{
		System.out.println(10 / 4);//数学上2.5, java中2;
		System.out.println(10.0 / 4);//java中2.5;
		double num = 10 / 4;//java中运算结果是2,转成double类型后为2.0;
		System.out.println(num);


		//% 取模,取余
		//java中 % 的公式为: a % b = a - a / b * b;
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); //1

		//++ 使用
		//++i 先自增再赋值
		//i++ 先赋值再自增
		int i = 8;
		int j = ++i; //等价: i = i + 1; j = i;
		System.out.println("i = " + i + "\nj = " + j + "\n"); // i = 9; j = 9;

		j = i++; //等价: j = i; i = i + 1;
		System.out.println("i = " + i + "\nj = " + j + "\n"); // i = 10; j = 9; 
	}
}