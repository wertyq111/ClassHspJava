/**
 * ��ҵ
 * @author zhouxufeng
 * @version 1.0
 */import java.util.Scanner;
public class Homework04
{
	public static void main(String[] args)
	{
        /**
         * ��֪�и����������,Ҫ�����һ��Ԫ��,��������Ȼ������.
         * ����: 10, 12, 45, 90.���23��. -> 10, 12, 23, 45, 90
         * 
         * 
         * ˼·����:
         *  1. �������� arr
         *  2. ������ʱ���� arrTemp ����arr��ֵ������arrTemp��
         *  3. ����������ŵ�arrTemp���һλ
         *  4. ������ʱ���� arrTemp. i = 0; i < arrTemp.length - 1; i++
         *  5. arrTemp���һλ��ǰ��Ľ��бȽ�,С�ھͽ���λ�õ���
         *  6. ѭ������,���������arrTemp��ֵ��arr
         */
        int[] arr = {10, 12, 45, 90};
        Scanner myScanner = new Scanner(System.in);
        while(true) {
            System.out.println("��������Ҫ���������");
            int num = myScanner.nextInt();
            int[] arrTemp = new int[arr.length + 1];

            /** ���� -> ð������ ��ʼ **/
            // for(int i = 0; i < arr.length; i++) {
            //     arrTemp[i] = arr[i];
            // }

            // //����������ŵ�arrTemp���һλ
            // arrTemp[arr.length] = num;

            // for(int i = 0; i < arrTemp.length - 1; i++) {
            //     if(arrTemp[arr.length] < arrTemp[i]) {
            //         int temp = arrTemp[i];
            //         arrTemp[i] = arrTemp[arr.length];
            //         arrTemp[arr.length] = temp;
            //     }
            // }
            /** ���� -> ð������ ���� **/


            /** ��λ -> ���� -> ��ֵ���� ��ʼ **/
            //��λ�²�������������е��±�.Ĭ�����һλ
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

            /** ��λ -> ���� -> ��ֵ���� ���� **/

            //���������arrTemp��ֵ��arr
            arr = arrTemp;

            System.out.println("�Ƿ������������? y/n");
            char flag = myScanner.next().charAt(0);
            if(flag == 'n') {
                break;
            }
        }

        System.out.println("======����������======");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

	}
}