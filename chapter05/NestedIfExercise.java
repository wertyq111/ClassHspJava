/**
 * ��ϰ:��Ʊϵͳ
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
import java.util.Calendar;
public class NestedIfExercise
{
	public static void main(String[] args)
	{
		/**
		 * ����:��Ʊϵͳ
		 * 	���ݵ��������·ݺ������ӡƱ��
		 * 		����(4-10��):
		 * 			����(18-60): 60
		 * 			��ͯ(<13): 0
		 * 			����(13-17): 30
		 * 			����(>60): 20
		 * 		����:
		 * 			����: 40
		 * 			��ͯ: 0
		 * 			����: 20
		 */

		//��ȡ�·�
		Calendar myCalendar = Calendar.getInstance();
		int currMonth = myCalendar.get(Calendar.MONTH) + 1; //��ʼ�·��Ǵ�0��ʼ��,�������ֵ�ȵ�ǰ�·�С1
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�����빺Ʊ������");
		int age = myScanner.nextInt();
		float price = 0.0f;
		String monthText = "��ǰ��";
		if (age < 13) {
			price = 0.0f;
		} else if (age >= 13 && age < 18) {
			if(currMonth >= 4 && currMonth <= 10) {
				price = 30.0f;
			} else {
				price = 20.0f;
			}
		} else if (age >= 18 && age <= 60) {
			if(currMonth >= 4 && currMonth <= 10) {
				price = 60.0f;
			} else {
				price = 40.0f;
			}
		} else if (age > 60) {
			price = 20.0f;
		}

		if(currMonth >= 4 && currMonth <= 10) {
			monthText += "���� ";
		} else {
			monthText += "���� ";
		}

		System.out.println(monthText + "��֧��Ʊ��: " + price + "Ԫ");
	}
}