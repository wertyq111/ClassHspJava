/**
 * 作业
 * 编写类Book,定义方法updatePrice,实现更改某本书的价格，
 * 具体：如果价格>150,则更改为150，如果价格>100，更改为100，否则不变
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework03
{
	public static void main(String[] args)
	{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入图书名");
        String book = myScanner.next();
        System.out.println("请输入图书价格");
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

        System.out.println("\"" + book + "\"价格为: " + price);
    }
}