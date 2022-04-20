/**
 * 方法详情
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class MethodDetail
{
	public static void main(String[] args)
	{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入一个大于1的整数");
        int num = myScanner.nextInt();
        Person p = new Person();
        p.speak();
        p.cal01();
        p.cal02(num);

        System.out.println("输入两个大于1的整数");
        int num1 = myScanner.nextInt();
        int num2 = myScanner.nextInt();

        int sum = p.getSum(num1, num2);
        System.out.println("两个输入的数求和结果: " + sum);
	}
}

class Person 
{
    String name;
    int age;
    //添加 speak 成员方法, 输出"我是一个好人"
    //1. public 表示方法是公开的
    //2. void 表示方法没有返回值
    //3. speak() 表示方法名(形参列表)
    //4. {} 方法体: 可以写相关的功能
    public void speak()
    {
        System.out.println("我是一个好人");
    }

    //添加 cal01 成员方法, 可以计算从 1+..+1000 的结果
    public void cal01()
    {
        int sum = 0;
        for(int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("cal01 计算结果 = " + sum);
    }

    //添加 cal02 成员方法, 该方法可以接收一个数n, 计算从 1+..+n 的结果
    public void cal02(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("cal02 计算结果 = " + sum);
    }

    //添加 getSum 成员方法, 可以计算两个数的和
    //老韩解读
    //  1. public 表示方法是公开的
    //  2. int  表示方法执行后,返回一个 int 值
    //  3. getSum 方法名
    //  4. (int num1, int num2) 形参列表, 2个形参, 可以接收用户传入2个数
    //  5. return num1 + num2 返回结果
    public int getSum(int num1, int num2)
    {
        return num1 + num2;
    }
}