/**
 * break课堂练习
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class BreakExercise
{
	public static void main(String[] args)
	{
        /**
         * 1-100以内的数求和,求出 当和 第一次大于20的当前数. 
         * [for + break]
         * 
         */
        int sum = 0;
        int currNum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
            if(sum > 20) {
                currNum = i;
                break;
            }
        }
        System.out.println("求和后第一次大于20的数为: " + currNum);



        /**
         * 实现登录验证, 有3次机会, 如果用户名为"丁真", 密码"666"提示登录成功
         * 否则提示还有几次机会
         * 请使用for + break完成
         * 
         */
        System.out.println("登录模拟验证");
        Scanner myScanner = new Scanner(System.in);
        int loginErrorNum = 3;
        for(;;) {
            System.out.println("请输入账号:");
            String login = myScanner.next();
            System.out.println("请输入密码:");
            String password = myScanner.next();
            //补充说明: 字符串的内容比较方法 equals
            //if(login.equals("丁真") && password.equals("666")) { //返回 True
            if("丁真".equals(login) && "666".equals(password)) { //返回 True,推荐使用.防止输入空指针
                System.out.println("登录成功!");
                break;
            } else {
                if(loginErrorNum == 1) {
                    System.out.println("达到登录次数限制!");
                    break;
                } else {
                    loginErrorNum--;
                    System.out.println("剩余" + loginErrorNum + "次登录机会!");
                }
            }
        }

	}
}