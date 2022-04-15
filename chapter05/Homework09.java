/**
 * �κ���ҵ
 *  �� 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+100)�Ľ��
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework09
{
	public static void main(String[] args)
	{
        /**
         * ����
         *  ����Ϊ��
         *      1. 1, 2, 3, ..., 100 //����,ѭ��100��
         *      2. 1, 1+2, 1+2+3, ..., 1+2+3+...+100 //ѭ������һ��ѭ���ĺ�
         *      3. 1 + (1+2) + ... + (1+2+3+4+...+100) //����һ��ֵ�ۻ�
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
        System.out.println("��Ϊ: " + total);
	}
}