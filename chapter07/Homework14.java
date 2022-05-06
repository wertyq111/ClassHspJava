/**
 * ��ҵ
 * �и���Tom������ĳ�Ա����.��Ա���������Ե��Բ�ȭ.
 * ����ÿ�ζ����������0,1,2
 * 0��ʾʯͷ1��ʾ����2��ʾ����Ҫ������ʾTom����Ӯ�������嵥��
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
            System.out.println("�������,ʯͷ,��");
            String mora = myScanner.next();
            int moraNum = 0;
            switch(mora) {
                case "ʯͷ":
                    moraNum = 0;
                    break;
                case "����":
                    moraNum = 1;
                    break;
                case "��":
                    moraNum = 2;
                    break;
                default:
                    System.out.println("�������");
            }

            if(moraNum >= 0 && moraNum <= 2) {
                winNum += moraTool.compare(moraNum);
                System.out.println("��ǰʤ������: " + winNum);
            }

            if(mora.equals("������")){
                break;
            }
        }
	}
}

class Mora
{
    public int compare(int moraNum)
    {
        String[] computerMoraNumArray = {"ʯͷ", "����", "��"};
        Random random = new Random();
        int computerMoraNum = random.nextInt(3);
        System.out.println("���Գ�" + computerMoraNumArray[computerMoraNum]);
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