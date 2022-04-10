/**
 * 自动转换类型细节
 * @author zhouxufeng
 * @version 1.0
 */
public class AutoConvertDetail
{
	public static void main(String[] args)
	{
		//多种类型的数据混合运算
		//系统首先将所有数据转换成容量大的数据类型，然后再进行计算
		int num = 10;
		//float num1 = num + 1.1; //错误，num + 1.1 => 结果类型是double
		float num1 = num + 1.1f;

		//byte, short 和 char 之间不会互相转换
		//当把具体数赋给 byte 时， 先判断该数是否在byte范围内，如果是就可以
		byte b1 = 10; //-128 ~ 127之间
		// int i = 1;
		// byte b2 = i; //int精度高于byte报错
		// 
		
		// byte，char，short 他们三者可以进行计算。在计算时先转换成int类型
		// boolean 不参与类型的自动转换
		boolean b = true;
		//int i = b;
	}
}