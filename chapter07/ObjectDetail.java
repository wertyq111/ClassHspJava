/**
 * �����������
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class ObjectDetail
{
	public static void main(String[] args)
	{
        //ʹ��OOP���������
        //ʵ����һֻè(����һֻè)
        //�Ϻ����
        //  1. new Cat() ����һֻè
        //  2. Cat cat1 = new Cat(); �Ѵ�����è���� cat1
        //  3. cat1 ����һ������
        Cat cat1 = new Cat();
        cat1.name = "С��";
        cat1.age = 3;
        cat1.color = "��ɫ";

        Cat cat2 = new Cat();
        cat2.name = "С��";
        cat2.age = 100;
        cat2.color = "��ɫ";

        System.out.println("��һֻè����Ϣ \n ����: " + cat1.name + "\t����: " + cat1.age + "\t��ɫ: " + cat1.color);
        System.out.println("�ڶ�ֻè����Ϣ \n ����: " + cat2.name + "\t����: " + cat2.age + "\t��ɫ: " + cat2.color);
    }
}

/**
 * ʹ���������ķ�ʽ�������è����
 * 
 * ����һ��è�� Cat -> �Զ�����������
 */
class Cat 
{
    //����/��Ա����
    String name; //����
    int age; //����
    String color; //��ɫ
}