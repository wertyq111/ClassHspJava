import java.util.Scanner;

public class ArrayTest {
    //创建一个类MyTool,完成对int数组的冒泡排序练习
    //自动模板 输入 main 回车
    public static void main(String[] args) {
        //自动分配变量名
        Scanner scanner = new Scanner(System.in);
        int[] arr = {14, 25, 75, 11, 74, 55};
        MyTool myTool = new MyTool();
        int[] newArr = myTool.bubble(arr);

        //自动模板 fori
        for (int i = 0; i < newArr.length; i++) {
            //自动模板 sout
            System.out.print(newArr[i] + " ");
        }
    }
}

class MyTool {
    public int[] bubble(int[] arr) {
        int temp = 0;
        int loopNum = arr.length - 1;

        for (int i = 0; i < loopNum; i++) {
            for (int j = 0; j < loopNum - i; j++) {
                int nextIndex = j + 1;
                if (arr[j] > arr[nextIndex]) {
                    temp = arr[j];
                    arr[j] = arr[nextIndex];
                    arr[nextIndex] = temp;
                }
            }
        }

        return arr;
    }
}

// 查看类的继承关系 ctrl + H
class Person {
    String name;
    int age;

    //构造器快速生成

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
