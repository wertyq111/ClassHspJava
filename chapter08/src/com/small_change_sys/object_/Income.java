package com.small_change_sys.object_;

/**
 * 收益入账类
 *  1. 继承消费明细类
 *  2. 方法重写: 收益入账
 */
public class Income extends ConsumerDetail {
    private String name = "收益入账";

    public Income(String name, double amount, String date, double balance) {
        super(name, amount, date, balance);
    }

    public Income() {}

    @Override
    public String getName() {
        return name;
    }
}
