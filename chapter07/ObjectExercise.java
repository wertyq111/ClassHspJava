/**
 * ���������ϵ
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class ObjectExercise
{
	public static void main(String[] args)
	{
		/**
		 * ���ʲô��Ϣ,���з���
		 * ����
		 * 	1. ���� Person ��
		 *  2. ʵ�������� a ����ֵ name, age
		 * 	3. ���� Person ��
		 * 	4. ʵ�������� b �������� a �ĵ�ַ������ b
		 * 	5. ��� b.name = С��
		 * 	6. �޸� b.age = 200. ��ַָ����еĻ����������͵�ageֵ�޸�Ϊ200
		 * 	7. ���� b Ϊnull, ɾ�� b ָ��ѵĵ�ַ
		 * 	8. ��� a.age = 200
		 * 	9. ��� b.age. b Ϊnull �Ҳ���ָ����еĵ�ַ.����: ��ָ��NullPointer
		 * 
		 */
		Person a = new Person();
		a.name = "С��";
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