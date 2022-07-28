package com.tank_game;

import com.tank_game.panel.AreaPanel;

import javax.swing.*;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TankGame01 extends JFrame {
    private AreaPanel ap = null;

    public TankGame01() {
        ap = new AreaPanel(1024, 750);
        this.add(ap);
        this.setSize(ap.getDrawWidth(), ap.getDrawHeight());
        this.addKeyListener(ap);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TankGame01();
    }
}
