/**
 * do..whileѭ����ϰ
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class DoWhileExercise
{
	public static void main(String[] args)
	{
		/**
		 * ��ӡ1-100
		 * 
		 */
		int i = 1;
		do{
			System.out.println(i);
			i++;
		}while(i <= 100);

		/**
		 * ����1-100�ĺ�
		 * 
		 */
		i = 1;
		int sum = 0;
		do{
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println("1-100�ܺ�Ϊ: " + sum);

		/**
		 * ͳ��1-200֮���ܱ�5���������ܱ�3�����ĸ���
		 * 
		 */
		i = 1;
		int count = 0;
		do{
			if(i % 5 == 0 && i % 3 != 0) {
				count++;
			}
			i++;
		}while(i <= 200);
		System.out.println("1-200֮���ܱ�5���������ܱ�3��������һ���� " + count + " ��");

		/**
		 * �����������Ǯ,���Ϻ���һֱʹ��������ֱ������˵��ǮΪֹ
		 * 
		 * ˼·:
		 * 	1. ����Ϊ��
		 * 		1. ��ͣ���ʻ�Ǯ��?
		 * 		2. ʹ�� char answer ����, ����һ��Scanner����
		 * 		3. ��do..while ��while �ж������ y �Ͳ���ѭ��
		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�Ϻ���: ��Ǯ��? y/n");
		char answer = myScanner.next().charAt(0);
		if(answer == 'y') {
			System.out.println("�����ش�Ǯ, �Ϻ�����Ǯ����");
		} else {
			do{
				if(answer == 'n') {
					System.out.println("�����ش𲻻�Ǯ,�Ϻ�ʹ����������");
				} else {
					System.out.println("������֪���ش���ʲô,�Ϻ�ʹ����������");
				}
			    System.out.println("�Ϻ���: ��Ǯ��? y/n");
				answer = myScanner.next().charAt(0);
			}while(answer != 'y');

			System.out.println("�����ش�Ǯ, �Ϻ�����Ǯ����");
		}
	}
}