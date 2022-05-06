/**
 * ��ҵ
 * ��������Ϊ�������ݸ�����
 * ��ĿҪ��
 * (1)����һ��Circle�࣬����һ��double�͵�radius���Դ���Բ�İ뾶��һfindArea()��������Բ�������
 * (2)����һ����PassObject,�����ж���һ������printAreas),�÷����Ķ������£�
 * public void printAreas(Circle c,int times) //����ǩ��
 * (3)��printAreas�����д�ӡ���1��times֮���ÿ�������뾶ֵ���Լ���Ӧ�������
 * ���磬timesΪ5��������뾶1,2,3,4,5���Լ���Ӧ��Բ�����
 * (4)��main�����е���printAreas()������������Ϻ������ǰ�뾶ֵ��
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework13
{
	public static void main(String[] args)
	{
        PassObject p = new PassObject();
        Circle circle = new Circle();
        p.printAreas(circle, 5);
	}
}

class Circle
{
    double radius;
    double pai = Math.PI;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(){}

    public void circumference()
    {
        System.out.println("Բ�ܳ�Ϊ: " + (2 * pai * radius));
    }

    public void circleArea()
    {
        System.out.println("Բ���Ϊ: " + (pai * radius * radius));
    }

    public double findArea()
    {
        return pai * radius * radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}

class PassObject
{
    public void printAreas(Circle c, int times)
    {
        System.out.println("Radius\tArea");
        for(int i = 1; i <= times; i++) {
            double radius = (double)i;
            c.setRadius(i);
            System.out.println(radius + "\t" + c.findArea());
        }
    }
}