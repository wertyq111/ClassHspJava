/**
 * 作业
 * 有个人Tom设计他的成员变量.成员方法，可以电脑猜拳.
 * 电脑每次都会随机生成0,1,2
 * 0表示石头1表示剪刀2表示布并要可以显示Tom的输赢次数（清单）
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Random;
import java.util.Scanner;
public class Homework14
{
	public static void main(String[] args)
	{
        Scanner myScanner = new Scanner(System.in);
        Mora moraTool = new Mora();
        int winNum = 0;
        while(true) {
            System.out.println("输入剪刀,石头,布");
            String mora = myScanner.next();
            int moraNum = 0;
            switch(mora) {
                case "石头":
                    moraNum = 0;
                    break;
                case "剪刀":
                    moraNum = 1;
                    break;
                case "布":
                    moraNum = 2;
                    break;
                default:
                    System.out.println("输入错误");
            }

            if(moraNum >= 0 && moraNum <= 2) {
                winNum += moraTool.compare(moraNum);
                System.out.println("当前胜利次数: " + winNum);
            }

            if(mora.equals("不玩了")){
                break;
            }
        }
	}
}

class Mora
{
    public int compare(int moraNum)
    {
        String[] computerMoraNumArray = {"石头", "剪刀", "布"};
        Random random = new Random();
        int computerMoraNum = random.nextInt(3);
        System.out.println("电脑出" + computerMoraNumArray[computerMoraNum]);
        if((moraNum == 0 && computerMoraNum == 1) 
            || (moraNum == 1 && computerMoraNum == 2) 
            || (moraNum == 2 && computerMoraNum == 0) 
        ) {
            return 1;
        } else {
            return 0;
        }
    }
}