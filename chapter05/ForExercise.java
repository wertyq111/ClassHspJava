/**
 * for循环练习
 * @author zhouxufeng
 * @version 1.0
 */
public class ForExercise
{
	public static void main(String[] args)
	{
		/**
		 * 打印1~100之间所有是9的倍数的整数,统计个数及总和
		 * 编程思想:
		 * 	1. 化繁为简: 将复杂的需求拆解成简单的需求,逐步完成
		 * 	2. 先死后活: 先考虑固定的值,然后转成可以灵活变化的值
		 * 
		 * 思路分析
		 * 	1. 化繁为简
		 * 		1. 完成 输出1~100的值
		 * 		2. 输出过程中进行过滤: 只输出9的倍数
		 * 		3. 统计个数: 定义一个变量 count ;当条件满足时 count++;
		 * 		4. 总和: 定义一个变量 sum ; 当条件满足时累积 sum += num;
		 * 	2. 先死后活
		 * 		1. 为了适应更好的需求,把范围的开始值和结束值做出变量
		 * 		2. 还可以更进一步 9 的倍数也做成一个变量 int t = 9
		 */
		int num = 1;
		int count = 0;
		int sum = 0;
		int end = 100;
		int t = 9;
		for( ; num <= end; ) {
			if(num % t == 0) {
				System.out.println(t + "的倍数为: " + num);
				count++;
				sum += num;
			}
			num++;
		}
		System.out.println(t + "的倍数共有" + count + "个");
		System.out.println(t + "的倍数整数和为: " + sum);


		/**
		 * 完成下面表达式的输出
		 * 0 + 5 = 5
		 * 1 + 4 = 5
		 * 2 + 3 = 5
		 * 3 + 2 = 5
		 * 4 + 1 = 5
		 * 5 + 0 = 5
		 */
		int finish = 5;
		for(int i = 0, j = finish; i <= finish; i++, j--) {
			System.out.println(i + " + " + j + " = " + (i + j));
		}
	}
}