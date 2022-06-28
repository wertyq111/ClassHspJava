package com.big_number_;

import java.math.BigInteger;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BigIntegerMethod {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("123456788987665543321234456");
        System.out.println(num1);

        //只能通过对应的方法才能进行运算, 运算方法只接受BigInteger类型的参数
        System.out.println("===add===");
        System.out.println(num1.add(new BigInteger("123456788987665543321234456")));
        System.out.println("===subtract===");
        System.out.println(num1.subtract(new BigInteger("123456788987665543321234456")));
        System.out.println("===multiply===");
        System.out.println(num1.multiply(new BigInteger("123456788987665543321234456")));
        System.out.println("===divide===");
        System.out.println(num1.divide(new BigInteger("12345678898766554332123446")));
    }
}
