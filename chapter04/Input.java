/**
 * ��������. ����:���Դӿ���̨�����û���Ϣ[����,����,нˮ]
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner; //��ʾ��Java.until�µ�Scanner�ർ��
public class Input
{
	public static void main(String[] args)
	{
		//����
		//1. ����Scanner�����ڵİ�
		//2. ���� Scanner ����
		Scanner myScanner = new Scanner(System.in);
		//3. �����û�������,ʹ����صķ���
		System.out.println("����������");
		String name = myScanner.next(); //�����û�����
		System.out.println("����������");
		int age = myScanner.nextInt(); //�����û�����
		System.out.println("������нˮ");
		double salary = myScanner.nextDouble(); //�����û�����
		System.out.println("����\t����\tнˮ\n" + name + "\t" + age + "\t" + salary);
	}
}