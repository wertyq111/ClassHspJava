/**
 * ��ҵ
 * ��д��A03,ʵ������ĸ��ƹ���copyArr,
 * ��������飬����һ�������飬Ԫ�غ;�����һ��
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework04
{
	public static void main(String[] args)
	{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("�������鳤��");
        int len = myScanner.nextInt();
        int[] array = new int[len];
        for(int i = 0; i < len; i++) {
            System.out.println("��������Ԫ��" + (i + 1));
            array[i] = myScanner.nextInt();
        }

        A03 a = new A03();
        a.copyArr(array);
	}
}

class A03
{
    public void copyArr(int[] array)
    {
        int[] newArr = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }

        System.out.println("���������");
        for(int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}