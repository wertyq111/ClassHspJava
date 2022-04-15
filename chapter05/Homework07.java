/**
 * 课后作业
 *  输出小写的a-z以及大写的Z-A
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework07
{
	public static void main(String[] args)
	{
        /**
         * 分析
         *  A-Z对应的ASCII范围是: 65-90
         *  a-z对应的ASCII范围是: 97-122
         */

        //输出a-z
        for(int i = 97; i <= 122; i++) {
            char word1 = (char)i;
            System.out.print(word1 + " ");
        }

        System.out.println("");

        //输出Z-A
        for(int j = 90; j >= 65; j--) {
            char word2 = (char)j;
            System.out.print(word2 + " ");
        }
	}
}