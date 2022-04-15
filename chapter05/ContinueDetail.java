/**
 * continue细节
 * @author zhouxufeng
 * @version 1.0
 */
public class ContinueDetail
{
	public static void main(String[] args)
	{
        label1:
        for(int i = 1;i < 5; i++) {
            label2:
            for(int j = 1; j < 5; j++) {
                if(j == 2) {
                    //continue; //等价于 continue label2
                    continue label1;
                }
                System.out.println("j = " + j);
            }
        }
	}
}