/**
 * ���������
 * @author zhouxufeng
 * @version 1.0
 */
public class ArithmeticOperator
{
	public static void main(String[] args)
	{
		System.out.println(10 / 4);//��ѧ��2.5, java��2;
		System.out.println(10.0 / 4);//java��2.5;
		double num = 10 / 4;//java����������2,ת��double���ͺ�Ϊ2.0;
		System.out.println(num);


		//% ȡģ,ȡ��
		//java�� % �Ĺ�ʽΪ: a % b = a - a / b * b;
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); //1

		//++ ʹ��
		//++i �������ٸ�ֵ
		//i++ �ȸ�ֵ������
		int i = 8;
		int j = ++i; //�ȼ�: i = i + 1; j = i;
		System.out.println("i = " + i + "\nj = " + j + "\n"); // i = 9; j = 9;

		j = i++; //�ȼ�: j = i; i = i + 1;
		System.out.println("i = " + i + "\nj = " + j + "\n"); // i = 10; j = 9; 
	}
}