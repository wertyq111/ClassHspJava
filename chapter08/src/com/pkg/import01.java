package com.pkg;

import java.util.Arrays;
import java.util.Scanner; //表示只会引入Java.util 包下的 Scanner 类
//import java.util.*; //表示只会引入Java.util 包下的 所有 类

public class import01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //用系统提供的 Arrays 完成数组排序
        int[] arr = {-1, 2, 13, 15};
        //比如对其进行排序
        //传统方法是自己编写排序方法(冒泡)
        //系统提供了相关的类, 可以方便完成 Arrays
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
