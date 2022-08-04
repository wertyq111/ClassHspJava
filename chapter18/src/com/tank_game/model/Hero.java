package com.tank_game.model;

import java.util.Hashtable;
import java.util.Vector;

/**
 * @author zhouxufeng
 * @version 1.0
 * 坦克: 正义
 */
@SuppressWarnings({"all"})
public class Hero extends TankModel {
    //定义一个Bullet对象， 表示一个发射子弹(线程)
    private Vector<Bullet> bullets = new Vector<>();
    public Hero(int x, int y) {
        super(x, y);
    }

    public void fire() {
        //根据当前坦克位置获取字段坐标
        Hashtable<Character, Integer> bulletCoordinate = getBulletCoordinate();
        Bullet bullet = new Bullet(bulletCoordinate.get('x'), bulletCoordinate.get('y'), getDirect());
        bullets.add(bullet);

        new Thread(bullet).start();
    }

    public Vector<Bullet> getBullets() {
        return bullets;
    }

    public void removeBullet(Bullet bullet) {
        bullets.remove(bullet);
    }
}
