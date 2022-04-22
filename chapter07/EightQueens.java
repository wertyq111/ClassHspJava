/**
 * �ݹ鷽�� - �Թ�
 * �ݹ����Ӧ��ʵ��-�Թ�����
 * 1.С��õ���·�����ͳ���Ա���õ���·�����й� ������·���������ҵ�˳�����
 * 2.�ٵõ�С��·��ʱ��������ʹ�ã��������󣩣��ٸĳɣ��������󣩣�����·���ǲ����б仯
 * 3.���Ի�������
 * 4.��չ˼�������������·����
 * @author zhouxufeng
 * @version 1.0
 */
public class EightQueens
{
	public static void main(String[] args)
	{
		/**
		 * ����
		 * 	1. 0 ��ʾ����, 1 ��ʾ�ʺ�
		 * 	2. �ʺ���ͬ����ͬ�в����лʺ�
		 * 
		 */
		QueenTool tool = new QueenTool();
		int[][] queens = new int[8][8];
		// for(int i = 0; i < queens.length; i++) {
		// 	int[] queen = new int[8];
		// 	queen[0] = i;
		// 	for(int j = 1; j < queens.length; j++) {
		// 		queen[j] = 0;
		// 	}
		// 	//queens[i] = tool.arrangement(queen)
		// }


		int[] queen = {0, 0, 0, 0, 0, 0, 0, 0};
		System.out.println("===��ʼ����===");
		for(int i = 0; i < queen.length; i++) {
			System.out.print(queen[i] + " ");
		}
		System.out.println("");

		queen = tool.arrangement(queen, 0);

		System.out.println("===��������===");
		for(int i = 0; i < queen.length; i++) {
			System.out.print(queen[i] + " ");
		}
		System.out.println("");
	}
}

class QueenTool
{
	/**
	 * {0, 1, 2, 3, 4, 5, 6, 7}
	 * {0, 2, 3, 1, 4, 5, 6, 7}
	 * {0, 3, 2, 1, 4, 5, 6, 7}
	 * 
	 */
	public int[] arrangement(int[] queen, int x)
	{
		if(queen.length - x > 1) {
			for(int i = x; i < queen.length - x; i++) {
				queen[x] = i;
				queen = arrangement(queen, x + 1);
			}
		}

		return queen;

	}
}