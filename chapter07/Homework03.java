/**
 * ��ҵ
 * ��д��Book,���巽��updatePrice,ʵ�ָ���ĳ����ļ۸�
 * ���壺����۸�>150,�����Ϊ150������۸�>100������Ϊ100�����򲻱�
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework03
{
	public static void main(String[] args)
	{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������ͼ����");
        String book = myScanner.next();
        System.out.println("������ͼ��۸�");
        double price = myScanner.nextDouble();

        Book bookTool = new Book();
        bookTool.updatePrice(book, price);
	}
}

class Book
{
    public void updatePrice(String book, double price)
    {
        if(price > 150) {
            price = 150;
        } else if(price > 100) {
            price = 100;
        }

        System.out.println("\"" + book + "\"�۸�Ϊ: " + price);
    }
}