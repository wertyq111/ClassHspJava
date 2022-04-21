/**
 * ������ϵ
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class MethodExercise
{
	public static void main(String[] args)
	{
        /**
         * ��д��AA�·���: �ж�һ����������(odd)����ż��,����boolean
         * 
         */
        // Scanner myScanner = new Scanner(System.in);
        // System.out.println("������һ������");
        // int num = myScanner.nextInt();
        // AA tool = new AA();
        // boolean flag = tool.IsOdd(num);
        // if(flag == true) {
        //     System.out.println("����һ��ż��");
        // } else {
        //     System.out.println("����һ������");
        // }

        /**
         * ������, ��, �ַ���ӡ ��Ӧ�������������ַ�
         * ����: ��: 4, ��: 4, �ַ� #
         * ��ӡ��Ӧ��Ч��
         * ####
         * ####
         * ####
         * ####
         * 
         */
        // System.out.println("����������");
        // int row = myScanner.nextInt();
        // System.out.println("����������");
        // int col = myScanner.nextInt();
        // System.out.println("�������ַ�");
        // char field = myScanner.next().charAt(0);
        // tool.PrintGraphics(row, col, field);

        /**
         * ��д��MyTools��, ��дһ���������Դ�ӡ��ά���������
         * 
         */
        MyTools tools = new MyTools();
        int[][] map = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };
        tools.printArr(map);

        /**
         * ��дһ������copyPerson.
         * ���Ը���һ��Person����. 
         * ���ظ��ƵĶ���. 
         * ��¡���� 
         * ע��Ҫ��õ��¶����ԭ�����������������Ķ���
         * ֻ�����ǵ�������ͬ
         */
        Person p = new Person();
        p.name = "jack";
        p.age = 100;
        Person p2 = tools.copyPerson(p);
        System.out.println("����: " + p2.name + ", ����: " + p2.age);
	}
}

class AA
{
    public boolean IsOdd(int num)
    {
        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void ConvertAscii(int row, int col)
    {
        String[][] ascii = {
            {"NUT", "SOH", "STX", "ETX", "EOT", "ENQ"},
            {"VT", "FF", "CR", "SO", "SI"},
            {"NAK", "SYN", "TB", "CAN", "EM"},
            {"US", "(space)", "!", "\"", "#"},
            {"(", ")", "*", "+", ","}
        };

        System.out.println("���������������õ����ַ�: " + ascii[row][col]);
    }

    public void PrintGraphics(int row, int col, char field)
    {
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                System.out.print(field + " ");
            }
            System.out.println("");
        }
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

    public Person copyPerson(Person p)
    {
        Person p1 = new Person();
        p1.name = p.name;
        p1.age = p.age;

        return p1;
    }
}

class Person
{
    String name;
    int age;
}
