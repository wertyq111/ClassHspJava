/**
 * �κ���ҵ
 *  ���1-100֮�䲻�ܱ�5��������,ÿ5��һ��
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework06
{
	public static void main(String[] args)
	{
        int line = 0;
        for(int i = 1; i<=100; i++) {
            if(i % 5 != 0) {
                System.out.print(i + "\t");
                line++;
                if(line % 5 == 0) {
                    System.out.println("");
                }
            }
        }
	}
}