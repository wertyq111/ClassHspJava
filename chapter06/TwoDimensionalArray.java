/**
 * 二维数组
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class TwoDimensionalArray
{
	public static void main(String[] args)
	{
        /**
         * 请用二维数组输出如下图形
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
         * 动态创建下面的二维数组,并输出
         *  1
         *  2 2
         *  3 3 3
         */
        System.out.println("======动态创建======");
        int[][] arr1;
        arr1 = new int[3][];//创建二维数组,但是只确定了一维数组的个数.

        for(int i = 0; i < arr1.length; i++) {
            int len = i + 1;
            //给每个一维数组开空间 new
            //如果没有开空间 new ,那么 arr[i]就是null
            arr1[i] = new int[len]; 
            for(int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = len;
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }


        /**
         * int arr[][] = {{4, 6}, {1, 4, 5, 7}, {-2}};遍历二维数组,并得到和
         */
        System.out.println("======二维数组求和======");
        int arr2[][] = {{4, 6}, {1, 4, 5, 7}, {-2}};
        int sum = 0;

        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                sum += arr2[i][j];
            }
        }
        System.out.println("二维数组和为: " + sum);
	}
}