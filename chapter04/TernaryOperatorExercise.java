/**
 * ��Ԫ���������ϰ
 * @author zhouxufeng
 * @version 1.0
 */
public class TernaryOperatorExercise
{
	public static void main(String[] args)
	{
		//ʵ�������������ֵ
		int a = 2;
		int b = 3;
		int c = a > b ? (int)2.6 : (int)4.78;

		int x = a > b ? a : b;
		int y = x > c ? x : c;


		System.out.println("������Ϊ" + y);
	}
}