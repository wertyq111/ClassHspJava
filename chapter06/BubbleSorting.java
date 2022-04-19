/**
 * ð������
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class BubbleSorting
{
	public static void main(String[] args)
	{
        /**
         * �������: 24, 69, 80, 57, 13
         * ʹ��ð�����򷨽����ų�һ����С�������������
         * 
         * ˼·����
         *  1. �������� {24, 69, 80, 57, 13}
         *  2. ��һ������
         *      1. �� 1 �αȽ�: {24, 69, 80, 57, 13}  �±�Ƚ�: 0 -> 1 
         *      2. �� 2 �αȽ�: {24, 69, 80, 57, 13}  �±�Ƚ�: 1 -> 2
         *      3. �� 3 �αȽ�: {24, 69, 57, 80, 13}  �±�Ƚ�: 2 -> 3  ����λ�öԻ�
         *      4. �� 4 �αȽ�: {24, 69, 57, 13, 80}  �±�Ƚ�: 3 -> 4  ����λ�öԻ�
         *  3. �ڶ�������
         *      1. �� 1 �αȽ�: {24, 69, 57, 13, 80}  �±�Ƚ�: 0 -> 1 
         *      2. �� 2 �αȽ�: {24, 57, 69, 13, 80}  �±�Ƚ�: 1 -> 2  ����λ�öԻ�
         *      3. �� 3 �αȽ�: {24, 57, 13, 69, 80}  �±�Ƚ�: 2 -> 3  ����λ�öԻ�
         *  4. ����������
         *      ...
         *  5. ��(���鳤�� - 1)������
         *      ...
         *  6. �������
         */
        int[] arr = {24, 69, 80, 57, 13};
        int temp = 0;

        for(int num = 0; num < arr.length; num++) {
            for(int i = 0; i < (arr.length - 1 - num); i++) {
                int nextIndex = i + 1;
                if(arr[i] > arr[nextIndex]) {
                    temp = arr[nextIndex];
                    arr[nextIndex] = arr[i];
                    arr[i] = temp;
                }
            } 
        }      
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

	}
}