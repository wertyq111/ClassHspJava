/**
 * �����������
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class RecursionExercise
{
	public static void main(String[] args)
	{
		/**
		 * ��ʹ�õݹ�ķ�ʽ���쳲�������1,1,2,3,5,8,13.������һ������n
		 * �������ֵ�Ƕ���
		 * 
		 * ˼·����
		 * 	1. 쳲������� ���ʽ: F[n]=F[n-1]+F[n-2](n>=2,F[0]=0,F[1]=1)
		 * 	2. n = 1 -> 1
		 * 	3. n = 2 -> 0 + 1 = 1
		 * 	4. n = 3 -> 1 + 1 = 2
		 * 	5. n = 4 -> 2 + 1 = 3
		 * 	6. n = 5 -> 3 + 2 = 4
		 * 	7. n >= 3 ǰ������֮��
		 * 
		 */
		Tools tool = new Tools();
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����һ�����ڵ���0������");
		int num = myScanner.nextInt();
		int fibonacci = tool.getFibonacci(num);
		System.out.println("쳲�������: " + fibonacci);

		/**
		 * ���ӳ��������⣺��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ����
		 * ���ٳ�ʱ������û�ԣ�������ֻ��1�������ˡ�
		 * ���⣺��������ٸ����ӣ�
		 * 
		 * ˼·����
		 * 	1. ���� = n
		 * 	2. day 10 -> 1
		 * 	3. day 9  -> (1 + 1) * 2 = 4
		 * 	4. day 8  -> (4 + 1) * 2 = 10
		 * 	5. day 7  -> (10 + 1) * 2 = 22
		 * 	6. day 6  -> (22 + 1) * 2 = 46
		 * 	7. ����: n������� = ((n + 1)������ + 1) * 2
		 */
		int days = 10;
		int peach = tool.monkeyEat(days);
		System.out.println("�����ʼ��: " + peach + "����");
	}
}

class Tools
{
	/**
	 * 쳲�������
	 */
	public int getFibonacci(int n)
	{
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return getFibonacci(n - 1) + getFibonacci(n - 2);
		}
	}

	/**
	 * ���ӳ���
	 */
	public int monkeyEat(int day)
	{
		if(day == 1) {
			return 1;
		} else {
			return (monkeyEat(day - 1) + 1) * 2;
		}
	}
}