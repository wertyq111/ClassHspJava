/**
 * whileѭ����ϰ
 * @author zhouxufeng
 * @version 1.0
 */
public class WhileExercise
{
	public static void main(String[] args)
	{
		/**
		 * ��ӡ1-100֮�������ܱ�3��������
		 *
		 */
		int start = 1;
		int end = 100;
		int t = 3;
		while(start <= end) {
			if(start % t == 0) {
				System.out.println(start + "�ܱ�3����");
			}
			start++;
		}

		/**
		 * ��ӡ40-200֮�����е�ż��
		 * 
		 */
		int start2 = 40;
		int end2 = 200;
		int t2 = 2;
		while(start2 <= end2) {
			if(start2 % t2 == 0) {
				System.out.println(start2 + "��ż��");
			}
			start2++;
		}
	}
}