/**
 * �κ���ҵ
 *  ���1-1/2+1/3-1/4...1/100�ĺ�
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework08
{
	public static void main(String[] args)
	{
        /**
         * ����
         *  1. 1/1 - 1/2 + 1/3 - 1/4 + 1/5...1/100�ĺ�
         *  2. ����Ϊ��
         *      1. 1 - 2 - 3 - 4 ... 100 
         *      2. 1 - 2 + 3 - 4 ... 100 //ż����ʱ���Ǽ�,������ʱ���Ǽ�
         *      3. 1/1 - 1/2 + 1/3 - 1/4 ... 1/100 //i��Ϊ��ĸ, ���Ӷ�Ϊ1
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

        System.out.println("��Ϊ: " + sum);
	}
}