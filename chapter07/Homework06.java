/**
 * 作业
 * 编程创建一个Cale计算类，
 * 在其中定义2个变量表示两个操作数，
 * 定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）并创建两个对象，
 * 分别测试
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework06
{
	public static void main(String[] args)
	{
        Cale c1 = new Cale(15, 16);
        Cale c2 = new Cale(20, 3);
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();
        c2.add();
        c2.sub();
        c2.mul();
        c2.div();
	}
}

class Cale
{
    int a;
    int b;
    public Cale(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void add()
    {
        System.out.println("两数和为: " + (a + b));
    }

    public void sub()
    {
        System.out.println("两数差为: " + (a - b));
    }

    public void mul()
    {
        System.out.println("两数积为: " + (a * b));
    }

    public void div()
    {
        if(b == 0) {
            System.out.println("运行除法,第二个参数不能为0");
        } else {
            double c = (double)a / (double)b;
            System.out.println("两数商为: " + c);
        }
    }
}