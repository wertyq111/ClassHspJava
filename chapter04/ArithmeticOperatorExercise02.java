/**
 * 运算符操作练习2
 * @author zhouxufeng
 * @version 1.0
 */
public class ArithmeticOperatorExercise02
{
	public static void main(String[] args)
	{
		//假如还有59天放假,问:合XX个星期零几天;
		int holiday = 59;
		int week = 59 / 7;
		int days = 59 % 7;
		System.out.println("还有" + week + "周" + days + "天放假");

		//定义一个变量保存华氏温度,华氏温度转换摄氏温度的公式为:5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度.[234.5]
		float fahrenheit = 234.5f;
		float celsius = (float)(5) / 9 * (fahrenheit - 100); //注意int类型之间的运算

		System.out.println("当前温度为:" + celsius + "℃");
	}
}