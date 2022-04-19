/**
 * 冒泡排序
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class BubbleSorting
{
	public static void main(String[] args)
	{
        /**
         * 五个无序: 24, 69, 80, 57, 13
         * 使用冒泡排序法将其排成一个从小到大的有序数列
         * 
         * 思路分析
         *  1. 定义数组 {24, 69, 80, 57, 13}
         *  2. 第一轮排序
         *      1. 第 1 次比较: {24, 69, 80, 57, 13}  下标比较: 0 -> 1 
         *      2. 第 2 次比较: {24, 69, 80, 57, 13}  下标比较: 1 -> 2
         *      3. 第 3 次比较: {24, 69, 57, 80, 13}  下标比较: 2 -> 3  发生位置对换
         *      4. 第 4 次比较: {24, 69, 57, 13, 80}  下标比较: 3 -> 4  发生位置对换
         *  3. 第二轮排序
         *      1. 第 1 次比较: {24, 69, 57, 13, 80}  下标比较: 0 -> 1 
         *      2. 第 2 次比较: {24, 57, 69, 13, 80}  下标比较: 1 -> 2  发生位置对换
         *      3. 第 3 次比较: {24, 57, 13, 69, 80}  下标比较: 2 -> 3  发生位置对换
         *  4. 第三轮排序
         *      ...
         *  5. 第(数组长度 - 1)轮排序
         *      ...
         *  6. 排序结束
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