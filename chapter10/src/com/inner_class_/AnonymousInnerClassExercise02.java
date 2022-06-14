package com.inner_class_;

/**
 * 需求:
 *  1. 有一个铃声接口Bell， 里面有个ring方法
 *  2. 有一个手机类Cellphone， 具有闹钟功能 alarmClock， 参数是Bell类型
 *  3. 测试手机类的闹钟功能， 通过匿名内部类(对象) 作为参数， 打印： 懒猪起床了
 *  4. 再传入另一个匿名内部类(对象)， 打印： 小伙伴上课了
 */
public class AnonymousInnerClassExercise02 {
    public static void main(String[] args) {
        test(new Bell(){
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        test(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });

        new CellPhone(){}.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了2.0");
            }
        });

        new CellPhone(){
            @Override
            public void alarmClock(Bell bell) {
                super.alarmClock(bell);
            }
        }.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了2.0");
            }
        });
    }

    public static void test(Bell bell) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(bell);
    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClock(Bell bell) {
        System.out.println("alarmClock="+this.getClass());
        System.out.println("Bell="+bell.getClass());
        bell.ring();
    }
}
