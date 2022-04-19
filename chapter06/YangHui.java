/**
 * 杨辉三角
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * ...
 * 提示: 
 *  1. 第 1 行有 1 个元素, 第 n 行有 n 个元素
 *  2. 每一行的第一个元素和最后一个元素都是1
 *  3. 从第三行开始,对于非第一个元素和最后一个元素的值.arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
 * @author zhouxufeng
 * @version 1.0
 */
public class YangHui
{
	public static void main(String[] args)
	{
        int[][] arr = new int[10][];

        for(int i = 0; i < arr.length; i++) {
            for(int k = 0; k < arr.length - i; k++) {
                if(k > 0) {
                    System.out.print(" ");
                }
            }
            arr[i] = new int[i + 1];
            for(int j = 0; j < arr[i].length; j++) {
                if(j == 0 || j == (arr[i].length - 1)) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        
	}
}