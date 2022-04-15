/**
 * continue¡∑œ∞
 * @author zhouxufeng
 * @version 1.0
 */
public class ContinueExercise
{
	public static void main(String[] args)
	{
        label1:
        for(int i = 1;i < 10; i++) {
            label2:
            for(int j = 1; j < 5; j++) {
                if(j == 2) {
                    //break; //µ»º€”⁄ break label2
                    break label1;
                }
                System.out.println("j = " + j);
            }
        }
	}
}