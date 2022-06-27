package com.math_;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MathMethod {
    public static void main(String[] args) {
        //1. abs 绝对值
        int abs = Math.abs(9);
        System.out.println(abs);

        //2. pow 求幂
        double pow = Math.pow(2, 4); //2的4次方
        System.out.println(pow);

        //3. ceil 向上取整，返回>=该参数的最小整数(会转成double)
        double ceil = Math.ceil(-3.001);
        System.out.println(ceil);

        //4. floor 向下取证， 返回<=该参数的最大整数(会转成double)
        double floor = Math.floor(-4.999);
        System.out.println(floor);

        //5. round 四舍五入， Math.floor(该参数+0.5)
        long round = Math.round(-5.001);
        System.out.println(round);

        //6.sqrt 求开方
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);

        //7.random 随机数， 返回的是 0<= x < 1之间的一个随机小数[0, 1)
        double random = Math.random();
        System.out.println(random);
        //测试题： 请写出获取 a-b之间的一个随机整数，a,b均为整数？比如 a = 2, b = 7
        System.out.println(getIntRandom(2, 7));

        //8. max 求两个数的最大值
        int max = Math.max(2, 7);
        System.out.println("max:" + max);

        //9. min 求两个数的最小值
        int min = Math.min(2, 7);
        System.out.println("min:"+min);
    }

    public static int getIntRandom(int a, int b) {
        //Math.random() 取值范围是[0, 1)
        // b - a 比如 7 - 2 = 5
        // Math.random()  * (b - a) 取值范围就是[0, 5)
        // Math.random() * (b - a + 1) 取值范围就是[0, 6)
        // Math.random() * (b - a + 1) + a 取值范围就是[2, 8)
        double num = Math.random() * (b - a + 1) + a;

        // 向下取整的double转换成int返回
        return (int)num;
    }
}
