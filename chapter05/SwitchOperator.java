/**
 * Switch��֧
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class SwitchOperator
{
	public static void main(String[] args)
	{
		/**
		 * ����һ���ַ�,����: a,b,c,d,e,f,g
		 * a��ʾ����һ,b��ʾ���ڶ�...
		 * �����û�������ַ���ʾ��Ӧ����Ϣ.
		 * Ҫ��ʹ�� switch ������
		 */
		Scanner myScanner = new Scanner(System.in);

		System.out.println("������һ���ַ�(a-g)");

		char day = myScanner.next().charAt(0);

		//��java��ֻҪ��ֵ���ؾ���һ�����ʽ
		switch(day) {
			case 'a':
				System.out.println("����������һ,��ʼһ�ܵ��ϰ�");
				break;
			case 'b':
				System.out.println("���������ڶ�,�ڶ��컹��Ҫ���");
				break;
			case 'c':
				System.out.println("����������,�Ѿ�������");
				break;
			case 'd':
				System.out.println("����������,����һ��!");
				break;
			case 'e':
				System.out.println("����������,�����˷���!");
				break;
			case 'f':
				System.out.println("����������,����һ��Ҳ����");
				break;
			case 'g':
				System.out.println("����������,����,�ű�Q��");
				break;
			default:
				System.out.println("��������ַ�������Ҫ��");
		}

		//switch(���ʽ)�б��ʽ�ķ���ֵ������:
		//byte, short, int, char,enum(ö��), String
		//double c = 1.1; //����: �����ݵ�����: ��doubleת����int���ܻ�����ʧswitch(c) {
		int c = 1;
		switch(c) {
			//case 1.1: //����: �����ݵ�����: ��doubleת����int���ܻ�����ʧ
			case 1:
				System.out.println("c = " + c);
				break;
		}

		//break ���������ִ����һ��case��֧��ʹ��������switch����,
		//���û��дbreak �����˳��ִ�е�switch��β.��������break
		//int d = 1;
		int d = 2;
		switch(d) {
			//case 1.1: //����: �����ݵ�����: ��doubleת����int���ܻ�����ʧ
			case 1:
				System.out.println("����1");
			case 2:
				System.out.println("����2");
			case 3:
				System.out.println("����3");
			default:
				System.out.println("����ʲô��û��");
		}
	}
}