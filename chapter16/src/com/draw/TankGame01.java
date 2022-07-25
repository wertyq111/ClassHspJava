package com.draw;

import com.tank_game.model.TankModel;
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
        ap = new AreaPanel();
        this.add(ap);
        this.setSize(1024, 1024);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TankGame01();
    }
}
