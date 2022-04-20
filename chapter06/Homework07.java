/**
 * 作业
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework07
{
	public static void main(String[] args)
	{
        /**
         * 写出冒泡排序的代码
         * 
         */
        int[] arr = {24, 69, 80, 57, 13};
        int temp = 0;
        int loopNum = arr.length - 1;

        for(int num = 0; num < loopNum; num++) {
            for(int i = 0; i < (loopNum - num); i++) {
                int nextIndex = i + 1;
                if(arr[i] > arr[nextIndex]) {
                    temp = arr[nextIndex];
                    arr[nextIndex] = arr[i];
                    arr[i] = temp;
                }
            } 
            System.out.println("第" + (num + 1) + "轮排序结果");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
        }
	}
}