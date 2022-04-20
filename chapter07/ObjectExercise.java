/**
 * 类与对象联系
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class ObjectExercise
{
	public static void main(String[] args)
	{
		/**
		 * 输出什么信息,进行分析
		 * 分析
		 * 	1. 声明 Person 类
		 *  2. 实例化对象 a 并赋值 name, age
		 * 	3. 声明 Person 类
		 * 	4. 实例化对象 b 并将对象 a 的地址拷贝给 b
		 * 	5. 输出 b.name = 小明
		 * 	6. 修改 b.age = 200. 地址指向堆中的基本数据类型的age值修改为200
		 * 	7. 对象 b 为null, 删除 b 指向堆的地址
		 * 	8. 输出 a.age = 200
		 * 	9. 输出 b.age. b 为null 找不到指向堆中的地址.报错: 空指针NullPointer
		 * 
		 */
		Person a = new Person();
		a.name = "小明";
		a.age = 10;
		Person b;
		b = a;
		System.out.println(b.name);
		b.age = 200;
		b = null;
		System.out.println(a.age);
		System.out.println(b.age);
	}
}

class Person
{
	String name;
	int age;
}