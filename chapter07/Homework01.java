/**
 * ��ҵ
 * ��д��A01,���巽��max,ʵ����ĳ��double��������ֵ��������
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
			System.out.println("��������");
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