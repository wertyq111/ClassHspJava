/**
 * µÝ¹é
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class RecursionDetail
{
	public static void main(String[] args)
	{
        Test t = new Test();
        t.test(4);
        System.out.println("------½×³Ë------");
        /**
         * 1. n = 4; 6 * 4
         * 2. n = 3; 2 * 3
         * 3, n = 2; 1 * 2
         * 4, n = 1; 1
         * return 24;
         */
        int factorial = t.factorial(4);
        System.out.println(factorial);
    }
}

class Test
{
    public void test(int n)
    {
        if (n > 2) {
            test(n - 1);
        }
        System.out.println("n = " + n);
    }

    public int factorial(int n)
    {
        if(n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}