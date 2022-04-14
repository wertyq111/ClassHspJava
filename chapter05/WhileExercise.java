/**
 * while循环练习
 * @author zhouxufeng
 * @version 1.0
 */
public class WhileExercise
{
	public static void main(String[] args)
	{
		/**
		 * 打印1-100之间所有能被3整除的数
		 *
		 */
		int start = 1;
		int end = 100;
		int t = 3;
		while(start <= end) {
			if(start % t == 0) {
				System.out.println(start + "能被3整除");
			}
			start++;
		}

		/**
		 * 打印40-200之间所有的偶数
		 * 
		 */
		int start2 = 40;
		int end2 = 200;
		int t2 = 2;
		while(start2 <= end2) {
			if(start2 % t2 == 0) {
				System.out.println(start2 + "是偶数");
			}
			start2++;
		}
	}
}