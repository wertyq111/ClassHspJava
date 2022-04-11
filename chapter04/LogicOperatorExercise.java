/**
 * 逻辑运算操作练习
 * @author zhouxufeng
 * @version 1.0
 */
public class LogicOperatorExercise
{
	public static void main(String[] args)
	{
		//输出结果
		int x = 5;
		int y = 5;

		if(x++ == 6 & ++y == 6) {
			x = 11;
		}

		System.out.println("x = " + x + ", y = " + y); // x = 6 , y = 6

		x = 5;
		y = 5;

		if(x++ == 6 && ++y == 6) {
			x = 11;
		}

		System.out.println("x = " + x + ", y = " + y); // x = 6, y = 5

		x = 5;
		y = 5;

		if(x++ == 5 | ++y == 5) {
			x = 11;
		}

		System.out.println("x = " + x + ", y = " + y); // x = 11, y = 6

		x = 5;
		y = 5;

		if(x++ == 5 || ++y == 5) {
			x = 11;
		}

		System.out.println("x = " + x + ", y = " + y);// x = 11, y = 5


		boolean a = true;
		boolean b = false;
		short c = 46;

		if((c++ == 46) && (b = true)) c++; //这里面有个套路, b = true 相当于b赋值为true,所以 b == true,所以执行c++;

		if((a = false) || (++c == 49)) c++; //a = false, 判断条件1结果为false, 但是++c = 49为true,所以执行c++;

		System.out.println("c = " + c);//50
	}
}