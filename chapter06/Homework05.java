/**
 * ��ҵ
 * @author zhouxufeng
 * @version 1.0
 */
public class Homework05
{
	public static void main(String[] args)
	{
        /**
         * �������10������(1-100�ķ�Χ)���浽����
         * �����ӡ�Լ���ƽ��ֵ,�����ֵ�����ֵ���±�
         * ���������Ƿ���8
         * 
         * ˼·����:
         *  1. ����һ������Ϊ10������ arr
         *  2. forѭ��10�����������ŵ�arr�� Match.randrom() * 100;
         *  3. ʹ��ð�����򷨽�ֵ�Ӵ�С����
         *  4. ����sum����������������ֵ�ĺ� Ȼ��(double) / ����ƽ��ֵ
         *  5. ����max���������������ֵ �ҵ����ֵ���±�,˳������Ƿ���8
         */
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }

        //ʹ��ð�����򷨽�ֵ�Ӵ�С����
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

        //�����ӡ
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

        System.out.println("�������ֵΪ: " + max);
        System.out.println("�������ֵ�±�Ϊ: " + maxIndex);
        System.out.println("����ƽ��ֵΪ: " + (double)(sum / arr.length));

        if(flag == 1) {
            System.out.println("�����а���8");
        } else {
            System.out.println("�����в�����8");
        }

	}
}