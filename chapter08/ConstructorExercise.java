/**
 * ��������ϰ
 *  ��ǰ�涨���Person�������������������
	��һ���޲ι����������ù��������������˵�age���Գ�ʼֵ��Ϊ18
	�ڶ�����pName��pAge���������Ĺ�������ʹ��ÿ�δ���Person�����ͬ
	ʱ��ʼ�������age����ֵ��name����ֵ���ֱ�ʹ�ò�ͬ�Ĺ�������������
	��.
 * @author zhouxufeng
 * @version 1.0
 */
public class ConstructorExercise
{
	public static void main(String[] args)
	{
		System.out.println("���õ�һ��������");
		Person p1 = new Person();
		System.out.println("��ɶ����ʼ��");
		System.out.println("����: " + p1.name);
		System.out.println("����: " + p1.age);

		System.out.println("���õڶ���������");
		Person p2 = new Person("LiLei", 22);
		System.out.println("��ɶ����ʼ��");
		System.out.println("����: " + p2.name);
		System.out.println("����: " + p2.age);
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