/**
 * 构造器练习
 *  在前面定义的Person类中添加两个构造器：
	第一个无参构造器：利用构造器设置所有人的age属性初始值都为18
	第二个带pName和pAge两个参数的构造器：使得每次创建Person对象的同
	时初始化对象的age属性值和name属性值。分别使用不同的构造器，创建对
	象.
 * @author zhouxufeng
 * @version 1.0
 */
public class ConstructorExercise
{
	public static void main(String[] args)
	{
		System.out.println("调用第一个构造器");
		Person p1 = new Person();
		System.out.println("完成对象初始化");
		System.out.println("姓名: " + p1.name);
		System.out.println("年龄: " + p1.age);

		System.out.println("调用第二个构造器");
		Person p2 = new Person("LiLei", 22);
		System.out.println("完成对象初始化");
		System.out.println("姓名: " + p2.name);
		System.out.println("年龄: " + p2.age);
	}
}

class Person
{
	String name;
	int age;
	
	Person()
	{
		age = 18;
	}

	public Person(String pName, int pAge)
	{
		name = pName;
		age = pAge;
	}
}