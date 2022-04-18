/**
 * 数组演示
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class ArrayDetail
{
	public static void main(String[] args)
	{
		//演示 
		//		数据类型  数据名[] = new 数据类型[大小]
		//		数据类型[]  数据名 = new 数据类型[大小]
		//	1. 创建数组
		//	2. 循环输入
		//		array.length 表示数组的大小/长度
		//	3. 循环输出

		//double scores[] = new double[5];
		double[] scores; //声明数组.这时 scores 是null
		scores = new double[5];

		Scanner myScanner = new Scanner(System.in);

		for(int i = 0; i < scores.length; i++) {
			System.out.println("输入班级里第" + (i + 1) + "个同学的成绩");
			double score = myScanner.nextDouble();
			scores[i] = score;
		}

		System.out.println("收录结束!开始确认学生成绩");
		for(int i = 0; i < scores.length; i++) {
			System.out.println("同学" + (i + 1) + "的成绩是:" + scores[i]);
		}
	}
}