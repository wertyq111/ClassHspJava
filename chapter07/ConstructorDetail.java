/**
 * ���췽��/����������
 * @author zhouxufeng
 * @version 1.0
 */
public class ConstructorDetail
{
	public static void main(String[] args)
	{
		//������new һ�������ʱ�� ֱ��ͨ��������ָ�����ֺ�����
		Person p1 = new Person("jack");
		System.out.println("��ɶ����ʼ��");
		System.out.println("����: " + p1.name);
		System.out.println("����: " + p1.age);

		Dog dog = new Dog(); //ʹ�õ���Ĭ�ϵ��޲ι�����
	}
}

class Person
{
	String name;
	int age;

	//��һ��������
	public Person(String pName, int pAge)
	{
		System.out.println("��һ��������������");
		name = pName;
		age = pAge;
	}

	//�ڶ���������
	public Person(String pName)
	{
		System.out.println("�ڶ���������������");
		name = pName;
	}
}

class Dog
{
	//�������Աû�ж��幹������ϵͳ���Զ���������һ��Ĭ���޲ι�������Ҳ��Ĭ�Ϲ�������
	//ʹ��javapָ�Ϸ����뿴��
	/*
	Ĭ�Ϲ�����
	Dog()
	}
	*/
	//һ���������Լ��Ĺ�������Ĭ�ϵĹ������͸����ˣ��Ͳ�����ʹ��Ĭ�ϵ��޲ι�����
	//������ʽ�Ķ���һ�£�����DOg()³д��������Ҫ��
	public Dog(String dName)
	{
		//...
	}
	Dog() {
		//��ʾ�Ķ���һ�� �޲ι�����
	}
}