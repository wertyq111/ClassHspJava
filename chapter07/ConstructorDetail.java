/**
 * 构造方法/构造器详情
 * @author zhouxufeng
 * @version 1.0
 */
public class ConstructorDetail
{
	public static void main(String[] args)
	{
		//当我们new 一个对象的时候， 直接通过构造器指定名字和年龄
		Person p1 = new Person("jack");
		System.out.println("完成对象初始化");
		System.out.println("名字: " + p1.name);
		System.out.println("年龄: " + p1.age);

		Dog dog = new Dog(); //使用的是默认的无参构造器
	}
}

class Person
{
	String name;
	int age;

	//第一个构造器
	public Person(String pName, int pAge)
	{
		System.out.println("第一个构造器被调用");
		name = pName;
		age = pAge;
	}

	//第二个构造器
	public Person(String pName)
	{
		System.out.println("第二个构造器被调用");
		name = pName;
	}
}

class Dog
{
	//如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器（也叫默认构造器）
	//使用javap指合反编译看看
	/*
	默认构造器
	Dog()
	}
	*/
	//一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无参构造器
	//除非显式的定义一下，即：DOg()鲁写（这点很重要）
	public Dog(String dName)
	{
		//...
	}
	Dog() {
		//显示的定义一下 无参构造器
	}
}