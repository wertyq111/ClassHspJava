/**
 * 方法传值机制
 * @author zhouxufeng
 * @version 1.0
 */
public class MethodParameterDetail
{
	public static void main(String[] args)
	{
		int a = 3;
		int b = 2;
		/**
		 * 基本数据类型传参是值拷贝. 形参的任何改变不影响实参
		 */
		MethodParameterClassA classA = new MethodParameterClassA();
		classA.reverseNum(a, b);
		System.out.println("当前a = " + a + ", b = " + b);

		int[] c = {1, 2, 3};
		/**
		 * 引用数据类型传参是地址拷贝,形参的修改会影响到实参
		 * 
		 */
		MethodParameterClassB classB = new MethodParameterClassB();
		classB.printArr(c);
		System.out.println("main中数组");
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println("");

		/**
		 * 验证对象
		 */
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		MethodParameterClassC classC = new MethodParameterClassC();
		classC.test(p);
		System.out.println("姓名: " + p.name + ", 年龄: " + p.age);

	}
}

class MethodParameterClassA
{
	public void reverseNum(int a, int b)
	{
		System.out.println("转换前a = " + a + ", b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("转换后a = " + a + ", b = " + b);
	}
}

class MethodParameterClassB
{
	public void printArr(int[] arr)
	{
		arr[0] = 200;
		System.out.println("classB中数组");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}

class MethodParameterClassC
{
	public void test(Person p)
	{
		//p.age = 100;
		p = null;
	}
}

class Person
{
	String name;
	int age;
}