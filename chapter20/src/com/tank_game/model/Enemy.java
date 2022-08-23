package com.tank_game.model;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

/**
 * @author zhouxufeng
 * @version 1.0
 * 坦克: 敌人
 */
@SuppressWarnings({"all"})
public class Enemy extends TankModel implements Runnable, Serializable {
    //serialVersionUID 序列化的版本号， 可以提高兼容性
    private static final long serialVersionUID = 238129324829381231L;
    private Vector<Bullet> bullets = new Vector<>();
    public Enemy(int x, int y, int direct) {
        super(x, y, direct);
    }

    public void fires(){
        //根据当前坦克位置获取字段坐标
        Hashtable<Character, Integer> bulletCoordinate = getBulletCoordinate();
        Bullet bullet = new Bullet(bulletCoordinate.get('x'), bulletCoordinate.get('y'), getDirect());
        bullets.add(bullet);
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
                if(getX() <= 0) {
                    setDirect((int)(Math.random() * 4));
                }
                break;
            case 1:
                moveRight();
                if(getY() >= (1024 - getTrackHeight())) {
                    setDirect((int)(Math.random() * 4));
                }
                break;
            case 2:
                moveDown();
                if(getX() >= (750 - getTrackHeight())) {
                    setDirect((int)(Math.random() * 4));
                }
                break;
            case 3:
                moveLeft();
                if(getY() <= 0) {
                    setDirect((int)(Math.random() * 4));
                }
                break;
        }
    }

    public Vector<Bullet> getBullets() {
        return bullets;
    }

    public void removeBullet(Bullet bullet) {
        bullets.remove(bullet);
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
