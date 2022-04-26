/**
 * 可变参数
 * @author zhouxufeng
 * @version 1.0
 */
public class VarParameterDetail
{
	public static void main(String[] args)
	{
        ToolMethod method = new ToolMethod();
        System.out.println(method.sum(1, 2, 3, 4, 5));
	}
}

class ToolMethod
{
    //可以计算 2/3/4... 个数的和
    //解读
    //  1. int... 表示接受的是可变参数,类型是int，即可以接收多个int(0-多)
    //  2. 使用可变参数时， 可以当作数组来使用 即 nums 可以当作数组
    public int sum(int... nums)
    {
        int sumNum = 0;
        for(int i = 0; i < nums.length; i++) {
            sumNum += nums[i];
        }

        return sumNum;
    }
}