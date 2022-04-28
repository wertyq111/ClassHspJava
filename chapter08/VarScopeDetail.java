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
    String name = "king";

    public void say()
    {
        //String name = "jack";
        //属性和局部变量可以重名, 访问时遵循就近原则
        System.out.println("say() = " + name);
    }
}