/**
 * this��ϸ�ں�ע������
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

	//���ʹ������﷨��this(�����б�)��
	//ע��ֻ���ڹ�������ʹ��(��ֻ���ڹ������з�������һ��������)
	//ע��: ���ʹ������﷨ this(�����б�) ;������ڵ�һ����� 
	Test()
	{
		this("jack", 10);
		System.out.println("�޲ι�����");
	}

	public Test(String name, int age)
	{
		System.out.println("�вι�����");
	}

	//���ʳ�Ա�������﷨��this.�������������б�;
	public void f1()
	{
		System.out.println("f1() ����");
	}

	public void f2()
	{
		System.out.println("f2() ����");
		//���ñ����f1����
		//��һ�ַ�ʽ
		f1();
		//�ڶ��ַ�ʽ
		this.f1();
	}

	//this�ؼ��ֿ����������ʱ�������ԡ�������������
	public void f3()
	{
		String name = "simth";

		System.out.println("����: " + name + "�� ����: " + num);
		System.out.println("����: " + this.name + "�� ����: " + this.num);
	}
}