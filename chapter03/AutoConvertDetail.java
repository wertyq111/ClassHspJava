/**
 * �Զ�ת������ϸ��
 * @author zhouxufeng
 * @version 1.0
 */
public class AutoConvertDetail
{
	public static void main(String[] args)
	{
		//�������͵����ݻ������
		//ϵͳ���Ƚ���������ת������������������ͣ�Ȼ���ٽ��м���
		int num = 10;
		//float num1 = num + 1.1; //����num + 1.1 => ���������double
		float num1 = num + 1.1f;

		//byte, short �� char ֮�䲻�ụ��ת��
		//���Ѿ��������� byte ʱ�� ���жϸ����Ƿ���byte��Χ�ڣ�����ǾͿ���
		byte b1 = 10; //-128 ~ 127֮��
		// int i = 1;
		// byte b2 = i; //int���ȸ���byte����
		// 
		
		// byte��char��short �������߿��Խ��м��㡣�ڼ���ʱ��ת����int����
		// boolean ���������͵��Զ�ת��
		boolean b = true;
		//int i = b;
	}
}