/**
 * �����������ϰ2
 * @author zhouxufeng
 * @version 1.0
 */
public class ArithmeticOperatorExercise02
{
	public static void main(String[] args)
	{
		//���绹��59��ż�,��:��XX�������㼸��;
		int holiday = 59;
		int week = 59 / 7;
		int days = 59 % 7;
		System.out.println("����" + week + "��" + days + "��ż�");

		//����һ���������滪���¶�,�����¶�ת�������¶ȵĹ�ʽΪ:5/9*(�����¶�-100),����������¶ȶ�Ӧ�������¶�.[234.5]
		float fahrenheit = 234.5f;
		float celsius = (float)(5) / 9 * (fahrenheit - 100); //ע��int����֮�������

		System.out.println("��ǰ�¶�Ϊ:" + celsius + "��");
	}
}