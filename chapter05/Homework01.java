/**
 * �κ���ҵ
 * ���ʵ�����¹���
 *  ĳ����100,000Ԫ, ÿ����һ��·��,��Ҫ����.��������:
 *      1. ���ֽ� > 50000 ʱ,ÿ�ν� 5%
 *      2. ���ֽ� <= 50000 ʱ, ÿ�ν� 1000
 *  ��̼�����˿��Ծ������ٴ�·��. 
 *  Ҫ��: ʹ�� while break ��ʽ���
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework01
{
	public static void main(String[] args)
	{
        // ʣ����
        double amount = 100000;
        // ·������
        int num = 0;
        // ��·�ѱ���
        double rato = 0.05;
        // ��·�ѽ��
        double passAmount = 1000;

        while(true) {
            if(amount > 50000.0) {
                amount -= amount * rato;
            } else if(amount <= 50000.0 && amount >= passAmount) {
                amount -= passAmount;
            } else { //�ֽ���� passAmount
                break;
            }
            num++;
        }

        System.out.println("ͨ��" + num + "��·��, ����ʣ��" + amount + "Ԫ,�Ѿ����ܾ���·����");

	}
}