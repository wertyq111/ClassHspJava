public class FloatDetail 
{
	public static void main(String[] args) {
		//Java�ĸ����ͳ���(����ֵ)Ĭ��Ϊ double ��, ���� float �ͳ������� 'f' �� 'F'
		double a = 1.1;
		float b = 1f;
		double c = .1;
		//ʮ������ʽ. ��:1.11, 1.12f, .12
		//��ѧ��������ʽ. ��: 1.11e2[1.11*10^2] 1.11E-2[1.11/10^2]

		System.out.println(a); // 1.1
		System.out.println(b); // 1.0
		System.out.println(c); // 0.1

		//����������: 2.7 �� 8.1 / 3��ȷ�ȽϷ���
		double num1 = 2.7;
		double num2 = 8.1 / 3;


        //��������ֵ�ľ���ֵ��ĳ�����ȷ�Χ�ڵ��ж�
		if(Math.abs(num1 - num2) < 0.00001) {
			System.out.println("���");
		} else {
			System.out.println("�����");
		}
	}
}