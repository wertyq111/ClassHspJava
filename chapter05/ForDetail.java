/**
 * forѭ��ϸ��
 * @author zhouxufeng
 * @version 1.0
 */
public class ForDetail
{
	public static void main(String[] args)
	{
		// int i = 1; //ѭ��������ʼ��
		// for( ; i <= 10; ) {
		// 	System.out.println("��ʾforѭ��" + i);
		// 	i++;
		// }

		//����
		// for(;;) { //��ʾһ������ѭ��,��ѭ��
		// 	System.out.println("ok");
		// }

		/**
		 * ����ѭ��
		 * ѭ����ʼ: 
		 * 	1. i = 0, j = 0.
		 * 	2. count = 3, i < 3, ѭ������Ϊtrue
		 * 	3. ִ��forѭ�������, ���i, j
		 * 	4. i++: i = 1, j += 2: j = 2
		 * 	5. �ٴ�ѭ�� i = 1, i < 3, ѭ������Ϊtrue
		 * 	6. ִ��forѭ�������, ���i, j
		 * 	7. i++: i = 2, j += 2: j = 4
		 * 	8. �ٴ�ѭ�� i = 2, i < 3, ѭ������Ϊtrue
		 * 	9. ִ��forѭ�������, ���i, j
		 * 	10.i++: i = 3, j += 2: j = 6
		 * 	11.�ٴ�ѭ�� i = 3, i < 3, ѭ������Ϊfalse
		 * 	12.����ѭ��
		 */
		int count = 3;
		for(int i = 0, j = 0; i < count; i++, j +=2) {
			System.out.println("i = " + i + ", j = " + j);
		}
	}
}