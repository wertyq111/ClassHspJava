package com.tank_game.model;

import com.tank_game.threads.Bullet;

import java.util.HashMap;

/**
 * @author zhouxufeng
 * @version 1.0
 * 坦克: 正义
 */
@SuppressWarnings({"all"})
public class Hero extends TankModel {
    public Bullet bullet = null;
    public Hero(int x, int y) {
        super(x, y);
    }

    public void fire() {
        HashMap<Character, Integer> bulletCoordinate = getBulletCoordinate();
        this.bullet = new Bullet(bulletCoordinate.get('x'), bulletCoordinate.get('y'), getDirect());

        new Thread(this.bullet).start();

        while(true) {
            if(!this.bullet.isLive()) {
                setFire(false);
                break;
            }
        }
    }

    public Bullet getBullet() {
        return bullet;
    }
}
