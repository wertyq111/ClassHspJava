package com.reflection.class_;

import com.Car;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示得到Class对象的各种方式(6)
 */
@SuppressWarnings({"all"})
public class GetClass_ {
    public static void main(String[] args) throws Exception {
        //1.Class.forName
        String classAllPath = "com.Car"; //通过读取配置文件
        Class<?> cls = Class.forName(classAllPath);
        System.out.println(cls);

        //2. 类名.class, 应用场景多用于参数传递
        Class<Car> cls1 = Car.class;
        System.out.println(cls1);

        //3. 对象.getClass(), 应用场景: 有对象实例
        Car car = new Car();
        Class<? extends Car> cls2 = car.getClass();
        System.out.println(cls2);

        //4. 通过类加载器[4 种]来获取到类的 Class 对象
        //(1). 先得到类加载器 Car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2). 通过类加载器得到Class 对象
        Class<?> cls3 = classLoader.loadClass(classAllPath);
        System.out.println(cls3);

        //cls,cls1,cls2,cls3 其实是同一个对象
        System.out.println(cls.hashCode());
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());

        //5. 基本数据
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        System.out.println(integerClass);

        //6. 基本数据类型对应的包装类, 可以通过 .TYPE 得到Class 类型
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);

        System.out.println(integerClass.hashCode());
        System.out.println(type.hashCode());
    }
}
