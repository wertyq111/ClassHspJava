/**
 * 作业
 * 编写类A03,实现数组的复制功能copyArr,
 * 输入旧数组，返回一个新数组，元素和旧数组一样
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework04
{
	public static void main(String[] args)
	{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入数组长度");
        int len = myScanner.nextInt();
        int[] array = new int[len];
        for(int i = 0; i < len; i++) {
            System.out.println("输入数组元素" + (i + 1));
            array[i] = myScanner.nextInt();
        }

        A03 a = new A03();
        a.copyArr(array);
	}
}

class A03
{
    public void copyArr(int[] array)
    {
        int[] newArr = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }

        System.out.println("输出新数组");
        for(int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}