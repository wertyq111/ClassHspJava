/**
 * ����������ϰ
 * @author zhouxufeng
 * @version 1.0
 */
public class OverloadExercise
{
	public static void main(String[] args)
	{
		/**
		 * 1.�ж��⣺
			��void show(inta,char b,double c)0�������ص��У�[b,c,d,e,g]
				a)void show(int x,char y,double z)(}
				b)int show(int a,double.c,char b){}
				c)void show(int a,double c,char b)}
				d)boolean show(int c,char b)(}
				e)void show(double c)}
				f)double show(int x,char y,double z)(}
				g)void shows(}
	    */


	    /**
	     * ��д������Methods�ж����������ط��������á�������Ϊm������������
			�����һ��int����������int������һ���ַ����������ֱ�ִ��ƽ�����㲢���
			�������˲�������������ַ�����Ϣ���������main(O�����зֱ��ò���
			�����������������
		*/
		Methods test = new Methods();
		test.m(2);
		test.m(3, 4);
		test.m("��������");


		/**
		 * ��Methods�࣬�����������ط���max(),��һ����������������intֵ�е���
			��ֵ���ڶ�����������������doubleֵ�е����ֵ����������������������
			doubleֵ�е����ֵ�����ֱ��������������
		*/
		System.out.println(test.max(2,3));
		System.out.println(test.max(3.2,3));
		System.out.println(test.max(21,7,5));
	}
}

class Methods
{
	public void m(int n){System.out.println(n * n);}
	public void m(int n1, int n2){System.out.println(n1 * n2);}
	public void m(String n){System.out.println(n);}

	public int max(int n1, int n2) { return n1 > n2 ? n1 : n2;}
	public double max(double n1, double n2) { return n1 > n2 ? n1 : n2;}

	public double max(double n1, double n2, double n3) { return  n1 > n2 ? n1 > n3 ? n1 : n2 > n3 ? n2 : n3 : n2 > n3 ? n2 : n3;}
}