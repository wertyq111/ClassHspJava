/**
 * ǿ��ת������ϸ��
 * @author zhouxufeng
 * @version 1.0
 */
public class ForceConvertDetail
{
	public static void main(String[] args)
	{
		//ǿת����ֻ�������Ĳ�������Ч��������ʹ��С�����������ȼ�
		//int x = (int)10*3.5+6*1.5;//�������double --> int
		int x = (int)(10*3.5+6*1.5);//(int)44.0 -> 44
		System.out.println(x);

		//char���Ϳ��Ա��� int ���͵ĳ��������ܱ��� int �ı���
		char c = 100;
		System.out.println(c);
		int i = 101;
		//c = i; //����
		c = (char)i;
		System.out.println(c);
	}
}