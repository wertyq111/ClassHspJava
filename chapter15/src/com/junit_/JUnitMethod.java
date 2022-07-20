package com.junit_;

import org.junit.jupiter.api.Test;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class JUnitMethod {
    public static void main(String[] args) {

    }

    @Test
    public void m1() {
        System.out.println("m1方法被调用");
    }

    @Test
    public void m2() {
        System.out.println("m2方法被调用");
    }
}
