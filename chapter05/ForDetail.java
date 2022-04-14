/**
 * for循环细节
 * @author zhouxufeng
 * @version 1.0
 */
public class ForDetail
{
	public static void main(String[] args)
	{
		// int i = 1; //循环变量初始化
		// for( ; i <= 10; ) {
		// 	System.out.println("演示for循环" + i);
		// 	i++;
		// }

		//补充
		// for(;;) { //表示一个无限循环,死循环
		// 	System.out.println("ok");
		// }

		/**
		 * 分析循环
		 * 循环开始: 
		 * 	1. i = 0, j = 0.
		 * 	2. count = 3, i < 3, 循环条件为true
		 * 	3. 执行for循环内语句, 输出i, j
		 * 	4. i++: i = 1, j += 2: j = 2
		 * 	5. 再次循环 i = 1, i < 3, 循环条件为true
		 * 	6. 执行for循环内语句, 输出i, j
		 * 	7. i++: i = 2, j += 2: j = 4
		 * 	8. 再次循环 i = 2, i < 3, 循环条件为true
		 * 	9. 执行for循环内语句, 输出i, j
		 * 	10.i++: i = 3, j += 2: j = 6
		 * 	11.再次循环 i = 3, i < 3, 循环条件为false
		 * 	12.结束循环
		 */
		int count = 3;
		for(int i = 0, j = 0; i < count; i++, j +=2) {
			System.out.println("i = " + i + ", j = " + j);
		}
	}
}