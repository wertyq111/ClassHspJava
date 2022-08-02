package com.tank_game.panel;

import com.tank_game.model.Enemy;
import com.tank_game.model.Hero;
import com.tank_game.model.TankModel;
import com.tank_game.threads.Bullet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

/**
 * @author zhouxufeng
 * @version 1.0
 * 区域地图
 */
@SuppressWarnings({"all"})
//为了让Areapanel 不停的重回子弹，
public class AreaPanel extends JPanel implements KeyListener {
    private Hashtable<Integer, Hero> heros = new Hashtable<>();
    private Vector<Enemy> enemies = new Vector<>();
    private int drawWidth;
    private int drawHeight;
    private int enemiesSize = 3;

    public AreaPanel(int drawWidth, int drawHeight) {
        this.drawWidth = drawWidth;
        this.drawHeight = drawHeight;
        heros.put(1, new Hero(drawWidth / 3, drawHeight - (drawWidth / 10)));

        for (int i = 0; i < enemiesSize; i++) {
            enemies.add(new Enemy((drawWidth / 5) + ((i + 1) * (drawWidth / 10)), 0, 2));
        }
    }

    public Hashtable<Integer, Hero> getHeros() {
        return heros;
    }

    public void setHeros(Hashtable<Integer, Hero> heros) {
        this.heros = heros;
    }

    public Vector<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(Vector<Enemy> enemies) {
        this.enemies = enemies;
    }

    public int getDrawWidth() {
        return drawWidth;
    }

    public void setDrawWidth(int drawWidth) {
        this.drawWidth = drawWidth;
    }

    public int getDrawHeight() {
        return drawHeight;
    }

    public void setDrawHeight(int drawHeight) {
        this.drawHeight = drawHeight;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //设置颜色并填充区域范围
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1024, 1024);

        //画出正义坦克
        for (Map.Entry<Integer, Hero> hero : heros.entrySet()) {
            drawTank(hero.getValue(), g, hero.getKey());
        }

        if(heros.get(1).bullet != null) {
            System.out.println("子弹加载中...");
            Bullet bullet = heros.get(1).getBullet();
            g.fillOval(bullet.getX(), bullet.getY(), 5, 5);
        }

        //画出敌人坦克
        for (Enemy enemy : enemies) {
            drawTank(enemy, g, 3);
        }
    }

    /**
     * 绘制坦克
     *
     * @param tank
     * @param g
     * @param direct
     * @param type
     */
    public void drawTank(TankModel tank, Graphics g, int type) {
        switch (type) {
            case 1: //坦克1
                g.setColor(Color.cyan);
                break;
            case 2: //坦克2
                g.setColor(Color.yellow);
                break;
            case 3: //敌人坦克
                g.setColor(Color.white);
                break;
        }

        //设置坦克移动速度
        tank.setSpeed(3);

        //根据坦克方向，来绘制坦克
        getLeftTrack(tank, g);
        getRightTrack(tank, g);
        getCabin(tank, g);
        getCover(tank, g);
        getGun(tank, g);
    }

    /**
     * 左履带绘制
     *
     * @param tank
     * @param g
     * @param dierct
     */
    public void getLeftTrack(TankModel tank, Graphics g) {
        switch (tank.getDirect()) {
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
    public void getRightTrack(TankModel tank, Graphics g) {
        int rightTrackX = tank.getX() + tank.getTrackWidth() + tank.getCabinWidth();
        int rightTrackY = tank.getY();
        switch (tank.getDirect()) {
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
    public void getCabin(TankModel tank, Graphics g) {
        int cabinX = tank.getX() + tank.getTrackWidth();
        int cabinY = tank.getY() + (tank.getTrackHeight() / 12);
        switch (tank.getDirect()) {
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
    public void getCover(TankModel tank, Graphics g) {
        int coverX = tank.getX() + tank.getTrackWidth();
        int coverY = tank.getY() + (tank.getTrackHeight() / 6);
        switch (tank.getDirect()) {
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
    public void getGun(TankModel tank, Graphics g) {
        int gunX = tank.getX() + tank.getTrackWidth() + (tank.getCabinWidth() / 2) - (tank.getGunWidth() / 2);
        int gunY = tank.getY() - 5;
        switch (tank.getDirect()) {
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                heros.get(1).moveUp();
                break;
            case KeyEvent.VK_S:
                heros.get(1).moveDown();
                break;
            case KeyEvent.VK_A:
                heros.get(1).moveLeft();
                break;
            case KeyEvent.VK_D:
                heros.get(1).moveRight();
                break;
            case KeyEvent.VK_1:
                if (!heros.containsKey(2)) heros.put(2, new Hero(drawWidth / 2, drawHeight - 100));
                break;
            case KeyEvent.VK_UP:
                if (heros.containsKey(2)) heros.get(2).moveUp();
                break;
            case KeyEvent.VK_DOWN:
                if (heros.containsKey(2)) heros.get(2).moveDown();
                break;
            case KeyEvent.VK_LEFT:
                if (heros.containsKey(2)) heros.get(2).moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                if (heros.containsKey(2)) heros.get(2).moveRight();
                break;
        }

        if(e.getKeyCode() == KeyEvent.VK_J) {
            Hero hero = heros.get(1);
            hero.fire();
        }

        //让面板重绘
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

//    @Override
//    public void run() { //每隔100毫秒，重绘区域，刷新绘图区域，子弹就移动
//        while(true) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            this.repaint();
//        }
//    }
}
