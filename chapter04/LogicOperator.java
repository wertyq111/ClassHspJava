/**
 * 逻辑运算操作
 * @author zhouxufeng
 * @version 1.0
 */
public class LogicOperator
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 10;

		if(a < 1 && ++b < 10) { // &&短路与,第一个条件false后不执行后续的条件判断
			System.out.println("ok100");
		}
		System.out.println("a = " + a + ", b = " + b); // a = 5, b = 10

		if(a < 1 & ++b < 10) { // &逻辑与,不论第一个条件为true或者false 都会执行后续的条件判断
			System.out.println("ok200");
		}
		System.out.println("a = " + a + ", b = " + b); // a = 5, b = 11

		b = 10;

		if(a < 10 & ++b > 10) { // &逻辑与,不论第一个条件为true或者false 都会执行后续的条件判断
			System.out.println("ok300");
		}
		System.out.println("a = " + a + ", b = " + b); // a = 5, b = 11

		System.out.println("=========================");

		b = 10;

		if(a < 10 || ++b < 10) { // ||短路或,第一个条件true后不执行后续的条件判断,效率高
			System.out.println("ok100");
		}
		System.out.println("a = " + a + ", b = " + b); // a = 5, b = 10

		if(a < 10 | ++b < 10) { // |逻辑或,不论第一个条件为true或者false 都会执行后续的条件判断,效率低
			System.out.println("ok200");
		}
		System.out.println("a = " + a + ", b = " + b); // a = 5, b = 11


	}
}