/**
 * 练习:出票系统
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
import java.util.Calendar;
public class NestedIfExercise
{
	public static void main(String[] args)
	{
		/**
		 * 案例:出票系统
		 * 	根据淡旺季的月份和年龄打印票价
		 * 		旺季(4-10月):
		 * 			成人(18-60): 60
		 * 			儿童(<13): 0
		 * 			少年(13-17): 30
		 * 			老年(>60): 20
		 * 		淡季:
		 * 			成人: 40
		 * 			儿童: 0
		 * 			其他: 20
		 */

		//获取月份
		Calendar myCalendar = Calendar.getInstance();
		int currMonth = myCalendar.get(Calendar.MONTH) + 1; //初始月份是从0开始的,所以输出值比当前月份小1
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入购票人年龄");
		int age = myScanner.nextInt();
		float price = 0.0f;
		String monthText = "当前是";
		if (age < 13) {
			price = 0.0f;
		} else if (age >= 13 && age < 18) {
			if(currMonth >= 4 && currMonth <= 10) {
				price = 30.0f;
			} else {
				price = 20.0f;
			}
		} else if (age >= 18 && age <= 60) {
			if(currMonth >= 4 && currMonth <= 10) {
				price = 60.0f;
			} else {
				price = 40.0f;
			}
		} else if (age > 60) {
			price = 20.0f;
		}

		if(currMonth >= 4 && currMonth <= 10) {
			monthText += "旺季 ";
		} else {
			monthText += "淡季 ";
		}

		System.out.println(monthText + "请支付票价: " + price + "元");
	}
}