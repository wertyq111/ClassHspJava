/**
 * ����
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class SeqSearch
{
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);

		/**
		 * ����1: ��һ������(��üӥ��, ��ëʨ��, ��������, ��������)
		 * ������Ϸ: �Ӽ�������������һ������,�ж��������Ƿ����������[˳�����]
		 * Ҫ��: ����ҵ��˾���ʾ�ҵ��������±�ֵ
		 * 
		 */
		String[] names = {"��üӥ��", "��ëʨ��", "��������", "��������"};
		boolean bingo = true;

		System.out.println("��¸�����");
		while(bingo) {
			String name = myScanner.next();

			for(int i = 0; i < names.length; i++) {
				if(names[i].equals(name)) {
					System.out.println("��ϲ��¶���! �±�ֵΪ:" + i);
					bingo = false;
					break;
				}
			}

			if(bingo == true) {
				System.out.println("���ź�û�в¶�,�����!");
			}
		}


		/**
		 * ����2: ���һ������������ж��ֲ���{1, 8, 10, 89, 1000, 1234}
		 * ����һ���������������Ƿ���ڴ�����������±�.���û�о���ʾ"û�������""
		 * 
		 */
	}
}