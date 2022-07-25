package com.tank_game.panel;

import com.tank_game.model.Hero;
import com.tank_game.model.TankModel;

import javax.swing.*;
import java.awt.*;

/**
 * @author zhouxufeng
 * @version 1.0
 * 区域地图
 */
@SuppressWarnings({"all"})
public class AreaPanel extends JPanel {
    Hero hero = null;
    public AreaPanel() {
        hero = new Hero(100 ,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //设置颜色并填充区域范围
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1024, 1024);

        //画出坦克
        drawTank(hero, g, 0, 0);
        drawTank(hero, g, 0, 1);
    }

    public void drawTank(TankModel tank, Graphics g, int direct, int type) {
        switch (type) {
            case 0: //我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1: //设置敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制坦克
        switch (direct) {
            case 0:
                Hero mine = (Hero) tank;
                //左履带
                g.fill3DRect(mine.getX(), mine.getY(), mine.getTrackWidth(), mine.getTrackHeight(), false);
                //舱体
                int cabinX = mine.getX() + mine.getTrackWidth();
                int cabinY = mine.getY() + (mine.getTrackHeight() / 12);
                g.fill3DRect(cabinX, cabinY, mine.getCabinWidth(), mine.getCabinHeight(), false);
                //右履带
                int rightTrackX = cabinX + mine.getCabinWidth();
                int rightTrackY = mine.getY();
                g.fill3DRect(rightTrackX, rightTrackY, mine.getTrackWidth(), mine.getTrackHeight(), false);
                //舱盖
                int coverX = cabinX;
                int coverY = cabinY + (mine.getTrackHeight() / 12);
                g.fillOval(coverX, coverY, mine.getCoverSize(), mine.getCoverSize());
                //炮管
                int gunX = cabinX + (mine.getCabinWidth() / 2) - (mine.getGunWidth() / 2);
                int gunY = mine.getY() - 5;
                g.fillRect(gunX, gunY, mine.getGunWidth(), mine.getGunHeight());
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }
}
