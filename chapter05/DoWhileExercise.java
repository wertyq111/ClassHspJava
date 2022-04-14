/**
 * do..while循环练习
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class DoWhileExercise
{
	public static void main(String[] args)
	{
		/**
		 * 打印1-100
		 * 
		 */
		int i = 1;
		do{
			System.out.println(i);
			i++;
		}while(i <= 100);

		/**
		 * 计算1-100的和
		 * 
		 */
		i = 1;
		int sum = 0;
		do{
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println("1-100总和为: " + sum);

		/**
		 * 统计1-200之间能被5整除但不能被3整除的个数
		 * 
		 */
		i = 1;
		int count = 0;
		do{
			if(i % 5 == 0 && i % 3 != 0) {
				count++;
			}
			i++;
		}while(i <= 200);
		System.out.println("1-200之间能被5整除但不能被3整除的数一共有 " + count + " 个");

		/**
		 * 如果李三不还钱,则老韩将一直使出五连鞭直到李三说还钱为止
		 * 
		 * 思路:
		 * 	1. 化繁为简
		 * 		1. 不停的问还钱吗?
		 * 		2. 使用 char answer 接收, 定义一个Scanner对象
		 * 		3. 在do..while 的while 判断如果是 y 就不在循环
		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("老韩问: 还钱吗? y/n");
		char answer = myScanner.next().charAt(0);
		if(answer == 'y') {
			System.out.println("李三回答还钱, 老韩拿了钱走了");
		} else {
			do{
				if(answer == 'n') {
					System.out.println("李三回答不还钱,老韩使出了五连鞭");
				} else {
					System.out.println("李三不知道回答了什么,老韩使出了五连鞭");
				}
			    System.out.println("老韩问: 还钱吗? y/n");
				answer = myScanner.next().charAt(0);
			}while(answer != 'y');

			System.out.println("李三回答还钱, 老韩拿了钱走了");
		}
	}
}