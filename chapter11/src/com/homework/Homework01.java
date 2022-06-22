package com.homework;

import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 * 1. 创建一个 Color 枚举类
 * 2. 有 RED, BLUE, BLACK, YELLOW, GREEN 五个枚举值/对象
 * 3. Color 有三个属性 redValue, greenValue, blueValue
 * 4. 创建构造方法, 参数包括这三个属性
 * 5. 每个枚举值都要给这三个属性赋值, 三个属性堆应的值分别是:
 * 6. red:255,0,0 blue:0,0,255 black:0,0,0 yellow:255,255,0 green:0,255,0
 * 7. 定义接口, 里面有方法show, 要求 Color实现该接口
 * 8. show方法中显示三属性的值
 * 9. 将枚举对象在switch语句中匹配使用
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String colorName = scanner.next();

            switch(colorName) {
                case "red":
                    Color.RED.show();
                    break;
                case "blue":
                    Color.BLUE.show();
                    break;
                case "black":
                    Color.BLACK.show();
                    break;
                case "yellow":
                    Color.YELLOW.show();
                    break;
                case "green":
                    Color.GREEN.show();
                    break;
            }
        }
    }
}

@SuppressWarnings({"all"})
enum Color implements Colors{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("当前颜色属性：" + redValue + ", " + greenValue + ", " + blueValue);
    }
}

@SuppressWarnings({"all"})
interface Colors {
    void show();
}
