/**
 * 递归方法 - 迷宫
 * 递归调用应用实例-迷宫问题
 * 1.小球得到的路径，和程序员设置的找路策略有关 即：找路的上下左右的顺序相关
 * 2.再得到小球路径时，可以先使用（下右上左），再改成（上右下左），看看路径是不是有变化
 * 3.测试回溯现象
 * 4.扩展思考：如何求出最短路径？
 * @author zhouxufeng
 * @version 1.0
 */
public class EightQueens
{
	public static void main(String[] args)
	{
		/**
		 * 规则
		 * 	1. 0 表示棋盘, 1 表示皇后
		 * 	2. 皇后相同行相同列不能有皇后
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

		System.out.println("===排列数组===");
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