package com.debug_;

import java.util.Arrays;

public class DebugDetail {
    public static void main(String[] args) {
        //演示断点调试
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
            //System.out.println("i = " + i);
            //System.out.println("sum = " + sum);
        }
        //System.out.println("end...");

        //演示debug 数组越界异常
        int arr[] = {1, 10, -1, 20, 50};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
