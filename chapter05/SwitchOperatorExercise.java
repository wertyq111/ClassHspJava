/**
 * Switch��֧��ϰ
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class SwitchOperatorExercise
{
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);

		/**
		 * ʹ�� switch ��Сд���͵� char תΪ��д(��������). ֻת��a, b, c, d e.
		 * ���������other
		 */
		// System.out.println("������һ����תΪ��д���ַ�(a-e)");
		// char c = myScanner.next().charAt(0);
		char c = 'a';
		switch(c) {
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
				break;
			case 'e':
				System.out.println("E");
				break;
			default:
				System.out.println("ohter");
		}

		/**
		 * ��ѧ���ɼ�����60�ֵ����"�ϸ�", ����60�ֵ����"���ϸ�".
		 * (ע: ����ĳɼ����ܴ���100).
		 * ��ʾ: �ɼ� / 60
		 */
		System.out.println("������ɼ�");
		double score = myScanner.nextDouble();
		//int score = 0;
		if(score >= 0 && score <= 100) {
			switch((int)(score) / 60) {
				case 1:
					System.out.println("�ϸ�");
					break;
				case 0:
					System.out.println("���ϸ�");

			}
		} else {
			System.out.println("�ɼ����ܳ���100��С��0");
		}


		/**
		 * ��������ָ���·�,��ӡ���·������ļ���.
		 * 3-5����. 6-8�ļ�. 9-11�＾, 12-2����
		 * ��ʾ: ʹ�ô�͸
		 */
		System.out.println("�������·�");
		int month = myScanner.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
		}
	}
}