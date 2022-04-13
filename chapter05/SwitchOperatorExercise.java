/**
 * Switch分支练习
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class SwitchOperatorExercise
{
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);

		/**
		 * 使用 switch 把小写类型的 char 转为大写(键盘输入). 只转换a, b, c, d e.
		 * 其他的输出other
		 */
		// System.out.println("请输入一个待转为大写的字符(a-e)");
		// char c = myScanner.next().charAt(0);
		char c = 'a';
		switch(c) {
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
				break;
			case 'e':
				System.out.println("E");
				break;
			default:
				System.out.println("ohter");
		}

		/**
		 * 对学生成绩大于60分的输出"合格", 低于60分的输出"不合格".
		 * (注: 输入的成绩不能大于100).
		 * 提示: 成绩 / 60
		 */
		System.out.println("请输入成绩");
		double score = myScanner.nextDouble();
		//int score = 0;
		if(score >= 0 && score <= 100) {
			switch((int)(score) / 60) {
				case 1:
					System.out.println("合格");
					break;
				case 0:
					System.out.println("不合格");

			}
		} else {
			System.out.println("成绩不能超过100或小于0");
		}


		/**
		 * 根据用于指定月份,打印该月份所属的季节.
		 * 3-5春季. 6-8夏季. 9-11秋季, 12-2冬季
		 * 提示: 使用穿透
		 */
		System.out.println("请输入月份");
		int month = myScanner.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
		}
	}
}