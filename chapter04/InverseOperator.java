/**
 * ȡ���������
 * @author zhouxufeng
 * @version 1.0
 */
public class InverseOperator
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 10;

		//! ȡ������ Ture -> False, False -> Ture
		System.out.println(a < b);
		System.out.println(!(a < b));

		//^ �߼����, �� a �� b ��ͬʱ, ����Ϊ true, ����Ϊfalse
		boolean c = (a < b) ^ (a > 0);

		System.out.println("c= " + c);
	}
}