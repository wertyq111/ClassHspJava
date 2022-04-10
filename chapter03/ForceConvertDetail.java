/**
 * 强制转换类型细节
 * @author zhouxufeng
 * @version 1.0
 */
public class ForceConvertDetail
{
	public static void main(String[] args)
	{
		//强转符号只针对最近的操作数有效，往往会使用小括号提升优先级
		//int x = (int)10*3.5+6*1.5;//编译错误：double --> int
		int x = (int)(10*3.5+6*1.5);//(int)44.0 -> 44
		System.out.println(x);

		//char类型可以保存 int 类型的常量但不能保存 int 的变量
		char c = 100;
		System.out.println(c);
		int i = 101;
		//c = i; //错误；
		c = (char)i;
		System.out.println(c);
	}
}