/**
 * 作业
 * 试写出以下代码的运行结果
class Demo 
{
    int i=100;
    public void m () 
    {
        int j=i++;
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
}

class Test 
{
    public static void main(String[] args)
    {
        Demo d1 = new Demo();
        Demo d2 = d1;
        d2.m();
        System.out.println(d1.i);
        System.out.println(d2.i);
    }
}
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework10
{
	public static void main(String[] args)
	{
        System.out.println("i = 101");
        System.out.println("j = 100");
        System.out.println("101");
        System.out.println("101");
	}
}