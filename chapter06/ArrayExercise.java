/**
 * 数组练习
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class ArrayExercise
{
	public static void main(String[] args)
	{
		/**
		 * 创建一个char类型的26个元素的数组, 分别放置 A-Z
		 * 使用for循环访问所有元素并打印出来
		 * 提示: char类型数据运算 'A'+1 -> 'B'
		 * 
		 */
		char columns[] = new char[26];
		for(int i = 0; i < columns.length; i++) {
			columns[i] = (char)('A' + i); //'A' + i 是int类型,需要强制转换
		}

		for(int j = 0; j < columns.length; j++) {
			System.out.print(columns[j] + "\t");
		}
		System.out.println("-----------------------------------------------");


		/**
		 * 请求出一个数组int[]的最大值{4,-1,9,10,23},并得到对应的下标
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

		System.out.println("数组最大值为: " + maxNum + ".对应下标是:" + maxIndex);


		System.out.println("-----------------------------------------------");

		/**
		 * 请求出一个数组的和和平均值
		 * 有 6 只鸡 (hens)
		 * 分别有 1 , 3, 5, 7.5, 8, 50 斤重
		 * 
		 */
		double hens[] = {1, 3, 5, 7.5, 8, 50};
		double hensSum = 0;
		double hensAvg = 0;
		for(int i = 0; i < hens.length; i++) {
			hensSum += hens[i];
		}

		System.out.println("数组和为: " + hensSum);
		System.out.println("数组平均值为: " + (hensSum / hens.length));

		/**
		 * 数组拷贝
		 * 将 int[] arr1 = {10, 20, 30}; 拷贝到 arr2 空间里
		 * 要求数据空间独立
		 */
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[arr1.length];

		//遍历arr1 将值拷贝到arr2 中
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.println("========arr1元素=========");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println("\n========arr2元素=========");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println("");

		/**
		 * 数组翻转
		 * 
		 */
		int[] arr = {11, 22, 33, 44, 55, 66};

		for(int i = 0, j = (arr.length - 1); i < arr.length / 2; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.println("------arr元素------");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}