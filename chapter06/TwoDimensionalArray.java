/**
 * ��ά����
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class TwoDimensionalArray
{
	public static void main(String[] args)
	{
        /**
         * ���ö�ά�����������ͼ��
         *  0 0 0 0 0 0
         *  0 0 1 0 0 0
         *  0 2 0 3 0 0
         *  0 0 0 0 0 0
         */
        int[][] arr = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 2, 0, 3, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }


        /**
         * ��̬��������Ķ�ά����,�����
         *  1
         *  2 2
         *  3 3 3
         */
        System.out.println("======��̬����======");
        int[][] arr1;
        arr1 = new int[3][];//������ά����,����ֻȷ����һά����ĸ���.

        for(int i = 0; i < arr1.length; i++) {
            int len = i + 1;
            //��ÿ��һά���鿪�ռ� new
            //���û�п��ռ� new ,��ô arr[i]����null
            arr1[i] = new int[len]; 
            for(int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = len;
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }


        /**
         * int arr[][] = {{4, 6}, {1, 4, 5, 7}, {-2}};������ά����,���õ���
         */
        System.out.println("======��ά�������======");
        int arr2[][] = {{4, 6}, {1, 4, 5, 7}, {-2}};
        int sum = 0;

        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                sum += arr2[i][j];
            }
        }
        System.out.println("��ά�����Ϊ: " + sum);
	}
}