/**
 * ��ҵ
 * ���һ��Dog�࣬�����֡���ɫ���������ԣ������������show()
 * ��ʾ����Ϣ���������󣬽��в��ԡ�����ʾthis.���ԡ�
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework07
{
	public static void main(String[] args)
	{
        Dog d = new Dog("boom", "white", 2);
        d.show();
	}
}

class Dog
{
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age)
    {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show()
    {
        System.out.println("С������: " + this.name);
        System.out.println("С����ɫ: " + this.color);
        System.out.println("С������: " + this.age);
    }
}