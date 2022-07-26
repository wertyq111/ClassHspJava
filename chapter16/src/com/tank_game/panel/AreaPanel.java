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
        hero = new Hero(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //设置颜色并填充区域范围
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1024, 1024);

        //画出坦克
        hero.setY(hero.getY() + 50);
        drawTank(hero, g, 2, 0);
    }

    /**
     * 绘制坦克
     *
     * @param tank
     * @param g
     * @param direct
     * @param type
     */
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
        getLeftTrack(tank, g, direct);
        getRightTrack(tank, g, direct);
        getCabin(tank, g, direct);
        getCover(tank, g, direct);
        getGun(tank, g, direct);
    }

    /**
     * 左履带绘制
     *
     * @param tank
     * @param g
     * @param dierct
     */
    public void getLeftTrack(TankModel tank, Graphics g, int dierct) {
        switch (dierct) {
            case 0:
            case 2:
                g.fill3DRect(tank.getX(), tank.getY(), tank.getTrackWidth(), tank.getTrackHeight(), false);
                break;
            case 1:
            case 3:
                g.fill3DRect(tank.getX(), tank.getY(), tank.getTrackHeight(), tank.getTrackWidth(), false);
                break;
        }
    }

    /**
     * 右履带绘制
     *
     * @param tank
     * @param g
     * @param dierct
     */
    public void getRightTrack(TankModel tank, Graphics g, int dierct) {
        int rightTrackX = tank.getX() + tank.getTrackWidth() + tank.getCabinWidth();
        int rightTrackY = tank.getY();
        switch (dierct) {
            case 0:
            case 2:
                g.fill3DRect(rightTrackX, rightTrackY, tank.getTrackWidth(), tank.getTrackHeight(), false);
                break;
            case 1:
            case 3:
                rightTrackX = tank.getX();
                rightTrackY = tank.getY() + tank.getTrackWidth() + tank.getCabinWidth();
                g.fill3DRect(rightTrackX, rightTrackY, tank.getTrackHeight(), tank.getTrackWidth(), false);
                break;
        }
    }

    /**
     * 坦克舱体绘制
     *
     * @param tank
     * @param g
     * @param dierct
     */
    public void getCabin(TankModel tank, Graphics g, int dierct) {
        int cabinX = tank.getX() + tank.getTrackWidth();
        int cabinY = tank.getY() + (tank.getTrackHeight() / 12);
        switch (dierct) {
            case 0:
            case 2:
                g.fill3DRect(cabinX, cabinY, tank.getCabinWidth(), tank.getCabinHeight(), false);
                break;
            case 1:
            case 3:
                cabinX = tank.getX() + (tank.getTrackHeight() / 12);
                cabinY = tank.getY() + tank.getTrackWidth();
                g.fill3DRect(cabinX, cabinY, tank.getCabinHeight(), tank.getCabinWidth(), false);
                break;
        }
    }

    /**
     * 坦克舱门绘制
     *
     * @param tank
     * @param g
     * @param dierct
     */
    public void getCover(TankModel tank, Graphics g, int dierct) {
        int coverX = tank.getX() + tank.getTrackWidth();
        int coverY = tank.getY() + (tank.getTrackHeight() / 6);
        switch (dierct) {
            case 0:
            case 2:
                g.fillOval(coverX, coverY, tank.getCoverSize(), tank.getCoverSize());
                break;
            case 1:
            case 3:
                coverX = tank.getX() + (tank.getTrackHeight() / 6);
                coverY = tank.getY() + tank.getTrackWidth();
                g.fillOval(coverX, coverY, tank.getCoverSize(), tank.getCoverSize());
                break;
        }
    }

    /**
     * 炮管绘制
     *
     * @param tank
     * @param g
     * @param dierct
     */
    public void getGun(TankModel tank, Graphics g, int dierct) {
        int gunX = tank.getX() + tank.getTrackWidth() + (tank.getCabinWidth() / 2) - (tank.getGunWidth() / 2);
        int gunY = tank.getY() - 5;
        switch (dierct) {
            case 0:
                g.fillRect(gunX, gunY, tank.getGunWidth(), tank.getGunHeight());
                break;
            case 1:
                gunX = tank.getX() + (tank.getTrackHeight() / 12) + (tank.getCabinHeight() / 2);
                gunY = tank.getY() + tank.getTrackWidth() + (tank.getCabinWidth() / 2) - (tank.getGunWidth() / 2);
                g.fillRect(gunX, gunY, tank.getGunHeight(), tank.getGunWidth());
                break;
            case 2:
                gunX = tank.getX() + tank.getTrackWidth() + (tank.getCabinWidth() / 2) - (tank.getGunWidth() / 2);
                gunY = tank.getY() + tank.getTrackWidth() + (tank.getCabinWidth() / 2) - (tank.getGunWidth() / 2);
                g.fillRect(gunX, gunY, tank.getGunWidth(), tank.getGunHeight());
                break;
            case 3:
                gunX = tank.getX() - 5;
                gunY = tank.getY() + tank.getTrackWidth() + (tank.getCabinWidth() / 2) - (tank.getGunWidth() / 2);
                g.fillRect(gunX, gunY, tank.getGunHeight(), tank.getGunWidth());
                break;
        }
    }
}
