package com.inner_class_;

public class AnonymousInnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IB() {
            @Override
            public void show() {
                System.out.println("这是一幅名画");
            }
        });

        f1(new Picture());
    }

    public static void f1(IB ib) {
        ib.show();
    }
}

interface IB {
    void show();
}

//类->实现 IB =>编程领域(硬编码)
class Picture implements IB {
    @Override
    public void show() {
        System.out.println("这是硬编码的世界名画");
    }
}
