/**
 * �κ���ҵ
 *  ���Сд��a-z�Լ���д��Z-A
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework07
{
	public static void main(String[] args)
	{
        /**
         * ����
         *  A-Z��Ӧ��ASCII��Χ��: 65-90
         *  a-z��Ӧ��ASCII��Χ��: 97-122
         */

        //���a-z
        for(int i = 97; i <= 122; i++) {
            char word1 = (char)i;
            System.out.print(word1 + " ");
        }

        System.out.println("");

        //���Z-A
        for(int j = 90; j >= 65; j--) {
            char word2 = (char)j;
            System.out.print(word2 + " ");
        }
	}
}