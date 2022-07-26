package com.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author zhouxufeng
 * @version 1.0
 * 演示小球通过键盘控制上下左右的移动 -> 讲解Java的事件机制
 */
@SuppressWarnings({"all"})
public class BallMove extends JFrame {
    private MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(500, 500);
        //窗口JFrame 对象可以监听键盘事件， 即可以监听到面板发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//keyListener 是监听器，可以监听键盘事件
class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20,20);
    }

    /**
     * 有字符输出时，该方法就会触发
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * 当某个键按下，该方法会触发
     */
    @Override
    public void keyPressed(KeyEvent e) {
        //根据用户按下的不同键，来处理小球的移动 (上下左右的键)
        //在java中会给每一个键分配一个值
        if(e.getKeyCode() == KeyEvent.VK_DOWN) { //KeyEvent.VK_DOWN 就是向下的箭头对应的code
            y++;
        } else if(e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        }

        //让面板重绘
        repaint();
    }

    /**
     * 当某个键释放(松开)， 该方法会触发
     */
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
