/**
 * ����ѭ����ϰ
 * @author zhouxufeng
 * @version 1.0
 */
import java.util.Scanner;
public class MoultiplyForExercise
{
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);

		/**
		 * ͳ��3����ɼ����, ÿ������5��ͬѧ, 
		 * ����:
		 * 	1. �������ƽ����
		 * 	2. ���а༶��ƽ����
		 *	3. ��������
		 * [ѧ���ɼ��Ӽ�������]
		 * 
		 */
		int classNum = 3;
		int studentNum = 5;
		double classSum = 0.0;
		int passNum = 0;
		double passScore = 60.0;
		int i = 1;
		double currentScore = 0.0;


		while(i <= classNum) {
			double currClassSum = 0.0;
			for (int j = 1; j <= studentNum; j++) {
				System.out.println("������" + i + "��" + "��ͬѧ" + j + "�ĳɼ�");
				currentScore = myScanner.nextDouble();
				currClassSum += currentScore;
				//�ۻ���������
				if(currentScore >= passScore) {
					passNum++;
				}
			}
			//����ǰ�༶���ܷ��ۻ������а༶���ܷ�
			classSum += currClassSum;
			System.out.println(i + "���ƽ������: " + (double)(currClassSum / studentNum));
			i++;
		}
		System.out.println("���а��ƽ������: " + (double)(classSum / (studentNum * classNum)));
		System.out.println("���а༰������: " + passNum);


		/**
		 * ��ӡ���žų˷���
		 * 1 x 1 = 1
		 * 1 x 2 = 2	2 x 2 = 4
		 * 1 x 3 = 3    2 x 3 = 6     3 x 3 = 9
		 * 1 x 4 = 4    2 x 4 = 8     3 x 4 = 12    4 x 4 = 16
		 * 1 x 5 = 5    2 x 5 = 10    3 x 5 = 15    4 x 5 = 20    5 x 5 = 25
		 * 1 x 6 = 6    2 x 6 = 12    3 x 6 = 18    4 x 6 = 24    5 x 6 = 30   6 x 6 = 36
		 * 1 x 7 = 7    2 x 7 = 14    3 x 7 = 21    4 x 7 = 28    5 x 7 = 35   6 x 7 = 42    7 x 7 = 49
		 * 1 x 8 = 9    2 x 8 = 16    3 x 8 = 24    4 x 8 = 32    5 x 8 = 40   6 x 8 = 48    7 x 8 = 56    8 x 8 = 64
		 * 1 x 9 = 9    2 x 9 = 18    3 x 9 = 27    4 x 9 = 36    5 x 9 = 45   6 x 9 = 54    7 x 9 = 63    8 x 9 = 72    9 x 9 = 81
		 */
		System.out.println("�žų˷���");
		int end = 9;
		while(i < end) {
			for(int j = 1;j <= i; j++) {
				System.out.print(j + " x " + i + " = " + (i * j) + "\t");
			}
			System.out.println("");
			i++;
		}
		for(int i = 1;i < end;i++) {
			for(int j = 1;j <= i; j++) {
				System.out.print(j + " x " + i + " = " + (i * j) + "\t");
			}
			System.out.println("");
		}

		/**
		 * ��ӡ���Ľ�����
		 *    *   
		 *   * *   
		 *  *   *
		 * *******
		 * 
		 * ˼·����
		 * 	1. ����Ϊ��
		 * 		1. �ȴ�ӡһ������
		 * 			*******
		 * 			*******
		 * 			*******
		 * 			*******
		 * 		2. ��ӡ���������
		 * 			*
		 * 			**
		 * 			***
		 * 			****
		 * 			*****
		 * 		3. ��ӡ����������
		 * 			    *       //�� 1 �� �� 1 ��*  2 * 1 - 1  ǰ��ո��� 4 (�ܲ��� - ��ǰ����)
		 * 			   ***      //�� 2 �� �� 3 ��*  2 * 2 - 1  ǰ��ո��� 3
		 * 			  *****     //�� 3 �� �� 5 ��*  2 * 3 - 1  ǰ��ո��� 2
		 * 			 *******    //�� 4 �� �� 7 ��*  2 * 4 - 1  ǰ��ո��� 1
		 * 			*********   //�� 5 �� �� 9 ��*  2 * 5 - 1  ǰ��ո��� 0
		 * 		4. ��ӡ���Ľ�����
		 * 			    *       //�� 1 �� �� 1 ��*  2 * 1 - 1  ǰ��ո��� 4 (�ܲ��� - ��ǰ����) 
		 * 			   * *      //�� 2 �� �� 3 ��*  2 * 2 - 1  ǰ��ո��� 3  �м�� 1 ��(��������ʾ�� 1, 3 λ��)
		 * 			  *   *     //�� 3 �� �� 5 ��*  2 * 3 - 1  ǰ��ո��� 2  �м�� 3 ��(��������ʾ�� 1, 5 λ��)
		 * 			 *     *    //�� 4 �� �� 7 ��*  2 * 4 - 1  ǰ��ո��� 1  �м�� 5 ��(��������ʾ�� 1, 7 λ��)
		 *			*********   //�� 5 �� �� 9 ��*  2 * 5 - 1  ǰ��ո��� 0 
		 */
		System.out.println("���Ľ�����");
		int line = 15;
		// �ȴ�ӡһ������
		// for(int i = 1;i <= line; i++) { //��ʾ����
		// 	System.out.println("*******");
		// }

		// ��ӡ���������
		// for(int i = 1;i <= line; i++) { //��ʾ����
		// 	//����ÿ���ӡ��*����
		// 	for (int j = 1;j <= i;j++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println("");
		// }

		// ��ӡ���Ľ�����
		for(int i = 1;i <= line; i++) { //��ʾ����
			//��ӡ*ǰ��Ŀո�
			for(int k = 1; k <= line - i; k++) {
				System.out.print(" ");
			}
			//����ÿ���ӡ��*����
			for (int j = 1;j <= (2 * i - 1);j++) {
				if(j == 1 || j == (2 * i - 1) || i == line) { //�ڵ� 1 λ����� 1 λ��ӡ * ,����λ�ô�ӡ�ո�.���һ��ȫ����ӡ * 
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		/**
		 * ��ӡ��������
		 *     *   
		 *    * *   
		 *   *   *
		 *  *     *
		 * *       *
		 *  *     *
		 *   *   *
		 *    * *
		 *     *
		 * 
		 * ˼·����
		 * 	1. ����Ϊ��
		 * 		1. �ȴ�ӡһ������
		 * 			*********
		 * 			*********
		 * 			*********
		 * 			*********
		 * 			*********
		 * 			*********
		 * 			*********
		 * 			*********
		 * 			*********
		 * 		2. ��ӡ�������
		 * 			*
		 * 			**
		 * 			***
		 * 			****
		 * 			*****
		 * 			****
		 * 			***
		 * 			**
		 * 			*
		 * 		3. ��ӡ��������
		 * 			    *       //�� 1 �� �� 1 ��*  2 * 1 - 1  ǰ��ո��� 4 (�ܲ��� / 2 - ��ǰ����)
		 * 			   ***      //�� 2 �� �� 3 ��*  2 * 2 - 1  ǰ��ո��� 3
		 * 			  *****     //�� 3 �� �� 5 ��*  2 * 3 - 1  ǰ��ո��� 2
		 * 			 *******    //�� 4 �� �� 7 ��*  2 * 4 - 1  ǰ��ո��� 1
		 * 			*********   //�� 5 �� �� 9 ��*  2 * 5 - 1  ǰ��ո��� 0 
		 * 			 *******    //�� 6 �� �� 7 ��*  2 * 4(10 - 6) - 1  ǰ��ո��� 1 (��ǰ���� - �ܲ��� / 2)
		 * 			  *****     //�� 7 �� �� 5 ��*  2 * 3(10 - 7) - 1  ǰ��ո��� 2
		 * 			   ***      //�� 8 �� �� 3 ��*  2 * 2(10 - 8) - 1  ǰ��ո��� 3
		 * 			    *       //�� 9 �� �� 1 ��*  2 * 1(10 - 9) - 1  ǰ��ո��� 4
		 * 		4. ��ӡ���Ľ�����
		 * 			    *       //�� 1 �� �� 1 ��*  2 * 1 - 1  ǰ��ո��� 4 ��������ʾ�� 1 ����� 1 λ��
		 * 			   * *      //�� 2 �� �� 3 ��*  2 * 2 - 1  ǰ��ո��� 3 ��������ʾ�� 1 ����� 1 λ��
		 * 			  *   *     //�� 3 �� �� 5 ��*  2 * 3 - 1  ǰ��ո��� 2 ��������ʾ�� 1 ����� 1 λ��
		 * 			 *     *    //�� 4 �� �� 7 ��*  2 * 4 - 1  ǰ��ո��� 1 ��������ʾ�� 1 ����� 1 λ��
		 *			*       *   //�� 5 �� �� 9 ��*  2 * 5 - 1  ǰ��ո��� 0 ��������ʾ�� 1 ����� 1 λ��
		 * 			 *     *    //�� 6 �� �� 7 ��*  2 * 4 - 1  ǰ��ո��� 1 ��������ʾ�� 1 ����� 1 λ��
		 * 			  *   *     //�� 7 �� �� 5 ��*  2 * 3 - 1  ǰ��ո��� 2 ��������ʾ�� 1 ����� 1 λ��
		 * 			   * *      //�� 8 �� �� 3 ��*  2 * 2 - 1  ǰ��ո��� 3 ��������ʾ�� 1 ����� 1 λ��
		 *			    *       //�� 9 �� �� 1 ��*  2 * 1 - 1  ǰ��ո��� 4 ��������ʾ�� 1 ����� 1 λ��
		 */

		System.out.println("��������");
		int halfLine = 30;
		line = halfLine * 2 - 1;
		for(int i = 1;i <= line; i++) { //��ʾ����
			//��ӡ*ǰ��Ŀո�
			if(i <= halfLine) {
				for(int k = 1; k <= halfLine - i; k++) {
					System.out.print(" ");
				}
			} else {
				for(int k = 1; k <= i - halfLine; k++) {
					System.out.print(" ");
				}
			}

			//����ÿ���ӡ��*����
			int maxNum = 2 * i - 1;
			if(i > halfLine) {
				maxNum = 2 * (halfLine * 2 - i) - 1; 
			}
			for (int j = 1;j <= maxNum;j++) {
				if(j == 1 || j == maxNum) { //�ڵ� 1 λ����� 1 λ��ӡ * ,����λ�ô�ӡ�ո�
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}