/**
 * ������ϰ
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class ArrayExercise
{
	public static void main(String[] args)
	{
		/**
		 * ����һ��char���͵�26��Ԫ�ص�����, �ֱ���� A-Z
		 * ʹ��forѭ����������Ԫ�ز���ӡ����
		 * ��ʾ: char������������ 'A'+1 -> 'B'
		 * 
		 */
		char columns[] = new char[26];
		for(int i = 0; i < columns.length; i++) {
			columns[i] = (char)('A' + i); //'A' + i ��int����,��Ҫǿ��ת��
		}

		for(int j = 0; j < columns.length; j++) {
			System.out.print(columns[j] + "\t");
		}
		System.out.println("-----------------------------------------------");


		/**
		 * �����һ������int[]�����ֵ{4,-1,9,10,23},���õ���Ӧ���±�
		 * 
		 */
		int number[] = {4, -1, 9, 10, 23};
		int maxNum = 0;
		int maxIndex = 0;

		for(int i = 1; i < number.length; i++) {
			if(number[i] > maxNum) {
				maxNum = number[i];
				maxIndex = i;
			}
		}

		System.out.println("�������ֵΪ: " + maxNum + ".��Ӧ�±���:" + maxIndex);


		System.out.println("-----------------------------------------------");

		/**
		 * �����һ������ĺͺ�ƽ��ֵ
		 * �� 6 ֻ�� (hens)
		 * �ֱ��� 1 , 3, 5, 7.5, 8, 50 ����
		 * 
		 */
		double hens[] = {1, 3, 5, 7.5, 8, 50};
		double hensSum = 0;
		double hensAvg = 0;
		for(int i = 0; i < hens.length; i++) {
			hensSum += hens[i];
		}

		System.out.println("�����Ϊ: " + hensSum);
		System.out.println("����ƽ��ֵΪ: " + (hensSum / hens.length));
	}
}