/**
 * this练习
 *  定义Person1类，里面有name、age属性，并提供compareTo比较方法，用于判断
	是否和另一个人相等，提供测试类TestPerson用于测试，名字和年龄完全一样，就
	返回true,否则返回false
 * @author zhouxufeng
 * @version 1.0
 */
public class ThisExercise
{
	public static void main(String[] args)
	{
		Person1 p1 = new Person1("jack", 18);
		Person1 p2 = new Person1("jack", 15);

		System.out.println(p2.compareTo(p1));
	}
}

class Person1
{
	String name;
	int age;

	public Person1(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(Person1 p)
	{
		// if(p.name.equals(this.name) && p.age == this.age) {
		// 	return true;
		// } else {
		// 	return false;
		// }
		return p.name.equals(this.name) && p.age == this.age;
	}
}