/**
 * ��ҵ
 * �ڲ��Է����У�����method�������������£�������ȷ��
 * ��д��method�����Ķ�����ʽ��
 * �������Ϊ��System.out.printIn(method(method(10.0,20.0),100));
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
