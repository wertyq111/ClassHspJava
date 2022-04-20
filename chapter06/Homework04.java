/**
 * 作业
 * @author zhouxufeng
 * @version 1.0
 */import java.util.Scanner;
public class Homework04
{
	public static void main(String[] args)
	{
        /**
         * 已知有个升序的数组,要求插入一个元素,该数组依然是升序.
         * 比如: 10, 12, 45, 90.添加23后. -> 10, 12, 23, 45, 90
         * 
         * 
         * 思路分析:
         *  1. 定义数组 arr
         *  2. 定义临时数组 arrTemp 并将arr的值拷贝到arrTemp中
         *  3. 将传入的数放到arrTemp最后一位
         *  4. 遍历临时数组 arrTemp. i = 0; i < arrTemp.length - 1; i++
         *  5. arrTemp最后一位与前面的进行比较,小于就进行位置调换
         *  6. 循环结束,排序结束将arrTemp赋值给arr
         */
        int[] arr = {10, 12, 45, 90};
        Scanner myScanner = new Scanner(System.in);
        while(true) {
            System.out.println("请输入需要插入的整数");
            int num = myScanner.nextInt();
            int[] arrTemp = new int[arr.length + 1];

            /** 扩容 -> 冒泡排序 开始 **/
            // for(int i = 0; i < arr.length; i++) {
            //     arrTemp[i] = arr[i];
            // }

            // //将传入的数放到arrTemp最后一位
            // arrTemp[arr.length] = num;

            // for(int i = 0; i < arrTemp.length - 1; i++) {
            //     if(arrTemp[arr.length] < arrTemp[i]) {
            //         int temp = arrTemp[i];
            //         arrTemp[i] = arrTemp[arr.length];
            //         arrTemp[arr.length] = temp;
            //     }
            // }
            /** 扩容 -> 冒泡排序 结束 **/


            /** 定位 -> 扩容 -> 赋值拷贝 开始 **/
            //定位新插入的数在数组中的下标.默认最后一位
            int index = arr.length;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > num) {
                    index = i;
                    break;
                }
            }

            for(int i = 0, j = 0; i < arrTemp.length; i++) {
                if(i != index) {
                    arrTemp[i] = arr[j];
                    j++;
                } else {
                    arrTemp[i] = num;
                }
            }

            /** 定位 -> 扩容 -> 赋值拷贝 结束 **/

            //排序结束将arrTemp赋值给arr
            arr = arrTemp;

            System.out.println("是否继续插入整数? y/n");
            char flag = myScanner.next().charAt(0);
            if(flag == 'n') {
                break;
            }
        }

        System.out.println("======数组排序结果======");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

	}
}