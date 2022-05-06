/**
 * 作业
 * 创建一个Employee类，属性有（名字，性别，年龄，职位，薪水），
 * 提供3个构造方法，可以初始化
 * (1)（名字，性别，年龄，职位，薪水
 * (2)（名字，性别，年龄）
 * (3)(职位，薪水)
 * 要求充分复用构造器
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework12
{
	public static void main(String[] args)
	{
        Employee employee1 = new Employee("jack", '男', 28, "员工", 12345.6);
        Employee employee2 = new Employee("lucky", '女', 18);
        Employee employee3 = new Employee("学生", 2500);
        System.out.println("姓名: " + employee1.name + " 性别: " + employee1.gender + " 年龄: " + employee1.age + " 职位: " + employee1.position + " 薪水: " + employee1.salary);
        System.out.println("姓名: " + employee2.name + " 性别: " + employee2.gender + " 年龄: " + employee2.age);
        System.out.println("职位: " + employee3.position + " 薪水: " + employee3.salary);
	}
}

class Employee 
{
    String name;
    char gender;
    int age;
    String position;
    double salary;

    public Employee(String name, char gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String position, double salary)
    {
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, char gender, int age, String position, double salary)
    {
        this(name, gender, age); //构造器复用
        this.position = position;
        this.salary = salary;
    }
}