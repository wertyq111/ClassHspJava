package com.tank_game.model;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Explosion {
    private int x, y; //爆炸范围坐标
    private int lifeTime = 9; //爆炸生命周期
    private boolean isLive = true; //爆炸生命存在

    public Explosion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    /**
     * 爆炸过程
     */
    public void blowUp() {
        if(lifeTime > 0) {
            lifeTime--;
        } else {
            isLive = false;
        }
    }
}
