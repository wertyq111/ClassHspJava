/**
 * Ƕ�׷�֧
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class NestedIf
{
	public static void main(String[] args)
	{
		/**
		 * ����:
		 * 	�μӸ��ֱ���,��������ɼ�����8.0�������,������̭.���Ҹ����Ա���ʾ�����������Ů����.
		 * 	����ɼ����Ա�,�жϺ������Ϣ
		 * 	��ʾ:
		 * 		double score;char gender
		 * 		�����ַ�: char gender = Scanner.next().charAt(0);
		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ɼ�");
		double score = myScanner.nextDouble();

		if (score > 8.0) {
			System.out.println("�������Ա�");
		    char gender = myScanner.next().charAt(0);
			if (gender == '��') {
				System.out.println("��ϲ�����質�������������!");
			} else if (gender == 'Ů') {
				System.out.println("��ϲ�����質����Ů�������!");
			} else {
				System.out.println("���!����!");
			}
		} else {
			System.out.println("���ź�,��ĳɼ�û�н������");
		}
	}
}