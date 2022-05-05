/**
 * 作业
 * 在测试方法中，调用method方法，代码如下，编译正确，
 * 试写出method方法的定义形式，
 * 调用语句为：System.out.printIn(method(method(10.0,20.0),100));
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework11
{
	public static void main(String[] args)
	{
        Test t = new Test();
        t.print();
	}


}

class Test
{
    public void print()
    {
        System.out.println(method(method(10.0,20.0),100));
    }

    public double method(double a, double b)
    {
        return a + b;
    }
}
