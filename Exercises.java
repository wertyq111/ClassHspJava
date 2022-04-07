/**
 * 课堂练习文件
 * 一个源文件中最多只有一个public类,其他类的个数不限,也可以将main方法写在非public类中,然后指定运行非public类,这样入口方法就是非public类的main方法
 * @author 周许峰
 * @version 1.0
 */
public class Exercises {
	public static void main(String[] args) {
		System.out.println("课堂练习");
	}
}

/**
 * 转义字符练习1
 * \t: 一个制表位,实现对齐的功能. 有点像tab
 * \n: 换行符
 * \\: 斜杠
 * \r: 一个回车,光标回到字符首位,后续字符会覆盖掉之前的字符,可以搭配\n换行符使用
 */
class ChangeCharExer01 {
		public static void main(String[] args) {
		System.out.println("书名\t作者\t价格\t销量\r\n三国\t罗贯中\t120\t1000");
	}
}