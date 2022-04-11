/**
 * ��Ԫ�������
 * @author zhouxufeng
 * @version 1.0
 */
public class TernaryOperator
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 5;

		/**
		 * ���
		 * 1. a > b Ϊ false
		 * 2. ���� b-- ,�ȸ�ֵ,�� b - 1
		 * 3. result = 5
		 */
		int result = a > b ? a++ : b--;

		System.out.println(result); // 5

		//���ʽ1�ͱ��ʽ2ҪΪ���Ը�ֵ�����ձ���������(������Զ�ת��)
		a = 2;
		b = 3;
		int c = a > b ? (int)2.6 : (int)3.78;
		double d = a > b ? a++ : b--; //���Ա���, ����int --> double

		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
	}
}