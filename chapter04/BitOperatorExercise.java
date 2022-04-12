/**
 * 位运算操作练习
 * @author zhouxufeng
 * @version 1.0
 */
public class BitOperatorExercise
{
	public static void main(String[] args)
	{
        int a = 1>>2;
        int b = -1>>2;
        int c = 1<<2;
        int d = -1<<2;
        int e = 3>>>2;
        int f = -3>>>2;

        /**
         * 解读:
         *  1. a = 1 原码: 00000000 00000000 00000000 00000001
         *  2. 补码:       00000000 00000000 00000000 00000001
         *  3. 按算术右移>>运算:
         *      1. 运算后补码: 00000000 00000000 00000000 00000000
         *      2. 运算后原码: 00000000 00000000 00000000 00000000
         *      3. 运算后结果: 0
         */
        System.out.println("a = " + a);

        /**
         * 解读:
         *  1. b = -1 原码: 10000000 00000000 00000000 00000001
         *  2. 反码:        11111111 11111111 11111111 11111110
         *  3. 补码:        11111111 11111111 11111111 11111111
         *  4. 按算术右移>>运算:
         *      1. 运算后补码: 11111111 11111111 11111111 11111111
         *      2. 运算后反码: 11111111 11111111 11111111 11111110
         *      3. 运算后原码: 10000000 00000000 00000000 00000001
         *      4. 运算后结果: -1
         */
        System.out.println("b = " + b);

        /**
         * 解读:
         *  1. c = 1 原码: 00000000 00000000 00000000 00000001
         *  2. 补码:       00000000 00000000 00000000 00000001
         *  3. 按算术左移<<运算:
         *      1. 运算后补码: 00000000 00000000 00000000 00000100
         *      2. 运算后原码: 00000000 00000000 00000000 00000100
         *      3. 运算后结果: 4
         */
        System.out.println("c = " + c);

        /**
         * 解读:
         *  1. d = -1 原码: 10000000 00000000 00000000 00000001
         *  2. 反码:        11111111 11111111 11111111 11111110
         *  3. 补码:        11111111 11111111 11111111 11111111
         *  4. 按算术左移<<运算:
         *      1. 运算后补码: 11111111 11111111 11111111 11111100
         *      2. 运算后反码: 11111111 11111111 11111111 11111011
         *      3. 运算后原码: 10000000 00000000 00000000 00000100
         *      4. 运算后结果: -4
         */
        System.out.println("d = " + d);

        /**
         * 解读:
         *  1. e = 3 原码: 00000000 00000000 00000000 00000011
         *  2. 补码:       00000000 00000000 00000000 00000011
         *  3. 按逻辑右移>>>运算:
         *      1. 运算后补码: 00000000 00000000 00000000 00000000
         *      2. 运算后原码: 00000000 00000000 00000000 00000000
         *      3. 运算后结果: 0
         */
        System.out.println("e = " + e);

        /**
         * 解读:
         *  1. f = -3 原码: 10000000 00000000 00000000 00000011
         *  2. 反码:        11111111 11111111 11111111 11111100
         *  3. 补码:        11111111 11111111 11111111 11111101
         *  4. 按逻辑右移>>>运算:
         *      1. 运算后补码: 00111111 11111111 11111111 11111111
         *      2. 运算后原码: 00111111 11111111 11111111 11111111
         *      3. 运算后结果: 1073741823
         */
        System.out.println("f = " + f);

        /**
         * 解读:
         *  1. -5 原码: 10000000 00000000 00000000 00000101
         *  2. 反码:    11111111 11111111 11111111 11111010
         *  3. 补码:    11111111 11111111 11111111 11111011
         *  4. 按位取反~运算:
         *      1. 运算后补码: 00000000 00000000 00000000 00000100
         *      3. 运算后原码: 00000000 00000000 00000000 00000100
         *      4. 运算后结果: 4
         */
        System.out.println(~-5);

        /**
         * 解读:
         *  1. 13 补码: 00000000 00000000 00000000 00001101
         *  2. 7  补码: 00000000 00000000 00000000 00000111
         *  3. 按位与&运算:
         *      1. 运算后补码: 00000000 00000000 00000000 00000101
         *      2. 运算后原码: 00000000 00000000 00000000 00000101
         *      3. 运算后结果: 5
         */
        System.out.println(13&7);

        /**
         * 解读:
         *  1. 5 补码: 00000000 00000000 00000000 00000101
         *  2. 4 补码: 00000000 00000000 00000000 00000100
         *  3. 按位或|运算:
         *      1. 运算后补码: 00000000 00000000 00000000 00000101
         *      2. 运算后原码: 00000000 00000000 00000000 00000101
         *      3. 运算后结果: 5
         */
        System.out.println(5|4);

        /**
         * 解读:
         *  1. -3 补码: 11111111 11111111 11111111 11111101
         *      1. 原码: 10000000 00000000 00000000 00000011
         *      2. 反码: 11111111 11111111 11111111 11111100
         *  2. 3  补码: 00000000 00000000 00000000 00000011
         *  3. 按位或|运算:
         *      1. 运算后补码: 11111111 11111111 11111111 11111111
         *      2. 运算后反码: 11111111 11111111 11111111 11111110
         *      3. 运算后原码: 10000000 00000000 00000000 00000001
         *      4. 运算后结果: -1
         */
        System.out.println(-3|3);

    }
}