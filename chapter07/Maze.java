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
public class Maze
{
	public static void main(String[] args)
	{
		/**
		 * ˼·
		 * 	1. �����Թ�, �ö�λ�����ʾ int[][] map = new int[8][7];
		 * 	2. �ȹ涨 map �����Ԫ��ֵΪ: 0 ��ʾ������, 1 ��ʾ�ϰ���
		 * 	3. ����һ�к����һ��ȫ������Ϊ1
		 * 	4. ����һ�к����һ��ȫ������Ϊ1
		 * 	5. ����������Ŀ�����ϰ�������� 3,1 3,2
		 * 	6. ʹ�õݹ���ݵ�˼�������������Թ�
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

		//���������ϰ���
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;

		//��ʼ���Թ�
		Way path = new Way();
		path.findWay(map, 1, 1);


		System.out.println("�Թ���ͼ");
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
	//�Ϻ����
	//1��findWay��������ר�����ҳ��Թ���·��
	//2������ҵ����ͷ���true,���򷵻�false
	//3��map���Ƕ�ά���飬����ʾ�Թ�
	//4��i,j���������λ�ã���ʼ����λ��Ϊ(1,1)
	//5����Ϊ�����ǵݹ����·���������ȹ涨map����ĸ���ֵ�ĺ���
	//0��ʾ������1��ʾ�ϰ���2��ʾ������3��ʾ�߹��������߲�ͨ����·
	//6����map[6][5]=2��˵���ҵ�ͨ·���Ϳ��Խ���������ͼ����ҡ�
	//7��ȷ��������·������->��->��->��
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