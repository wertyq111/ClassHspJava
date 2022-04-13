/**
 * if快速入门
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class IfOperator
{
	public static void main(String[] args)
	{
        //编写一个程序,可以输入人的年龄,如果大于18岁输出"你的年龄大于18岁,要对自己的行为负责"
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你的年龄");

        int age = myScanner.nextInt();
        if(age > 18) {
            System.out.println("你的年龄大于18岁,要对自己的行为负责");
        } else {
            System.out.println("你还年轻");
        }
    }
}