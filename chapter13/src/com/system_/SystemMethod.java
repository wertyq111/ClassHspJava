package com.system_;

import java.util.Arrays;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SystemMethod {
    public static void main(String[] args) {
        System.out.println("===exit===");
        //exit 退出当前程序
        System.out.print("hello");
        //1. exit(int status)
        //2. status 0表示一个状态，正常状态
        //System.exit(0);
        System.out.println(" world");

        System.out.println("===arraycopy===");
        //arraycopy 拷贝数组
        int[] arr = {1, 2, 3};
        int[] arr1 = new int[3];
        // 参数说明：
        // 1. arr 源数组，
        // 2. 0 从源数组的哪个索引位置开始拷贝，
        // 3. arr1 目标数组，即把数组的数据拷贝到哪个数组
        // 4. 1 把源数组的数据拷贝到 目标数组的哪个索引
        // 5. 2 从源数组拷贝多少个数据到目标数组
        System.arraycopy(arr, 0, arr1, 1, 2);
        System.out.println(Arrays.toString(arr1));

        System.out.println("===currentTimeMillis===");
        System.out.println(System.currentTimeMillis());
    }
}
