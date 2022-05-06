/**
 * this的细节和注意事项
 * @author zhouxufeng
 * @version 1.0
 */
public class ThisDetail
{
	public static void main(String[] args)
	{
		Test t1 = new Test();
		t1.f2();
		t1.f3();
	}
}

class Test
{
	String name = "jack";
	int num = 100;

	//访问构造器语法：this(参数列表)；
	//注意只能在构造器中使用(即只能在构造器中访问另外一个构造器)
	//注意: 访问构造器语法 this(参数列表) ;必须放在第一条语句 
	Test()
	{
		this("jack", 10);
		System.out.println("无参构造器");
	}

	public Test(String name, int age)
	{
		System.out.println("有参构造器");
	}

	//访问成员方法的语法：this.方法名（参数列表）;
	public void f1()
	{
		System.out.println("f1() 方法");
	}

	public void f2()
	{
		System.out.println("f2() 方法");
		//调用本类的f1方法
		//第一种方式
		f1();
		//第二种方式
		this.f1();
	}

	//this关键字可以用来访问本类的属性、方法、构造器
	public void f3()
	{
		String name = "simth";

		System.out.println("姓名: " + name + "， 数量: " + num);
		System.out.println("姓名: " + this.name + "， 数量: " + this.num);
	}
}