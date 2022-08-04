package com.tank_game.model;

import java.util.Hashtable;
import java.util.Vector;

/**
 * @author zhouxufeng
 * @version 1.0
 * 坦克: 敌人
 */
@SuppressWarnings({"all"})
public class Enemy extends TankModel implements Runnable {
    private Vector<Bullet> bullets = new Vector<>();
    public Enemy(int x, int y, int direct) {
        super(x, y, direct);
        new Thread(this).start();
    }

    public void fires() {
        //根据当前坦克位置获取字段坐标
        Hashtable<Character, Integer> bulletCoordinate = getBulletCoordinate();
        Bullet bullet = new Bullet(bulletCoordinate.get('x'), bulletCoordinate.get('y'), getDirect());
        bullets.add(bullet);
        if(isLive() == false) {
            bullet.setLive(false);
        }

        new Thread(bullet).start();
    }

    public Vector<Bullet> getBullets() {
        return bullets;
    }

    public void removeBullet(Bullet bullet) {
        bullets.remove(bullet);
    }

    @Override
    public void run() {
        while(true) {
            fires();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
