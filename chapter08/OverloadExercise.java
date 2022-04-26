/**
 * 方法重载练习
 * @author zhouxufeng
 * @version 1.0
 */
public class OverloadExercise
{
	public static void main(String[] args)
	{
		/**
		 * 1.判断题：
			与void show(inta,char b,double c)0构成重载的有：[b,c,d,e,g]
				a)void show(int x,char y,double z)(}
				b)int show(int a,double.c,char b){}
				c)void show(int a,double c,char b)}
				d)boolean show(int c,char b)(}
				e)void show(double c)}
				f)double show(int x,char y,double z)(}
				g)void shows(}
	    */


	    /**
	     * 编写程序，类Methods中定义三个重载方法并调用。方法名为m。三个方法分
			别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出
			结果，相乘并输出结果，输出字符串信息。在主类的main(O方法中分别用参数
			区别调用三个方法。
		*/
		Methods test = new Methods();
		test.m(2);
		test.m(3, 4);
		test.m("测试重载");


		/**
		 * 在Methods类，定义三个重载方法max(),第一个方法，返回两个int值中的最
			大值，第二个方法，返回两个double值中的最大值，第三个方法，返回三个
			double值中的最大值，并分别调用三个方法。
		*/
		System.out.println(test.max(2,3));
		System.out.println(test.max(3.2,3));
		System.out.println(test.max(21,7,5));
	}
}

class Methods
{
	public void m(int n){System.out.println(n * n);}
	public void m(int n1, int n2){System.out.println(n1 * n2);}
	public void m(String n){System.out.println(n);}

	public int max(int n1, int n2) { return n1 > n2 ? n1 : n2;}
	public double max(double n1, double n2) { return n1 > n2 ? n1 : n2;}

	public double max(double n1, double n2, double n3) { return  n1 > n2 ? n1 > n3 ? n1 : n2 > n3 ? n2 : n3 : n2 > n3 ? n2 : n3;}
}