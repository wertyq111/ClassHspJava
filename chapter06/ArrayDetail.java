/**
 * ������ʾ
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class ArrayDetail
{
	public static void main(String[] args)
	{
		//��ʾ 
		//		��������  ������[] = new ��������[��С]
		//		��������[]  ������ = new ��������[��С]
		//	1. ��������
		//	2. ѭ������
		//		array.length ��ʾ����Ĵ�С/����
		//	3. ѭ�����

		//double scores[] = new double[5];
		double[] scores; //��������.��ʱ scores ��null
		scores = new double[5];

		Scanner myScanner = new Scanner(System.in);

		for(int i = 0; i < scores.length; i++) {
			System.out.println("����༶���" + (i + 1) + "��ͬѧ�ĳɼ�");
			double score = myScanner.nextDouble();
			scores[i] = score;
		}

		System.out.println("��¼����!��ʼȷ��ѧ���ɼ�");
		for(int i = 0; i < scores.length; i++) {
			System.out.println("ͬѧ" + (i + 1) + "�ĳɼ���:" + scores[i]);
		}
	}
}