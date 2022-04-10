/**
 * 输出结果
 * @author zhouxufeng
 * @version 1.0
 */
public class HomeWork04
{
	public static void main(String[] args)
	{
		//要求：
		//使用变量将姓名，年龄，成绩，性别，爱好存储
		//使用+
		//添加适当的注释
		//添加转义字符，使用一条语句输出
		
		String name = "jack";
		int age = 22;
		double mark = 100.00;
		char gender = '男';
		String hobby = "写作业";

		System.out.println("姓名\t年龄\t成绩\t性别\t爱好\r\n" + 
			name + "\t" + age + "\t" + mark + "\t" + gender + "\t" + hobby);
	}
}