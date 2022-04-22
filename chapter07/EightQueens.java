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
		int[][] queens = new int[8][8];
		for(int i = 0; i < queens.length; i++) {
			int[] queen = new int[8];
			queen[0] = i;
			for(int j = 1; j < queens.length; j++) {
				queen[j] = 0;
			}
			queens[i][j] = tool.arrangement()
		}

		queens.arrangement(queen, 0);
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
	public int[] arrangement(int[] queen)
	{
		boolean isQueen = false;
		for(int i = 0; i < queens.length; i++) {
			for(int j = 0; j < queens.length; j++) {
				if(i != j && queen[j] == queen[i]) {
					queen[j]++;
					queen = arrangement(queen)
				}
			}
		}
	}
}