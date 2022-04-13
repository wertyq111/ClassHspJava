/**
 * Switch分支
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class SwitchOperator
{
	public static void main(String[] args)
	{
		/**
		 * 输入一个字符,比如: a,b,c,d,e,f,g
		 * a表示星期一,b表示星期二...
		 * 根据用户输入的字符显示响应的信息.
		 * 要求使用 switch 语句完成
		 */
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入一个字符(a-g)");

		char day = myScanner.next().charAt(0);

		//在java中只要有值返回就是一个表达式
		switch(day) {
			case 'a':
				System.out.println("今天是星期一,开始一周的上班");
				break;
			case 'b':
				System.out.println("今天是星期二,第二天还需要坚持");
				break;
			case 'c':
				System.out.println("今天星期三,已经过半了");
				break;
			case 'd':
				System.out.println("今天星期四,还有一天!");
				break;
			case 'e':
				System.out.println("今天星期五,晚上嗨翻天!");
				break;
			case 'f':
				System.out.println("今天星期六,心里一点也不慌");
				break;
			case 'g':
				System.out.println("今天星期天,完了,芭比Q了");
				break;
			default:
				System.out.println("您输入的字符不符合要求");
		}

		//switch(表达式)中表达式的返回值必须是:
		//byte, short, int, char,enum(枚举), String
		//double c = 1.1; //错误: 不兼容的类型: 从double转换到int可能会有损失switch(c) {
		int c = 1;
		switch(c) {
			//case 1.1: //错误: 不兼容的类型: 从double转换到int可能会有损失
			case 1:
				System.out.println("c = " + c);
				break;
		}

		//break 语句用来在执行完一个case分支后使程序跳出switch语句块,
		//如果没有写break 程序会顺序执行到switch结尾.除非遇到break
		//int d = 1;
		int d = 2;
		switch(d) {
			//case 1.1: //错误: 不兼容的类型: 从double转换到int可能会有损失
			case 1:
				System.out.println("这是1");
			case 2:
				System.out.println("这是2");
			case 3:
				System.out.println("这是3");
			default:
				System.out.println("这里什么都没有");
		}
	}
}