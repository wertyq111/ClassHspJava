/**
 * 课后作业
 *  求出1-1/2+1/3-1/4...1/100的和
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework08
{
	public static void main(String[] args)
	{
        /**
         * 分析
         *  1. 1/1 - 1/2 + 1/3 - 1/4 + 1/5...1/100的和
         *  2. 化繁为简
         *      1. 1 - 2 - 3 - 4 ... 100 
         *      2. 1 - 2 + 3 - 4 ... 100 //偶数的时候是减,奇数的时候是加
         *      3. 1/1 - 1/2 + 1/3 - 1/4 ... 1/100 //i作为分母, 分子都为1
         * 
         */
        double sum = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
        }

        System.out.println("答案为: " + sum);
	}
}