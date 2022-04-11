public class FloatDetail 
{
	public static void main(String[] args) {
		//Java的浮点型常量(具体值)默认为 double 型, 声明 float 型常量须后加 'f' 或 'F'
		double a = 1.1;
		float b = 1f;
		double c = .1;
		//十进制形式. 如:1.11, 1.12f, .12
		//科学计数法形式. 如: 1.11e2[1.11*10^2] 1.11E-2[1.11/10^2]

		System.out.println(a); // 1.1
		System.out.println(b); // 1.0
		System.out.println(c); // 0.1

		//浮点数陷阱: 2.7 和 8.1 / 3正确比较方法
		double num1 = 2.7;
		double num2 = 8.1 / 3;


        //两个数差值的绝对值在某个精度范围内的判断
		if(Math.abs(num1 - num2) < 0.00001) {
			System.out.println("相等");
		} else {
			System.out.println("不相等");
		}
	}
}