/**
 * if��������
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class IfOperator
{
	public static void main(String[] args)
	{
        //��дһ������,���������˵�����,�������18�����"����������18��,Ҫ���Լ�����Ϊ����"
        Scanner myScanner = new Scanner(System.in);
        System.out.println("�������������");

        int age = myScanner.nextInt();
        if(age > 18) {
            System.out.println("����������18��,Ҫ���Լ�����Ϊ����");
        } else {
            System.out.println("�㻹����");
        }
    }
}