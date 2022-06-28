package com.big_number_;

import java.math.BigDecimal;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BigDecimalMethod {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("123456788987665543321234456.23123");
        System.out.println(num1);

        //只能通过对应的方法才能进行运算, 运算方法只接受BigDecimal类型的参数
        System.out.println("===add===");
        System.out.println(num1.add(new BigDecimal("123456788987665543321234456")));
        System.out.println("===subtract===");
        System.out.println(num1.subtract(new BigDecimal("123456788987665543321234456")));
        System.out.println("===multiply===");
        System.out.println(num1.multiply(new BigDecimal("123456788987665543321234456")));
        System.out.println("===divide===");//出现除不尽的错误异常
        //System.out.println(num1.divide(new BigDecimal("3123456788987665543321234456")));
        //调用除法的时候制定精度即可 BigDecimal.ROUND_CEILING表示向上取整
        System.out.println(num1.divide(new BigDecimal("3123456788987665543321234456"), BigDecimal.ROUND_CEILING));
        System.out.println(num1.divide(new BigDecimal("3123456788987665543321234456"), 2, BigDecimal.ROUND_HALF_UP));
    }
}
