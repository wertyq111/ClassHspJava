/**
 * 查找
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
		 * 案例1: 有一个数列(白眉鹰王, 金毛狮王, 紫衫龙王, 青翼蝠王)
		 * 猜数游戏: 从键盘中任意输入一个名称,判断数列中是否包含此名称[顺序查找]
		 * 要求: 如果找到了就提示找到并给出下标值
		 * 
		 */
		String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
		boolean bingo = true;

		System.out.println("请猜个名字");
		while(bingo) {
			String name = myScanner.next();

			for(int i = 0; i < names.length; i++) {
				if(names[i].equals(name)) {
					System.out.println("恭喜你猜对了! 下标值为:" + i);
					bingo = false;
					break;
				}
			}

			if(bingo == true) {
				System.out.println("很遗憾没有猜对,请继续!");
			}
		}


		/**
		 * 案例2: 请对一个有序数组进行二分查找{1, 8, 10, 89, 1000, 1234}
		 * 输入一个数看看该数组是否存在此数并且求出下标.如果没有就提示"没有这个数""
		 * 
		 */
	}
}