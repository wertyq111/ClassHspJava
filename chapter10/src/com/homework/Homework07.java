package com.homework;

/**
 * @author zhouxufeng
 * @version 1.0
 * 1. 有一个 Car 类, 有属性 temperature(温度)
 * 2. 车内有 Air(空调)类, 有吹风功能flow
 * 3. Air会监视车内温度, 如果温度超过40度则吹冷风, 如果温度低于0度则吹暖气, 如果在这期间则关掉空调
 * 4. 实例化不同温度的 Car 对象, 调用空调flow 方法, 测试空调吹的风是否正确
 */
@SuppressWarnings({"all"})
public class Homework07 {
    public static void main(String[] args) {
        new AdvancedCar(45).new Air().flow();
        new AdvancedCar(-14).new Air().flow();
        new AdvancedCar(30).new Air().flow();
    }
}

class AdvancedCar {
    private double temperature;

    public AdvancedCar(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if(temperature > 40.0){
                System.out.println("正在吹冷风");
            } else if(temperature < 0.0) {
                System.out.println("正在吹暖气");
            } else {
                System.out.println("空调没有开启");
            }
        }
    }
}
