/**
 * 多重循环练习
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class MoultiplyForExercise
{
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);

		/**
		 * 统计3个班成绩情况, 每个班有5名同学, 
		 * 问题:
		 * 	1. 各个班的平均分
		 * 	2. 所有班级的平均分
		 *  3. 及格人数
		 * [学生成绩从键盘输入]
		 * 
		 */
		// int classNum = 3;
		// int studentNum = 5;
		// double classSum = 0.0;
		// int passNum = 0;
		// double passScore = 60.0;
		// int i = 1;
		// double currentScore = 0.0;


		// while(i <= classNum) {
		// 	double currClassSum = 0.0;
		// 	for (int j = 1; j <= studentNum; j++) {
		// 		System.out.println("请输入" + i + "班" + "中同学" + j + "的成绩");
		// 		currentScore = myScanner.nextDouble();
		// 		currClassSum += currentScore;
		// 		//累积及格人数
		// 		if(currentScore >= passScore) {
		// 			passNum++;
		// 		}
		// 	}
		// 	//将当前班级的总分累积到所有班级的总分
		// 	classSum += currClassSum;
		// 	System.out.println(i + "班的平均分是: " + (double)(currClassSum / studentNum));
		// 	i++;
		// }
		// System.out.println("所有班的平均分是: " + (double)(classSum / (studentNum * classNum)));
		// System.out.println("所有班及格人数: " + passNum);


		/**
		 * 打印出九九乘法表
		 * 1 x 1 = 1
		 * 1 x 2 = 2	2 x 2 = 4
		 * 1 x 3 = 3    2 x 3 = 6     3 x 3 = 9
		 * 1 x 4 = 4    2 x 4 = 8     3 x 4 = 12    4 x 4 = 16
		 * 1 x 5 = 5    2 x 5 = 10    3 x 5 = 15    4 x 5 = 20    5 x 5 = 25
		 * 1 x 6 = 6    2 x 6 = 12    3 x 6 = 18    4 x 6 = 24    5 x 6 = 30   6 x 6 = 36
		 * 1 x 7 = 7    2 x 7 = 14    3 x 7 = 21    4 x 7 = 28    5 x 7 = 35   6 x 7 = 42    7 x 7 = 49
		 * 1 x 8 = 9    2 x 8 = 16    3 x 8 = 24    4 x 8 = 32    5 x 8 = 40   6 x 8 = 48    7 x 8 = 56    8 x 8 = 64
		 * 1 x 9 = 9    2 x 9 = 18    3 x 9 = 27    4 x 9 = 36    5 x 9 = 45   6 x 9 = 54    7 x 9 = 63    8 x 9 = 72    9 x 9 = 81
		 */
		// System.out.println("九九乘法表");
		// int end = 9;
		// while(i < end) {
		// 	for(int j = 1;j <= i; j++) {
		// 		System.out.print(j + " x " + i + " = " + (i * j) + "\t");
		// 	}
		// 	System.out.println("");
		// 	i++;
		// }
		// for(int i = 1;i < end;i++) {
		// 	for(int j = 1;j <= i; j++) {
		// 		System.out.print(j + " x " + i + " = " + (i * j) + "\t");
		// 	}
		// 	System.out.println("");
		// }

		/**
		 * 打印空心金字塔
		 *    *   
		 *   * *   
		 *  *   *
		 * *******
		 * 
		 * 思路分析
		 * 	1. 化繁为简
		 * 		1. 先打印一个矩形
		 * 			*******
		 * 			*******
		 * 			*******
		 * 			*******
		 * 		2. 打印半个金字塔
		 * 			*
		 * 			**
		 * 			***
		 * 			****
		 * 			*****
		 * 		3. 打印整个金字塔
		 * 			   *       //第 1 层 有 1 个*  2 * 1 - 1  前面空格数 4 (总层数 - 当前层数)
		 * 			  ***      //第 2 层 有 3 个*  2 * 2 - 1  前面空格数 3
		 * 			 *****     //第 3 层 有 5 个*  2 * 3 - 1  前面空格数 2
		 * 			*******    //第 4 层 有 7 个*  2 * 4 - 1  前面空格数 1
		 * 		   *********   //第 5 层 有 9 个*  2 * 5 - 1  前面空格数 0
		 * 		4. 打印空心金字塔
		 * 			   *       //第 1 层 有 1 个*  2 * 1 - 1  前面空格数 4 (总层数 - 当前层数) 
		 * 			  * *      //第 2 层 有 3 个*  2 * 2 - 1  前面空格数 3  中间空 1 个(星星数显示在 1, 3 位置)
		 * 			 *   *     //第 3 层 有 5 个*  2 * 3 - 1  前面空格数 2  中间空 3 个(星星数显示在 1, 5 位置)
		 * 			*     *    //第 4 层 有 7 个*  2 * 4 - 1  前面空格数 1  中间空 5 个(星星数显示在 1, 7 位置)
		 * 		   *********   //第 5 层 有 9 个*  2 * 5 - 1  前面空格数 0 
		 */
		System.out.println("空心金字塔");
		int line = 15;
		// 先打印一个矩形
		// for(int i = 1;i <= line; i++) { //表示层数
		// 	System.out.println("*******");
		// }

		// 打印半个金字塔
		// for(int i = 1;i <= line; i++) { //表示层数
		// 	//控制每层打印的*个数
		// 	for (int j = 1;j <= i;j++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println("");
		// }

		// 打印空心金字塔
		for(int i = 1;i <= line; i++) { //表示层数
			//打印*前面的空格
			for(int k = 1; k <= line - i; k++) {
				System.out.print(" ");
			}
			//控制每层打印的*个数
			for (int j = 1;j <= (2 * i - 1);j++) {
				if(j == 1 || j == (2 * i - 1) || i == line) { //在第 1 位和最后 1 位打印 * ,其他位置打印空格.最后一层全部打印 * 
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		/**
		 * 打印空心菱形
		 *     *   
		 *    * *   
		 *   *   *
		 *  *     *
		 * *       *
		 *  *     *
		 *   *   *
		 *    * *
		 *     *
		 * 
		 * 思路分析
		 * 	1. 化繁为简
		 * 		1. 先打印一个矩形
		 * 			*********
		 * 			*********
		 * 			*********
		 * 			*********
		 * 			*********
		 * 			*********
		 * 			*********
		 * 			*********
		 * 			*********
		 * 		2. 打印半个菱形
		 * 			*
		 * 			**
		 * 			***
		 * 			****
		 * 			*****
		 * 			****
		 * 			***
		 * 			**
		 * 			*
		 * 		3. 打印整个菱形
		 * 			   *       //第 1 层 有 1 个*  2 * 1 - 1  前面空格数 4 (总层数 / 2 - 当前层数)
		 * 			  ***      //第 2 层 有 3 个*  2 * 2 - 1  前面空格数 3
		 * 			 *****     //第 3 层 有 5 个*  2 * 3 - 1  前面空格数 2
		 * 			*******    //第 4 层 有 7 个*  2 * 4 - 1  前面空格数 1
		 * 		   *********   //第 5 层 有 9 个*  2 * 5 - 1  前面空格数 0 
		 * 		    *******    //第 6 层 有 7 个*  2 * 4(10 - 6) - 1  前面空格数 1 (当前层数 - 总层数 / 2)
		 * 		     *****     //第 7 层 有 5 个*  2 * 3(10 - 7) - 1  前面空格数 2
		 * 		      ***      //第 8 层 有 3 个*  2 * 2(10 - 8) - 1  前面空格数 3
		 * 		       *       //第 9 层 有 1 个*  2 * 1(10 - 9) - 1  前面空格数 4
		 * 		4. 打印空心金字塔
		 * 			   *       //第 1 层 有 1 个*  2 * 1 - 1  前面空格数 4 星星数显示在 1 或最后 1 位置
		 * 			  * *      //第 2 层 有 3 个*  2 * 2 - 1  前面空格数 3 星星数显示在 1 或最后 1 位置
		 * 			 *   *     //第 3 层 有 5 个*  2 * 3 - 1  前面空格数 2 星星数显示在 1 或最后 1 位置
		 * 			*     *    //第 4 层 有 7 个*  2 * 4 - 1  前面空格数 1 星星数显示在 1 或最后 1 位置
		 * 		   *       *   //第 5 层 有 9 个*  2 * 5 - 1  前面空格数 0 星星数显示在 1 或最后 1 位置
		 * 		    *     *    //第 6 层 有 7 个*  2 * 4 - 1  前面空格数 1 星星数显示在 1 或最后 1 位置
		 * 		     *   *     //第 7 层 有 5 个*  2 * 3 - 1  前面空格数 2 星星数显示在 1 或最后 1 位置
		 * 		      * *      //第 8 层 有 3 个*  2 * 2 - 1  前面空格数 3 星星数显示在 1 或最后 1 位置
		 * 		       *       //第 9 层 有 1 个*  2 * 1 - 1  前面空格数 4 星星数显示在 1 或最后 1 位置
		 */

		System.out.println("空心菱形");
		int halfLine = 30;
		line = halfLine * 2 - 1;
		for(int i = 1;i <= line; i++) { //表示层数
			//打印*前面的空格
			if(i <= halfLine) {
				for(int k = 1; k <= halfLine - i; k++) {
					System.out.print(" ");
				}
			} else {
				for(int k = 1; k <= i - halfLine; k++) {
					System.out.print(" ");
				}
			}

			//控制每层打印的*个数
			int maxNum = 2 * i - 1;
			if(i > halfLine) {
				maxNum = 2 * (halfLine * 2 - i) - 1; 
			}
			for (int j = 1;j <= maxNum;j++) {
				if(j == 1 || j == maxNum) { //在第 1 位和最后 1 位打印 * ,其他位置打印空格
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}