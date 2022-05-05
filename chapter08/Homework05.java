/**
 * 作业
 * 定义一个圆类Circle,
 * 定义属性：半径，提供显示圆周长功能的方法，
 * 提供显示圆面积的方法
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework05
{
	public static void main(String[] args)
	{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入半径");
        double radius = myScanner.nextDouble();
        Circle circleToole = new Circle(radius);
        circleToole.circumference();
        circleToole.circleArea();
	}
}

class Circle
{
    double radius;
    double pai = 3.1415926;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public void circumference()
    {
        System.out.println("圆周长为: " + (2 * pai * radius));
    }

    public void circleArea()
    {
        System.out.println("圆面积为: " + (pai * radius * radius));
    }
}