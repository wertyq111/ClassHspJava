/**
 * forѭ����ϰ
 * @author zhouxufeng
 * @version 1.0
 */
public class ForExercise
{
	public static void main(String[] args)
	{
		/**
		 * ��ӡ1~100֮��������9�ı���������,ͳ�Ƹ������ܺ�
		 * ���˼��:
		 * 	1. ����Ϊ��: �����ӵ�������ɼ򵥵�����,�����
		 * 	2. �������: �ȿ��ǹ̶���ֵ,Ȼ��ת�ɿ������仯��ֵ
		 * 
		 * ˼·����
		 * 	1. ����Ϊ��
		 * 		1. ��� ���1~100��ֵ
		 * 		2. ��������н��й���: ֻ���9�ı���
		 * 		3. ͳ�Ƹ���: ����һ������ count ;����������ʱ count++;
		 * 		4. �ܺ�: ����һ������ sum ; ����������ʱ�ۻ� sum += num;
		 * 	2. �������
		 * 		1. Ϊ����Ӧ���õ�����,�ѷ�Χ�Ŀ�ʼֵ�ͽ���ֵ��������
		 * 		2. �����Ը���һ�� 9 �ı���Ҳ����һ������ int t = 9
		 */
		int num = 1;
		int count = 0;
		int sum = 0;
		int end = 100;
		int t = 9;
		for( ; num <= end; ) {
			if(num % t == 0) {
				System.out.println(t + "�ı���Ϊ: " + num);
				count++;
				sum += num;
			}
			num++;
		}
		System.out.println(t + "�ı�������" + count + "��");
		System.out.println(t + "�ı���������Ϊ: " + sum);


		/**
		 * ���������ʽ�����
		 * 0 + 5 = 5
		 * 1 + 4 = 5
		 * 2 + 3 = 5
		 * 3 + 2 = 5
		 * 4 + 1 = 5
		 * 5 + 0 = 5
		 */
		int finish = 5;
		for(int i = 0, j = finish; i <= finish; i++, j--) {
			System.out.println(i + " + " + j + " = " + (i + j));
		}
	}
}