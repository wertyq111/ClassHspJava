/**
 * �߼����������ϰ
 * @author zhouxufeng
 * @version 1.0
 */
public class LogicOperatorExercise
{
	public static void main(String[] args)
	{
		//������
		int x = 5;
		int y = 5;

		if(x++ == 6 & ++y == 6) {
			x = 11;
		}

		System.out.println("x = " + x + ", y = " + y); // x = 6 , y = 6

		x = 5;
		y = 5;

		if(x++ == 6 && ++y == 6) {
			x = 11;
		}

		System.out.println("x = " + x + ", y = " + y); // x = 6, y = 5

		x = 5;
		y = 5;

		if(x++ == 5 | ++y == 5) {
			x = 11;
		}

		System.out.println("x = " + x + ", y = " + y); // x = 11, y = 6

		x = 5;
		y = 5;

		if(x++ == 5 || ++y == 5) {
			x = 11;
		}

		System.out.println("x = " + x + ", y = " + y);// x = 11, y = 5


		boolean a = true;
		boolean b = false;
		short c = 46;

		if((c++ == 46) && (b = true)) c++; //�������и���·, b = true �൱��b��ֵΪtrue,���� b == true,����ִ��c++;

		if((a = false) || (++c == 49)) c++; //a = false, �ж�����1���Ϊfalse, ����++c = 49Ϊtrue,����ִ��c++;

		System.out.println("c = " + c);//50
	}
}