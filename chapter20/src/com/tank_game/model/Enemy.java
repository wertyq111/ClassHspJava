package com.tank_game.model;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Hashtable;
import java.util.Random;

/**
 * @author zhouxufeng
 * @version 1.0
 * 坦克: 敌人
 */
@SuppressWarnings({"all"})
public class Enemy extends TankModel implements Runnable {
    public Enemy(int x, int y, int direct) {
        super(x, y, direct);
    }

    public void fires(){
        //根据当前坦克位置获取字段坐标
        Hashtable<Character, Integer> bulletCoordinate = getBulletCoordinate();
        Bullet bullet = new Bullet(bulletCoordinate.get('x'), bulletCoordinate.get('y'), getDirect());
        addBullet(bullet);
        if(isLive() == false) {
            bullet.setLive(false);
        }

        new Thread(bullet).start();
    }

    public void randomChangeDirect() {
        Random random = new Random();
        int direct = random.nextInt(4);
        setDirect(direct);
    }

    /**
     * 坦克自动移动并碰到边界自动换向
     */
    public void autoMove() {
        switch(getDirect()) {
            case 0:
                moveUp();
                break;
            case 1:
                moveRight();
                break;
            case 2:
                moveDown();
                break;
            case 3:
                moveLeft();
                break;
        }
    }

    @Override
    public void setLive(boolean live) {
       super.setLive(live);
       if(live == false) {
           Recorder.addAllEnemyTankNum();
       }
    }

    @Override
    public void run() {
        Random random = new Random();
        int fireNum = random.nextInt(500);
        int moveNum = 0;
        while(true) {
            autoMove();

            fires();
            try {
                Thread.sleep(fireNum + 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(moveNum % 20 == 0) {
                randomChangeDirect();
            }
            moveNum++;
        }
    }
}
