package com.tank_game;

import com.tank_game.model.Recorder;
import com.tank_game.panel.AreaPanel;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TankGame01 extends JFrame {
    private AreaPanel ap = null;

    public TankGame01() {
        System.out.println("请输入: 1. 新游戏， 2. 继续游戏");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        ap = new AreaPanel(1324, 750, key);
        //将ap 放入到Thread并启动
        Thread thread = new Thread(ap);
        thread.start();
        this.add(ap);
        this.setSize(ap.getDrawWidth(), ap.getDrawHeight());
        this.addKeyListener(ap);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //监听窗口关闭事件，保存击坠数
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    System.out.println("关闭窗口");
                    System.out.println(Recorder.getAllEnemyTankNum());
                    Recorder.keepAllEnemyTankNum();
                    System.exit(0);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        new TankGame01();
    }
}
