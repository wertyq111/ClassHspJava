/**
 * ��������
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class MethodDetail
{
	public static void main(String[] args)
	{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("����һ������1������");
        int num = myScanner.nextInt();
        Person p = new Person();
        p.speak();
        p.cal01();
        p.cal02(num);

        System.out.println("������������1������");
        int num1 = myScanner.nextInt();
        int num2 = myScanner.nextInt();

        int sum = p.getSum(num1, num2);
        System.out.println("�������������ͽ��: " + sum);

        /**
         * ����һ������, �������ĸ���Ԫ��
         * int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};
         * 
         */
        int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};
        MyTools tools = new MyTools();
        tools.printArr(map);

        System.out.println("����һ������");
        num = myScanner.nextInt();
        tools.getNum(num);
	}
}

class Person 
{
    String name;
    int age;
    //���� speak ��Ա����, ���"����һ������"
    //1. public ��ʾ�����ǹ�����
    //2. void ��ʾ����û�з���ֵ
    //3. speak() ��ʾ������(�β��б�)
    //4. {} ������: ����д��صĹ���
    public void speak()
    {
        System.out.println("����һ������");
    }

    //���� cal01 ��Ա����, ���Լ���� 1+..+1000 �Ľ��
    public void cal01()
    {
        int sum = 0;
        for(int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("cal01 ������ = " + sum);
    }

    //���� cal02 ��Ա����, �÷������Խ���һ����n, ����� 1+..+n �Ľ��
    public void cal02(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("cal02 ������ = " + sum);
    }

    //���� getSum ��Ա����, ���Լ����������ĺ�
    //�Ϻ����
    //  1. public ��ʾ�����ǹ�����
    //  2. int  ��ʾ����ִ�к�,����һ�� int ֵ
    //  3. getSum ������
    //  4. (int num1, int num2) �β��б�, 2���β�, ���Խ����û�����2����
    //  5. return num1 + num2 ���ؽ��
    public int getSum(int num1, int num2)
    {
        return num1 + num2;
    }
}

class MyTools
{
    public void printArr(int[][] map)
    {
        System.out.println("------ѭ�����鿪ʼ------");
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
        }
        System.out.println("\n------ѭ���������------");
    }

    public void printNum(int n)
    {
        System.out.println("�����������: " + n);
    }

    public void getNum(int n)
    {
        printNum(n);
        System.out.println("ִ�����");
    }
}