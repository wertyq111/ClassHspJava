/**
 * this��ϰ
 *  ����Person1�࣬������name��age���ԣ����ṩcompareTo�ȽϷ����������ж�
	�Ƿ����һ������ȣ��ṩ������TestPerson���ڲ��ԣ����ֺ�������ȫһ������
	����true,���򷵻�false
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