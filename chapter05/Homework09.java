/**
 * 课后作业
 *  求 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+100)的结果
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework09
{
	public static void main(String[] args)
	{
        /**
         * 分析
         *  化繁为简
         *      1. 1, 2, 3, ..., 100 //递增,循环100次
         *      2. 1, 1+2, 1+2+3, ..., 1+2+3+...+100 //循环内上一次循环的和
         *      3. 1 + (1+2) + ... + (1+2+3+4+...+100) //定义一个值累积
         * 
         * 
         */
        int sum = 0;
        int total = 0;
        for(int i = 1; i <= 100; i++) {
            /**
             * i = 1 -> sum = 1
             * i = 2 -> sum = 1 + 2 = 3
             * i = 3 -> sum = 1 + 2 + 3 = 6
             * ...
             * i = 100 -> sum = 1 + 2 + 3 + ... + 100 = 5050
             */
            sum +=i;
            total += sum;
        }
        System.out.println("答案为: " + total);
	}
}