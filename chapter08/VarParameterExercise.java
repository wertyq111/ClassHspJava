/**
 * 可变参数练习
 * @author zhouxufeng
 * @version 1.0
 */
public class VarParameterExercise
{
	public static void main(String[] args)
	{
		/**
		 * 课堂练习
			有三个方法，分别实现返回姓名和两门课成绩（总分），返回姓名和三门课成绩（总
			分)，返回姓名和五门课成绩（总分）。封装成一个可变参数的方法
		*/
		ZxfMethod method = new ZxfMethod();
		Student student1 = method.getScore("小明", 55, 57.6);
		Student student2 = method.getScore("小日", 75, 86.5, 32);
		Student student3 = method.getScore("小月", 66.6, 77, 80, 93.5, 100);
		System.out.println(student1.name + "两门课成绩总分: " + student1.sumScores);
		System.out.println(student2.name + "三门课成绩总分: " + student2.sumScores);
		System.out.println(student3.name + "五门课成绩总分: " + student3.sumScores);
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