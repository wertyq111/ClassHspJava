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
public class Maze
{
	public static void main(String[] args)
	{
		/**
		 * 思路
		 * 	1. 创建迷宫, 用二位数组表示 int[][] map = new int[8][7];
		 * 	2. 先规定 map 数组的元素值为: 0 表示可以走, 1 表示障碍物
		 * 	3. 将第一行和最后一行全部设置为1
		 * 	4. 将第一列和最后一列全部设置为1
		 * 	5. 单独设置题目中是障碍物的坐标 3,1 3,2
		 * 	6. 使用递归回溯的思想来解决老鼠出迷宫
		 * 	7. 
		 * 
		 */ 
		int[][] map = new int[8][7];

		for(int i = 0; i < map.length; i++) {
			map[i][0] = 1;
			map[i][map[0].length - 1] = 1;
		}

		for(int i = 1; i < map[0].length; i++) {
			map[0][i] = 1;
			map[map.length - 1][i] = 1;
		}

		//单独设置障碍物
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;

		//开始走迷宫
		Way path = new Way();
		path.findWay(map, 1, 1);


		System.out.println("迷宫地图");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
	}
}

class Way
{
	//老韩解读
	//1。findWay方法就是专内来找出迷宫的路径
	//2。如果找到，就返回true,否则返回false
	//3。map就是二维数组，即表示迷宫
	//4。i,j就是老鼠的位置，初始化的位置为(1,1)
	//5。因为我们是递归的找路，所以我先规定map数组的各个值的含义
	//0表示可以走1表示障碍物2表示可以走3表示走过，但是走不通是死路
	//6。当map[6][5]=2就说明找到通路，就可以结束，否则就继续找·
	//7先确定老鼠找路策略下->右->上->左
	public boolean findWay(int[][] map, int x, int y)
	{
		if(map[6][5] == 2) {
			return true;
		} else {
			if(map[x][y] == 0) {
				map[x][y] = 2;
				if(findWay(map, x + 1, y)) {
					return true;
				} else if(findWay(map, x, y + 1)) {
					return true;
				} else if(findWay(map, x - 1, y)) {
					return true;
				} else if(findWay(map, x, y - 1)) {
					return true;
				}  else {
					map[x][y] = 3;
					return false;
				}
			} else {
				return false;
			}
		}
	}
}