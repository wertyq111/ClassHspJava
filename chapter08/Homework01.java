/**
 * 作业
 * 编写类A01,定义方法max,实现求某个double数组的最大值，并返回
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework01
{
	public static void main(String[] args)
	{
		A01 a = new A01();
		double[] doubles = {};
		Double max = a.max(doubles);
		if(max != null) {
			System.out.println(a.max(doubles));
		} else {
			System.out.println("输入有误");
		}
	}
}

class A01
{
	public Double max(double[] doubles)
	{
		if(doubles.length > 0) {
			double max = 0;
			for(int i = 0; i < doubles.length; i++)
			{
				if(max < doubles[i]) {
					max = doubles[i];
				}
			}

			return max;
		} else {
			return null;
		}
	}
}