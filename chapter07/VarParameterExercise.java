/**
 * �ɱ������ϰ
 * @author zhouxufeng
 * @version 1.0
 */
public class VarParameterExercise
{
	public static void main(String[] args)
	{
		/**
		 * ������ϰ
			�������������ֱ�ʵ�ַ������������ſγɼ����ܷ֣����������������ſγɼ�����
			��)���������������ſγɼ����ܷ֣�����װ��һ���ɱ�����ķ���
		*/
		ZxfMethod method = new ZxfMethod();
		Student student1 = method.getScore("С��", 55, 57.6);
		Student student2 = method.getScore("С��", 75, 86.5, 32);
		Student student3 = method.getScore("С��", 66.6, 77, 80, 93.5, 100);
		System.out.println(student1.name + "���ſγɼ��ܷ�: " + student1.sumScores);
		System.out.println(student2.name + "���ſγɼ��ܷ�: " + student2.sumScores);
		System.out.println(student3.name + "���ſγɼ��ܷ�: " + student3.sumScores);
	}
}

class ZxfMethod
{
	public Student getScore(String name, double... scores)
	{
		double sumScores = 0;
		for(int i = 0; i < scores.length; i++) {
			sumScores += scores[i];
		}

		Student student = new Student();
		student.name = name;
		student.sumScores = sumScores;

		return student;
	}
}

class Student
{
	String name;
	double sumScores;
}