/**
 * �κ���ҵ
 *  �ж�һ������Ƿ�Ϊ����
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework03
{
	public static void main(String[] args)
	{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������һ�����");
        int year = myScanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("����������");
        } else {
            System.out.println("���겻������");
        }
	}
}