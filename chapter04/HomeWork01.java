/**
 * 本章作业
 * @author zhouxufeng
 * @version 1.0
 */
public class HomeWork01
{
	public static void main(String[] args)
	{
        //试写出将String转换成double类型的语句以及将char类型转换成String语句
        String num = "18";
        double num1 = Double.parseDouble(num);
        System.out.println(num1);

        char gender = '男';
        String gender1 = gender + "";
        System.out.println(gender);
    }
}