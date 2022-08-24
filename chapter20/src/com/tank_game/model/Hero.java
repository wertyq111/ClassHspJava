package com.tank_game.model;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;

/**
 * @author zhouxufeng
 * @version 1.0
 * 坦克: 正义
 */
@SuppressWarnings({"all"})
public class Hero extends TankModel {
    private String role;
    //定义一个Bullet对象， 表示一个发射子弹(线程)
    public Hero(int x, int y, String role) {
        super(x, y);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void fire() {
        //根据当前坦克位置获取字段坐标
        Hashtable<Character, Integer> bulletCoordinate = getBulletCoordinate();
        Bullet bullet = new Bullet(bulletCoordinate.get('x'), bulletCoordinate.get('y'), getDirect());
        addBullet(bullet);

        new Thread(bullet).start();
    }
}
