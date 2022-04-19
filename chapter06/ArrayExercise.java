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

		/**
		 * ���鿽��
		 * �� int[] arr1 = {10, 20, 30}; ������ arr2 �ռ���
		 * Ҫ�����ݿռ����
		 */
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[arr1.length];

		//����arr1 ��ֵ������arr2 ��
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.println("========arr1Ԫ��=========");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println("\n========arr2Ԫ��=========");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println("");

		/**
		 * ���鷭ת
		 * 
		 */
		int[] arr = {11, 22, 33, 44, 55, 66};

		for(int i = 0, j = (arr.length - 1); i < arr.length / 2; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.println("------arrԪ��------");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}