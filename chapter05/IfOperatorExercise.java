/**
 * if(��֧)����������ϰ
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class IfOperatorExercise
{
	public static void main(String[] args)
	{
        //����������?
        //  ���: �������
        int x = 7;
        int y = 4;

        if (x > 5) {
            if (y > 5) {
                System.out.println(x + y);
            }

            System.out.println("�������");
        } else {
            System.out.println("x is " + x);
        }

        Scanner myScanner = new Scanner(System.in);

        //����2��double��������ֵ.�жϵ�һ��������10.0�ҵڶ�����С��20.0,��ӡ����֮��
        System.out.println("����������С��");
        double num1 = myScanner.nextDouble();
        double num2 = myScanner.nextDouble();
        if (num1 > 10.0 && num2 < 20.0) {
            System.out.println(num1 + num2);
        } else {
            System.out.println("�����������С���ֱ���: " + num1 + ", " + num2);
        }

        //��������int����,�ж϶���֮���Ƿ��ܱ�3��5����
        System.out.println("��������������");
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        int c = a + b;
        if (c % 3 == 0 && c % 5 == 0) {
            System.out.println("��ϲ��,�������ä��");
        } else {
            System.out.println("����������������ֱ���: " + a + ", " + b);
        }

        //�ж�һ������Ƿ�������.
        //  ��������(���϶���֮һ):
        //      1. ����ܱ�4����,�����ܱ�100����
        //      2. �ܱ�400����
        System.out.println("������һ�����");
        int year = myScanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("����������");
        } else {
            System.out.println("����һ��");
        }

    }
}