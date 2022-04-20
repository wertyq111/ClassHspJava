/**
 * 类与对象详情
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class ObjectDetail
{
	public static void main(String[] args)
	{
        //使用OOP面向对象解决
        //实例化一只猫(创建一只猫)
        //老韩解读
        //  1. new Cat() 创建一只猫
        //  2. Cat cat1 = new Cat(); 把创建的猫赋给 cat1
        //  3. cat1 就是一个对象
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";

        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";

        System.out.println("第一只猫的信息 \n 名字: " + cat1.name + "\t年龄: " + cat1.age + "\t颜色: " + cat1.color);
        System.out.println("第二只猫的信息 \n 名字: " + cat2.name + "\t年龄: " + cat2.age + "\t颜色: " + cat2.color);
    }
}

/**
 * 使用面像对象的方式来解决养猫问题
 * 
 * 定义一个猫类 Cat -> 自定义数据类型
 */
class Cat 
{
    //属性/成员变量
    String name; //名字
    int age; //年龄
    String color; //颜色
}