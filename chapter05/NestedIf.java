/**
 * 嵌套分支
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class NestedIf
{
	public static void main(String[] args)
	{
		/**
		 * 案例:
		 * 	参加歌手比赛,如果初赛成绩大于8.0进入决赛,否则淘汰.并且根据性别提示进入男子组或女子组.
		 * 	输入成绩和性别,判断和输出信息
		 * 	提示:
		 * 		double score;char gender
		 * 		接收字符: char gender = Scanner.next().charAt(0);
		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入成绩");
		double score = myScanner.nextDouble();

		if (score > 8.0) {
			System.out.println("请输入性别");
		    char gender = myScanner.next().charAt(0);
			if (gender == '男') {
				System.out.println("恭喜你进入歌唱比赛男子组决赛!");
			} else if (gender == '女') {
				System.out.println("恭喜你进入歌唱比赛女子组决赛!");
			} else {
				System.out.println("你好!观众!");
			}
		} else {
			System.out.println("很遗憾,你的成绩没有进入决赛");
		}
	}
}