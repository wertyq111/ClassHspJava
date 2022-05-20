package com.small_change_sys.object_;

/**
 * 消费类
 *  1. 继承消费明细类
 */
public class Consume extends ConsumerDetail {
    public Consume(){}
    public Consume(String name, double amount, String date, double balance) {
        super(name, amount, date, balance);
    }
}
