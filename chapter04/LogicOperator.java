/**
 * �߼��������
 * @author zhouxufeng
 * @version 1.0
 */
public class LogicOperator
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 10;

		if(a < 1 && ++b < 10) { // &&��·��,��һ������false��ִ�к����������ж�
			System.out.println("ok100");
		}
		System.out.println("a = " + a + ", b = " + b); // a = 5, b = 10

		if(a < 1 & ++b < 10) { // &�߼���,���۵�һ������Ϊtrue����false ����ִ�к����������ж�
			System.out.println("ok200");
		}
		System.out.println("a = " + a + ", b = " + b); // a = 5, b = 11

		b = 10;

		if(a < 10 & ++b > 10) { // &�߼���,���۵�һ������Ϊtrue����false ����ִ�к����������ж�
			System.out.println("ok300");
		}
		System.out.println("a = " + a + ", b = " + b); // a = 5, b = 11

		System.out.println("=========================");

		b = 10;

		if(a < 10 || ++b < 10) { // ||��·��,��һ������true��ִ�к����������ж�,Ч�ʸ�
			System.out.println("ok100");
		}
		System.out.println("a = " + a + ", b = " + b); // a = 5, b = 10

		if(a < 10 | ++b < 10) { // |�߼���,���۵�һ������Ϊtrue����false ����ִ�к����������ж�,Ч�ʵ�
			System.out.println("ok200");
		}
		System.out.println("a = " + a + ", b = " + b); // a = 5, b = 11


	}
}