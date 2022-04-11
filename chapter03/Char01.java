public class Char01 
{
	public static void main(String[] args) {
		char a = 'a';
		char b = '\t';
		char c = '周';
		char d = 50; //字符类型可以直接存放数字.char的本质是一个整数,在输出时时unicode码对应的字符
		int d2 = a; //ASCII值对应的unicode编号97

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d); //&#50;对应的ASCII值
		System.out.println(d2); //a对应的unicode值

		//char类型是可以运算的
		System.out.println(a + 5); //结果: 97 + 5 = 102
	}
}