/**
 * 作业
 * 给定一个Java程序的代码如下所示，则编译运行后，输出结果是()
 *  public class Test{
        int count = 9;
        public void count1() {
            count=10;
            System.out.println("count1=" + count);
        }

        public void count2() {
            System.out.println("count1=" + count++);
        }
        public static void main(String args[]) {
            new Test().count1();
            Test t1=new Test();
            t1.count2();
            t1.count2();
        }
    }
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework08
{
	public static void main(String[] args)
	{
        System.out.println("count1 = 10");
        System.out.println("count1 = 9");
        System.out.println("count1 = 10");
	}
}