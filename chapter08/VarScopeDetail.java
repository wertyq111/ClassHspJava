/**
 * ������
 * @author zhouxufeng
 * @version 1.0
 */
public class VarScopeDetail
{
	public static void main(String[] args)
	{
        Person p = new Person();
        p.say();
    }
}

class Person
{
    //���Կ��Լ����η�
    public String name = "king";

    public void say()
    {
        //�ֲ��������ܼ����η�
        //String name = "jack";
        //���Ժ;ֲ�������������, ����ʱ��ѭ�ͽ�ԭ��
        System.out.println("say() = " + name);
    }
}