/**
 * ��ҵ
 * ��̴���һ��Cale�����࣬
 * �����ж���2��������ʾ������������
 * �����ĸ�����ʵ����͡���ˡ��̣�Ҫ�����Ϊ0�Ļ���Ҫ��ʾ����������������
 * �ֱ����
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
        System.out.println("������Ϊ: " + (a + b));
    }

    public void sub()
    {
        System.out.println("������Ϊ: " + (a - b));
    }

    public void mul()
    {
        System.out.println("������Ϊ: " + (a * b));
    }

    public void div()
    {
        if(b == 0) {
            System.out.println("���г���,�ڶ�����������Ϊ0");
        } else {
            double c = (double)a / (double)b;
            System.out.println("������Ϊ: " + c);
        }
    }
}