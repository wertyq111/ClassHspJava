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
		// for(int i = 0; i < queens.length; i++) {
		// 	int[] queen = new int[8];
		// 	queen[0] = i;
		// 	for(int j = 1; j < queens.length; j++) {
		// 		queen[j] = 0;
		// 	}
		// 	//queens[i] = tool.arrangement(queen)
		// }


		int[][] queens = new int[8][8];
		queens = tool.arrangement(queens, 7);

		System.out.println("===��������===");
		for(int i = 0; i < queens.length; i++) {
			for(int j = 0; j< queens[0].length; j++) {
				System.out.print(queens[i][j] + " ");
			}
			System.out.println("");
		}
	}
}

class QueenTool
{
	/**
	 * {0, 1, 2, 3, 4, 5, 6, 7}
	 * {0, 1, 3, 4, 5, 6, 7, 2}
	 * {0, 1, 4, 5, 6, 7, 2, 3}
	 * 
	 */
	public int[][] arrangement(int[][] queens, int x)
	{
		if(x == 7) {
			for(int i = (queens.length - 1); i >= 0; i--) {
				queens[i][x] = i;
			}
		} else if(x > 0 && x < 7) {
			for(int i = 1; i < queens.length - 1; i++) {
				if(x == 5) {
					System.out.println(queens[i][x + 1] - 1);
				}
				if(queens[i][x + 1] - 1 < 1) {
					queens[i][x] = 2;
				} else if((queens[i][x + 1] + 1) == queens.length) {
					queens[i][x] = queens.length - (queens[i][x + 1] + 1);
				} else {
					queens[i][x] = queens[i][x + 1] + 1;
				}
			}
		} else {
			return queens;
		}

		return arrangement(queens, x - 1);
	}
}