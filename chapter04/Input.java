/**
 * 键盘输入. 案例:可以从控制台接收用户信息[姓名,年龄,薪水]
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner; //表示把Java.until下的Scanner类导入
public class Input
{
	public static void main(String[] args)
	{
		//步骤
		//1. 引入Scanner类所在的包
		//2. 创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);
		//3. 接收用户的输入,使用相关的方法
		System.out.println("请输入姓名");
		String name = myScanner.next(); //接收用户输入
		System.out.println("请输入年龄");
		int age = myScanner.nextInt(); //接收用户输入
		System.out.println("请输入薪水");
		double salary = myScanner.nextDouble(); //接收用户输入
		System.out.println("姓名\t年龄\t薪水\n" + name + "\t" + age + "\t" + salary);
	}
}