package com.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示如何在面板上画出圆形
 */
@SuppressWarnings({"all"})
public class DrawCircle extends JFrame { // JFrame对应窗口
    // 定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口
        this.add(mp);
        //设置窗口的大小
        this.setSize(1024, 1024);
        //当点击窗口的小x，程序退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); //可以显示
    }
}

//1. 先定义一个MyPanel类,继承JPanel类，画图形就在面板上画
class MyPanel extends JPanel {

    //说明:
    // 1. MyPanel 对象就是一个滑板
    // 2. Graphics g 把 g 理解成一支画笔
    // 3. Graphics 提供了很多绘图的方法
    @Override
    public void paint(Graphics g) { //绘图方法
        super.paint(g);//调用父类的方法完成初始化
        // 画出一个圆形
        //g.drawOval(100, 100, 10, 10);

        //演示绘制不同的图形
        // 画直线 drawLine(int x1, int y1, int x2, int y2)
        //g.drawLine(10, 10, 100, 10);
        // 画矩形边框 drawRect(int x, int y, int width, int height)
        //g.drawRect(10, 20, 50, 50);
        // 画椭圆边框 drawOval(int x, int y, int width, int height)
        // 填充矩形 fillRect(int x, int y, int width, int height)
        //g.setColor(Color.blue);
        //g.fillRect(10, 20, 50, 50);
        // 填充椭圆 fillOval(int x, int y, int width, int height)
        //g.setColor(Color.CYAN);
        //g.fillOval(10, 30, 30, 30);
        // 画图片 drawImage(Image img, int x, int y, ...)
        // 1. 获取图片资源
        //Image image = Toolkit.getDefaultToolkit().getImage("./img/WechatIMG51.png");
        //g.drawImage(image, 50, 50, 848, 964, this);
        // 画字符串 drawString(String str, int x, int y)
        //1. 给画笔设置颜色和字体
        g.setColor(Color.PINK);
        g.setFont(new Font("华文彩云", Font.BOLD, 50));
        // x, y的坐标处于String的左下角
        g.drawString("迎接亚运会", 100, 100);
        // 设置画笔的字体 setFont(Font font)
        // 设置画笔的颜色 setColor(Color c)
    }
}
