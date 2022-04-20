/**
 * 作业
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework05
{
	public static void main(String[] args)
	{
        /**
         * 随机生成10个整数(1-100的范围)保存到数组
         * 倒序打印以及求平均值,求最大值和最大值的下标
         * 查找里面是否有8
         * 
         * 思路分析:
         *  1. 定义一个长度为10的数组 arr
         *  2. for循环10次生成整数放到arr中 Match.randrom() * 100;
         *  3. 使用冒泡排序法将值从大到小排序
         *  4. 定义sum用来保存数组所有值的和 然后(double) / 计算平均值
         *  5. 定义max用来保存数组最大值 找到最大值和下标,顺便查找是否有8
         */
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }

        //使用冒泡排序法将值从大到小排序
        // int len = arr.length - 1;
        // for(int i = 0; i < len; i++) {
        //     for(int j = 0; j < len - i; j++) {
        //         int nextIndex = j + 1;
        //         if(arr[j] < arr[nextIndex]) {
        //             int temp = arr[j];
        //             arr[j] = arr[nextIndex];
        //             arr[nextIndex] = temp;
        //         }
        //     }
        // }

        //倒序打印
        for(int i = (arr.length - 1); i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        double sum = 0;
        int max = arr[0];
        int maxIndex = 0;
        int flag = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i] == 8) {
                flag = 1;
            }
        }

        System.out.println("数组最大值为: " + max);
        System.out.println("数组最大值下标为: " + maxIndex);
        System.out.println("数组平均值为: " + (double)(sum / arr.length));

        if(flag == 1) {
            System.out.println("数组中包含8");
        } else {
            System.out.println("数组中不包含8");
        }

	}
}