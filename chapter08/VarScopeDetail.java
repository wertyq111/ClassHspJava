/**
 * 作用域
 * @author zhouxufeng
 * @version 1.0
 */
public class VarScopeDetail
{
	public static void main(String[] args)
	{
        Person p = new Person();
        p.say();
    }
}

class Person
{
    //属性可以加修饰符
    public String name = "king";

    public void say()
    {
        //局部变量不能加修饰符
        //String name = "jack";
        //属性和局部变量可以重名, 访问时遵循就近原则
        System.out.println("say() = " + name);
    }
}