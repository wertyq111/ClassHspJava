/**
 * 作业
 * 设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show()
 * 显示其信息并创建对象，进行测试、【提示this.属性】
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework07
{
	public static void main(String[] args)
	{
        Dog d = new Dog("boom", "white", 2);
        d.show();
	}
}

class Dog
{
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age)
    {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show()
    {
        System.out.println("小狗名字: " + this.name);
        System.out.println("小狗颜色: " + this.color);
        System.out.println("小狗年龄: " + this.age);
    }
}