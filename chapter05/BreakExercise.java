/**
 * break������ϰ
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class BreakExercise
{
	public static void main(String[] args)
	{
        /**
         * 1-100���ڵ������,��� ���� ��һ�δ���20�ĵ�ǰ��. 
         * [for + break]
         * 
         */
        int sum = 0;
        int currNum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
            if(sum > 20) {
                currNum = i;
                break;
            }
        }
        System.out.println("��ͺ��һ�δ���20����Ϊ: " + currNum);



        /**
         * ʵ�ֵ�¼��֤, ��3�λ���, ����û���Ϊ"����", ����"666"��ʾ��¼�ɹ�
         * ������ʾ���м��λ���
         * ��ʹ��for + break���
         * 
         */
        System.out.println("��¼ģ����֤");
        Scanner myScanner = new Scanner(System.in);
        int loginErrorNum = 3;
        for(;;) {
            System.out.println("�������˺�:");
            String login = myScanner.next();
            System.out.println("����������:");
            String password = myScanner.next();
            //����˵��: �ַ��������ݱȽϷ��� equals
            //if(login.equals("����") && password.equals("666")) { //���� True
            if("����".equals(login) && "666".equals(password)) { //���� True,�Ƽ�ʹ��.��ֹ�����ָ��
                System.out.println("��¼�ɹ�!");
                break;
            } else {
                if(loginErrorNum == 1) {
                    System.out.println("�ﵽ��¼��������!");
                    break;
                } else {
                    loginErrorNum--;
                    System.out.println("ʣ��" + loginErrorNum + "�ε�¼����!");
                }
            }
        }

	}
}