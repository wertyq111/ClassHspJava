/**
 * �κ���ҵ
 *  �ж�һ�������Ƿ���ˮ�ɻ���.
 *  ˮ�ɻ���: ָһ��3λ��,�����λ�����������͵����䱾��.
 *  ����: 153 = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework04
{
	public static void main(String[] args)
	{
        /**
         * ������ȥ��ʽ
         * ��λ��: number / 100
         * ʮλ��: number % 100 / 10
         * ��λ��: number % 10
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������һ��3λ������");
        String number = myScanner.next();
        int sum = 0;

        //�ж������Ƿ�����λ����
        // number / 1000  > 0 ������λ��
        // number / 100 < 1 ������λ��
        while(true) {
            if(Integer.parseInt(number) / 1000 > 0 || Integer.parseInt(number) / 100 < 1) {
                System.out.println("������Ĳ���3λ����");
                number = myScanner.next();
            } else {
                break;
            }
        }

        for(int i = 0; i <= 2; i++) {
            //�����ַ�ת�����ÿ����
            int num = Integer.parseInt(number.charAt(i) + "");
            int numCubic = 1;
            for(int j = 1; j <= 3; j++) {
                numCubic *= num;
            }
            sum += numCubic;
        }

        if(Integer.parseInt(number) == sum) {
            System.out.println("����ˮ�ɻ���");
        } else {
            System.out.println("�ⲻ��ˮ�ɻ���");
        }
	}
}