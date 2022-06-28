package com.arrays_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ArraysMethod {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};

        // 直接使用Arrays.toString()方法，输出的数组内容
        System.out.println(Arrays.toString(integers));

        // sort()方法，对数组进行排序
        // 因为数组是引用类型， 所以通过sort排序后会直接影响到 实参 arr
        // sort重载的，也可以通过传入一个接口 Comparator 实现定制排序
        Integer arr[] = {1, -2, 5, 4, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // 定制排序
        // 实现 Comparator 接口，重写 compare 方法，实现自定义排序
        // sort源码分析
        // 1. sort(a, comparator)
        // 2. 最终到 TimSort 类的 binarySort(T[] a, int lo, int hi, int start,
        //                                       Comparator<? super T> c)
        // 3. 执行到binarySort方法的代码, 会根据动态绑定机制 c.compare()执行我们传入的匿名内部类的compare()
        //      while (left < right) {
        //                int mid = (left + right) >>> 1;
        //                if (c.compare(pivot, a[mid]) < 0)
        //                    right = mid;
        //                else
        //                    left = mid + 1;
        //            }
        // 4. compare() 返回的值 >0 或 <0 影响排序结果
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Integer) o2).compareTo((Integer) o1);
            }
        });

        System.out.println(Arrays.toString(arr));

        System.out.println("================binarySearch二分搜索法===============");
        Integer[] arr2 = {1, 2, 90, 123, 567};
        // 解读
        // 1. 使用 binarySearch 二叉查找
        // 2. 要求该数组是有序的，如果该数组是无序的，不能使用 binarySearch 方法
        // 3. 如果数组中不存在该元素， 就返回 return -(low + 1); //key not found
        // 4. low 表示如果存在查找的值应该在的位置
        int index = Arrays.binarySearch(arr2, 99);
        System.out.println(index);

        System.out.println("================copyOf方法===============");
        // copyOf方法， 将数组复制到新的数组中
        // 如果拷贝长度 > 数组长度，就在新数组的后面增加 null
        // 如果拷贝长度 < 0 就抛出异常 NegativeArraySizeException
        // 该方法的底层是 System.arraycopy 方法
        Integer[] newArr = Arrays.copyOf(arr2, arr2.length + 1);
        System.out.println(Arrays.toString(newArr));

        System.out.println("================fill数组填充方法===============");
        Integer[] arr3 = {1, 2, 3, 4, 5};
        // fill方法， 将数组中的元素全部填充为指定的值.可以理解为替换原来的数
        Arrays.fill(arr3, 99);
        System.out.println(Arrays.toString(arr3));

        System.out.println("================equals比较数组元素是否相同方法===============");
        boolean equals = Arrays.equals(arr2, arr3);
        System.out.println("equals=" + equals);

        System.out.println("================asList方法===============");
        // asList方法， 将数组转换为 List 对象
        // 如果数组是 null， 就返回 null
        // 如果数组是空数组， 就返回空的 List 对象
        // 如果数组不是 null， 也不是空数组， 就返回一个包含数组中元素的 List 对象
        // 返回的 list 编译类型 List(接口)
        // list 的运行类型是 java.util.Array#ArrayList, 是Array类的静态内部类
        List list = Arrays.asList(arr2);
        System.out.println(list);
    }
}
