/**
 * �κ���ҵ
 *  ʵ���ж�һ������, �����ĸ���Χ: ����0, С��0, ����0
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework02
{
	public static void main(String[] args)
	{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������һ������");
        int number = myScanner.nextInt();

        if(number > 0) {
            System.out.println("��������0");
        } else if(number < 0) {
            System.out.println("����С��0");
        } else if(number == 0) {
            System.out.println("��������0");
        }
	}
}