/**
 * ��ҵ
 * ����һ��Բ��Circle,
 * �������ԣ��뾶���ṩ��ʾԲ�ܳ����ܵķ�����
 * �ṩ��ʾԲ����ķ���
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework05
{
	public static void main(String[] args)
	{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������뾶");
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
        System.out.println("Բ�ܳ�Ϊ: " + (2 * pai * radius));
    }

    public void circleArea()
    {
        System.out.println("Բ���Ϊ: " + (pai * radius * radius));
    }
}