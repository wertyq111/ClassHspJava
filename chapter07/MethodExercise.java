/**
 * 方法联系
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class MethodExercise
{
	public static void main(String[] args)
	{
        /**
         * 编写类AA新方法: 判断一个数是奇数(odd)还是偶数,返回boolean
         * 
         */
        // Scanner myScanner = new Scanner(System.in);
        // System.out.println("请输入一个整数");
        // int num = myScanner.nextInt();
        // AA tool = new AA();
        // boolean flag = tool.IsOdd(num);
        // if(flag == true) {
        //     System.out.println("这是一个偶数");
        // } else {
        //     System.out.println("这是一个奇数");
        // }

        /**
         * 根据行, 列, 字符打印 对应行数和列数的字符
         * 比如: 行: 4, 列: 4, 字符 #
         * 打印响应的效果
         * ####
         * ####
         * ####
         * ####
         * 
         */
        // System.out.println("请输入行数");
        // int row = myScanner.nextInt();
        // System.out.println("请输入列数");
        // int col = myScanner.nextInt();
        // System.out.println("请输入字符");
        // char field = myScanner.next().charAt(0);
        // tool.PrintGraphics(row, col, field);

        /**
         * 编写类MyTools类, 编写一个方法可以打印二维数组的数据
         * 
         */
        MyTools tools = new MyTools();
        int[][] map = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };
        tools.printArr(map);

        /**
         * 编写一个方法copyPerson.
         * 可以复制一个Person对象. 
         * 返回复制的对象. 
         * 克隆对象 
         * 注意要求得到新对象和原来对象是两个独立的对象
         * 只是他们的属性相同
         */
        Person p = new Person();
        p.name = "jack";
        p.age = 100;
        Person p2 = tools.copyPerson(p);
        System.out.println("姓名: " + p2.name + ", 年龄: " + p2.age);
	}
}

class AA
{
    public boolean IsOdd(int num)
    {
        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void ConvertAscii(int row, int col)
    {
        String[][] ascii = {
            {"NUT", "SOH", "STX", "ETX", "EOT", "ENQ"},
            {"VT", "FF", "CR", "SO", "SI"},
            {"NAK", "SYN", "TB", "CAN", "EM"},
            {"US", "(space)", "!", "\"", "#"},
            {"(", ")", "*", "+", ","}
        };

        System.out.println("根据行数和列数得到的字符: " + ascii[row][col]);
    }

    public void PrintGraphics(int row, int col, char field)
    {
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                System.out.print(field + " ");
            }
            System.out.println("");
        }
    }
}

class MyTools
{
    public void printArr(int[][] map)
    {
        System.out.println("------循环数组开始------");
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
        }
        System.out.println("\n------循环数组结束------");
    }

    public Person copyPerson(Person p)
    {
        Person p1 = new Person();
        p1.name = p.name;
        p1.age = p.age;

        return p1;
    }
}

class Person
{
    String name;
    int age;
}
