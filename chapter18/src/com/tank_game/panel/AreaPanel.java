package com.tank_game.panel;

import com.tank_game.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Hashtable;
import java.util.Vector;

/**
 * @author zhouxufeng
 * @version 1.0
 * 区域地图
 */
@SuppressWarnings({"all"})
//为了让Areapanel 不停的重绘子弹，
public class AreaPanel extends JPanel implements KeyListener, Runnable {
    private Hashtable<Integer, Hero> heros = new Hashtable<>(); //正义坦克
    private Vector<Enemy> enemies = new Vector<>(); //敌人坦克
    private Vector<Explosion> explosions = new Vector<>(); //爆炸现象
    private int drawWidth;
    private int drawHeight;
    private int enemiesSize = 10;
    private Image boomPart1 = null;
    private Image boomPart2 = null;
    private Image boomPart3 = null;

    public AreaPanel(int drawWidth, int drawHeight) {
        this.drawWidth = drawWidth;
        this.drawHeight = drawHeight;
        heros.put(1, new Hero(drawWidth / 3, drawHeight - (drawWidth / 10)));

        for (int i = 0; i < enemiesSize; i++) {
            Enemy enemy = new Enemy((drawWidth / enemiesSize) + ((i + 1) * (drawWidth / 10)), 0, 2);
            enemies.add(enemy);
            new Thread(enemy).start();
        }

        boomPart1 = Toolkit.getDefaultToolkit().getImage("./img/boom_part1.png");
        boomPart2 = Toolkit.getDefaultToolkit().getImage("./img/boom_part2.png");
        boomPart3 = Toolkit.getDefaultToolkit().getImage("./img/boom_part3.png");
        explosions.add(new Explosion(-60, -60));

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
        g.drawImage(boomPart3, 0, 0, 0, 0, this);


        //画出正义坦克
        for(int i = 1; i <= heros.size(); i++) {
            Hero hero = heros.get(i);
            if (hero.isLive()) {
                drawTank(hero, g, i);
            }
            if (hero != null && !hero.getBullets().isEmpty()) {
                Vector<Bullet> bullets = hero.getBullets();
                for (int j = 0; j < bullets.size(); j++) {
                    Bullet bullet = bullets.get(j);
                    bullet.setSpeed(10);
                    if (bullet.isLive()) {
                        g.fillOval(bullet.getX(), bullet.getY(), 5, 5);
                    } else {
                        hero.removeBullet(bullet);
                    }
                }
            }
        }
//        for (Map.Entry<Integer, Hero> hero : heros.entrySet()) {
//            if (hero.getValue().isLive()) {
//                drawTank(hero.getValue(), g, hero.getKey());
//            } else {
//                heros.remove(hero.getKey());
//            }
//            if (hero.getValue() != null && !hero.getValue().getBullets().isEmpty()) {
//                Vector<Bullet> bullets = hero.getValue().getBullets();
//                for (int i = 0; i < bullets.size(); i++) {
//                    Bullet bullet = bullets.get(i);
//                    bullet.setSpeed(10);
//                    if (bullet.isLive()) {
//                        g.fillOval(bullet.getX(), bullet.getY(), 5, 5);
//                    } else {
//                        hero.getValue().removeBullet(bullet);
//                    }
//                }
//            }
//        }

        //画出坦克爆炸效果
        for (int num = 0; num < explosions.size(); num++) {
            Explosion explosion = explosions.get(num);

            int number = explosion.getLifeTime();
            g.drawImage(boomPart2, explosion.getX(), explosion.getY(), 60, 60, this);

            if (number > 6) {
                g.drawImage(boomPart3, explosion.getX(), explosion.getY(), 60, 60, this);
            } else if (number > 3) {
                g.drawImage(boomPart2, explosion.getX(), explosion.getY(), 60, 60, this);
            } else if (number > 0) {
                g.drawImage(boomPart1, explosion.getX(), explosion.getY(), 60, 60, this);
            }

            //减少爆炸生命周期
            explosion.blowUp();

            if (explosion.isLive() == false) {
                explosions.remove(explosion);
            }
        }

        //画出敌人坦克
        for (int num = 0; num < enemies.size(); num++) {
            Enemy enemy = enemies.get(num);
            if (enemy.isLive()) {
                drawTank(enemy, g, 3);
            }
            if (enemy.getBullets().size() > 0) {
                g.setColor(Color.white);
                Vector<Bullet> bullets = enemy.getBullets();
                for (int i = 0; i < bullets.size(); i++) {
                    Bullet bullet = bullets.get(i);
                    if (bullet.isLive()) {
                        g.fillOval(bullet.getX(), bullet.getY(), 5, 5);
                    } else {
                        enemy.removeBullet(bullet);
                    }
                }
            }
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

    /**
     * 子弹攻击到坦克
     *
     * @param bullet
     * @param enemy
     */
    public void hitTank(Bullet bullet, TankModel tank) {
        Hashtable<String, Integer> tankArea = tank.getTankArea();
        if (tank.isLive() && bullet.getX() > tankArea.get("minX")
                && bullet.getX() < tankArea.get("maxX")
                && bullet.getY() > tankArea.get("minY")
                && bullet.getY() < tankArea.get("maxY")
        ) {
            Explosion explosion = new Explosion(tankArea.get("minX"), tankArea.get("minY"));
            explosions.add(explosion);
            bullet.setLive(false);
            tank.setLive(false);
        }
    }

    /**
     * 碰撞坦克
     *
     * @param hero
     * @param enemy
     */
    public void collideTank(Hero hero, Enemy enemy) {
        Hashtable<String, Integer> enemyArea = enemy.getTankArea();
        Hashtable<String, Integer> heroArea = hero.getTankArea();
        if (hero.isLive() && enemy.isLive()) {
            switch (hero.getDirect()) {
                case 0:
                    if (((heroArea.get("minX") > enemyArea.get("minX")
                            && heroArea.get("minX") < enemyArea.get("maxX"))
                            || (heroArea.get("maxX") > enemyArea.get("minX")
                            && heroArea.get("maxX") < enemyArea.get("maxX")))
                            && heroArea.get("minY") > enemyArea.get("minY")
                            && heroArea.get("minY") < enemyArea.get("maxY")
                    ) {
                        Explosion enemyExplosion = new Explosion(enemyArea.get("minX"), enemyArea.get("minY"));
                        Explosion heroExplosion = new Explosion(heroArea.get("minX"), heroArea.get("minY"));
                        explosions.add(enemyExplosion);
                        explosions.add(heroExplosion);
                        hero.setLive(false);
                        enemy.setLive(false);
                    }
                    break;
                case 1:
                    if (((heroArea.get("minY") > enemyArea.get("minY")
                            && heroArea.get("minY") < enemyArea.get("maxY"))
                            || (heroArea.get("maxY") > enemyArea.get("minY")
                            && heroArea.get("maxY") < enemyArea.get("maxY")))
                            && heroArea.get("maxX") > enemyArea.get("minX")
                            && heroArea.get("maxX") < enemyArea.get("maxX")
                    ) {
                        Explosion enemyExplosion = new Explosion(enemyArea.get("minX"), enemyArea.get("minY"));
                        Explosion heroExplosion = new Explosion(heroArea.get("minX"), heroArea.get("minY"));
                        explosions.add(enemyExplosion);
                        explosions.add(heroExplosion);
                        hero.setLive(false);
                        enemy.setLive(false);
                    }
                    break;
                case 2:
                    if (((heroArea.get("minX") > enemyArea.get("minX")
                            && heroArea.get("minX") < enemyArea.get("maxX"))
                            || (heroArea.get("maxX") > enemyArea.get("minX")
                            && heroArea.get("maxX") < enemyArea.get("maxX")))
                            && heroArea.get("maxY") > enemyArea.get("minY")
                            && heroArea.get("maxY") < enemyArea.get("maxY")
                    ) {
                        Explosion enemyExplosion = new Explosion(enemyArea.get("minX"), enemyArea.get("minY"));
                        Explosion heroExplosion = new Explosion(heroArea.get("minX"), heroArea.get("minY"));
                        explosions.add(enemyExplosion);
                        explosions.add(heroExplosion);
                        hero.setLive(false);
                        enemy.setLive(false);
                    }
                    break;
                case 3:
                    if (((heroArea.get("minY") > enemyArea.get("minY")
                            && heroArea.get("minY") < enemyArea.get("maxY"))
                            || (heroArea.get("maxY") > enemyArea.get("minY")
                            && heroArea.get("maxY") < enemyArea.get("maxY")))
                            && heroArea.get("minX") > enemyArea.get("minX")
                            && heroArea.get("minX") < enemyArea.get("maxX")
                    ) {
                        Explosion enemyExplosion = new Explosion(enemyArea.get("minX"), enemyArea.get("minY"));
                        Explosion heroExplosion = new Explosion(heroArea.get("minX"), heroArea.get("minY"));
                        explosions.add(enemyExplosion);
                        explosions.add(heroExplosion);
                        hero.setLive(false);
                        enemy.setLive(false);
                    }
                    break;
            }
        }
    }

    /**
     * 碰撞坦克(敌方)
     *
     * @param enemy
     * @param enemy
     */
    public void collideEnemies(Enemy enemy1, Enemy enemy2) {
        Hashtable<String, Integer> enemy1Area = enemy1.getTankArea();
        Hashtable<String, Integer> enemy2Area = enemy2.getTankArea();
        if (enemy1.isLive() && enemy2.isLive()) {
            switch (enemy1.getDirect()) {
                case 0:
                    if (((enemy1Area.get("minX") > enemy2Area.get("minX")
                            && enemy1Area.get("minX") < enemy2Area.get("maxX"))
                            || (enemy1Area.get("maxX") > enemy2Area.get("minX")
                            && enemy1Area.get("maxX") < enemy2Area.get("maxX")))
                            && enemy1Area.get("minY") > enemy2Area.get("minY")
                            && enemy1Area.get("minY") < enemy2Area.get("maxY")
                    ) {
                        //敌方坦克互相碰撞发生方向改变
                        enemy1.setDirect((int)(Math.random() * 4));
                        if(enemy2.getDirect() == 2) {
                            enemy1.setDirect((int)(Math.random() * 4));
                        }
                    }
                    break;
                case 1:
                    if (((enemy1Area.get("minY") > enemy2Area.get("minY")
                            && enemy1Area.get("minY") < enemy2Area.get("maxY"))
                            || (enemy1Area.get("maxY") > enemy2Area.get("minY")
                            && enemy1Area.get("maxY") < enemy2Area.get("maxY")))
                            && enemy1Area.get("maxX") > enemy2Area.get("minX")
                            && enemy1Area.get("maxX") < enemy2Area.get("maxX")
                    ) {
                        //敌方坦克互相碰撞发生方向改变
                        enemy1.setDirect((int)(Math.random() * 4));
                        if(enemy2.getDirect() == 3) {
                            enemy1.setDirect((int)(Math.random() * 4));
                        }
                    }
                    break;
                case 2:
                    if (((enemy1Area.get("minX") > enemy2Area.get("minX")
                            && enemy1Area.get("minX") < enemy2Area.get("maxX"))
                            || (enemy1Area.get("maxX") > enemy2Area.get("minX")
                            && enemy1Area.get("maxX") < enemy2Area.get("maxX")))
                            && enemy1Area.get("maxY") > enemy2Area.get("minY")
                            && enemy1Area.get("maxY") < enemy2Area.get("maxY")
                    ) {
                        //敌方坦克互相碰撞发生方向改变
                        enemy1.setDirect((int)(Math.random() * 4));
                        if(enemy2.getDirect() == 0) {
                            enemy1.setDirect((int)(Math.random() * 4));
                        }
                    }
                    break;
                case 3:
                    if (((enemy1Area.get("minY") > enemy2Area.get("minY")
                            && enemy1Area.get("minY") < enemy2Area.get("maxY"))
                            || (enemy1Area.get("maxY") > enemy2Area.get("minY")
                            && enemy1Area.get("maxY") < enemy2Area.get("maxY")))
                            && enemy1Area.get("minX") > enemy2Area.get("minX")
                            && enemy1Area.get("minX") < enemy2Area.get("maxX")
                    ) {
                        //敌方坦克互相碰撞发生方向改变
                        enemy1.setDirect((int)(Math.random() * 4));
                        if(enemy2.getDirect() == 1) {
                            enemy1.setDirect((int)(Math.random() * 4));
                        }
                    }
                    break;
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                if (heros.containsKey(1)) heros.get(1).moveUp();
                break;
            case KeyEvent.VK_S:
                if (heros.containsKey(1)) heros.get(1).moveDown();
                break;
            case KeyEvent.VK_A:
                if (heros.containsKey(1)) heros.get(1).moveLeft();
                break;
            case KeyEvent.VK_D:
                if (heros.containsKey(1)) heros.get(1).moveRight();
                break;
            case KeyEvent.VK_1:
                if (!heros.containsKey(2)) {
                    heros.put(2, new Hero(drawWidth / 2, drawHeight - 100));
                } else if(heros.get(2).isLive() == false) {
                    heros.get(2).setLive(true);
                    heros.get(2).setX(drawWidth / 2);
                    heros.get(2).setY(drawHeight - 100);
                }
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
            case KeyEvent.VK_J:
                Hero hero = heros.get(1);
                hero.fire();
                break;
        }

        //让面板重绘
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() { //每隔100毫秒，重绘区域，刷新绘图区域，子弹就移动
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //判断坦克是否被击中
            for (Hero hero : heros.values()) {
                for (int i = 0; i < enemies.size(); i++) {
                    //判断地方坦克是否被击中
                    if (hero.getBullets().size() > 0) {
                        for (Bullet bullet : hero.getBullets()) {
                            hitTank(bullet, enemies.get(i));
                        }
                    }

                    //判断我方坦克是否被击中
                    if(enemies.get(i).getBullets().size() > 0) {
                        for(int j = 0; j < enemies.get(i).getBullets().size(); j++) {
                            Bullet enemyBullet = enemies.get(i).getBullets().get(j);
                            hitTank(enemyBullet, hero);
                        }
                    }
                }
                for (int i = 0; i < enemies.size(); i++) {
                    collideTank(hero, enemies.get(i));
                }
            }

            //敌方坦克互相碰撞效果
            for (int i = 0; i < enemies.size(); i++) {
                for (int j = 0; j < enemies.size(); j++) {
                    collideEnemies(enemies.get(i), enemies.get(j));
                }
            }

            repaint();
        }
    }
}
