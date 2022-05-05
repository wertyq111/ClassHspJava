/**
 * 作业
 * 编写类A02,定义方法find,实现查找某字符串数组中的元素查找，并返回索引，
 * 如果找不到，返回-1
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class Homework02
{
	public static void main(String[] args)
	{
        A02 a = new A02();
        Scanner myScanner = new Scanner(System.in);

        String[] array = {"李雷", "韩梅梅", "张三", "李四", "贾斯汀", "鲍勃"};
        System.out.println("请输入需要查找的姓名");
        String name = myScanner.next();
        System.out.println("索引是: " + a.find(array, name));
	}
}

class A02
{
    public int find(String[] array, String name)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].equals(name)) {
                return i;
            }
        }

        return -1;
    }
}