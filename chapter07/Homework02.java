/**
 * ��ҵ
 * ��д��A02,���巽��find,ʵ�ֲ���ĳ�ַ��������е�Ԫ�ز��ң�������������
 * ����Ҳ���������-1
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework02
{
	public static void main(String[] args)
	{
        A02 a = new A02();
        Scanner myScanner = new Scanner(System.in);

        String[] array = {"����", "��÷÷", "����", "����", "��˹͡", "����"};
        System.out.println("��������Ҫ���ҵ�����");
        String name = myScanner.next();
        System.out.println("������: " + a.find(array, name));
	}
}

class A02
{
    public int find(String[] array, String name)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].equals(name)) {
                return i;
            }
        }

        return -1;
    }
}