/**
 * ��ҵ
 * ����һ��Employee�࣬�����У����֣��Ա����䣬ְλ��нˮ����
 * �ṩ3�����췽�������Գ�ʼ��
 * (1)�����֣��Ա����䣬ְλ��нˮ
 * (2)�����֣��Ա����䣩
 * (3)(ְλ��нˮ)
 * Ҫ���ָ��ù�����
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework12
{
	public static void main(String[] args)
	{
        Employee employee1 = new Employee("jack", '��', 28, "Ա��", 12345.6);
        Employee employee2 = new Employee("lucky", 'Ů', 18);
        Employee employee3 = new Employee("ѧ��", 2500);
	}
}

class Employee 
{
    String name;
    char gender;
    int age;
    String position;
    double salary;

    public Employee(String name, char gender, int age, String position, double salary)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, char gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String position, double salary)
    {
        this.position = position;
        this.salary = salary;
    }
}