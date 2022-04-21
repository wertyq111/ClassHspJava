/**
 * ������ֵ����
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
		 * �����������ʹ�����ֵ����. �βε��κθı䲻Ӱ��ʵ��
		 */
		MethodParameterClassA classA = new MethodParameterClassA();
		classA.reverseNum(a, b);
		System.out.println("��ǰa = " + a + ", b = " + b);

		int[] c = {1, 2, 3};
		/**
		 * �����������ʹ����ǵ�ַ����,�βε��޸Ļ�Ӱ�쵽ʵ��
		 * 
		 */
		MethodParameterClassB classB = new MethodParameterClassB();
		classB.printArr(c);
		System.out.println("main������");
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println("");

		/**
		 * ��֤����
		 */
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		MethodParameterClassC classC = new MethodParameterClassC();
		classC.test(p);
		System.out.println("����: " + p.name + ", ����: " + p.age);

	}
}

class MethodParameterClassA
{
	public void reverseNum(int a, int b)
	{
		System.out.println("ת��ǰa = " + a + ", b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("ת����a = " + a + ", b = " + b);
	}
}

class MethodParameterClassB
{
	public void printArr(int[] arr)
	{
		arr[0] = 200;
		System.out.println("classB������");
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