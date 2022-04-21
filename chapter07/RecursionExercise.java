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
		int fibonacci = tool.getSum(num);
		System.out.println("쳲�������: " + fibonacci);
	}
}

class Tools
{
	public int getSum(int n)
	{
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return getSum(n - 1) + getSum(n - 2);
		}
	}
}