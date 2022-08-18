package com.tank_game.model;

import java.util.Hashtable;
import java.util.Vector;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TankModel{
    protected int x;
    protected int y;
    protected int trackWidth = 10; //履带宽度
    protected int trackHeight = 60; // 履带长度
    protected int cabinWidth = 40; // 舱体宽度
    protected int cabinHeight = 50; //舱体长度
    protected int coverSize = 40; //舱门半径
    protected int gunWidth = 5; //炮管宽度
    protected int gunHeight = 40; // 炮管长度
    protected int direct = 0;// 0:向上， 1:向右，2:向下, 3:向左
    protected int speed = 1;
    protected boolean live = true;
    protected Vector<TankModel> tanks = new Vector<>();


    public TankModel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public TankModel(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
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

    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }

    public int getTrackHeight() {
        return trackHeight;
    }

    public void setTrackHeight(int trackHeight) {
        this.trackHeight = trackHeight;
    }

    public int getCabinWidth() {
        return cabinWidth;
    }

    public void setCabinWidth(int cabinWidth) {
        this.cabinWidth = cabinWidth;
    }

    public int getCabinHeight() {
        return cabinHeight;
    }

    public void setCabinHeight(int cabinHeight) {
        this.cabinHeight = cabinHeight;
    }

    public int getCoverSize() {
        return coverSize;
    }

    public void setCoverSize(int coverSize) {
        this.coverSize = coverSize;
    }

    public int getGunWidth() {
        return gunWidth;
    }

    public void setGunWidth(int gunWidth) {
        this.gunWidth = gunWidth;
    }

    public int getGunHeight() {
        return gunHeight;
    }

    public void setGunHeight(int gunHeight) {
        this.gunHeight = gunHeight;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public void setTanks(Vector<TankModel> tanks) {
        this.tanks = tanks;
    }

    public boolean isTouch() {
        if(tanks.size() > 0) {
            Hashtable<String, Integer> mineArea = this.getTankArea();
            for(TankModel tank : tanks) {
                TankModel other = tank;
                Hashtable<String, Integer> otherArea = other.getTankArea();
                if (this.isLive() && other.isLive()) {
                    switch (this.getDirect()) {
                        case 0:
                            if (((mineArea.get("minX") > otherArea.get("minX")
                                    && mineArea.get("minX") < otherArea.get("maxX"))
                                    || (mineArea.get("maxX") > otherArea.get("minX")
                                    && mineArea.get("maxX") < otherArea.get("maxX")))
                                    && mineArea.get("minY") > otherArea.get("minY")
                                    && mineArea.get("minY") < otherArea.get("maxY")
                            ) {
                                //敌方坦克互相碰撞发生方向改变
                                this.setDirect((int) (Math.random() * 4));
                                if (other.getDirect() == 2) {
                                    this.setDirect((int) (Math.random() * 4));
                                }
                                return true;
                            }
                            break;
                        case 1:
                            if (((mineArea.get("minY") > otherArea.get("minY")
                                    && mineArea.get("minY") < otherArea.get("maxY"))
                                    || (mineArea.get("maxY") > otherArea.get("minY")
                                    && mineArea.get("maxY") < otherArea.get("maxY")))
                                    && mineArea.get("maxX") > otherArea.get("minX")
                                    && mineArea.get("maxX") < otherArea.get("maxX")
                            ) {
                                //敌方坦克互相碰撞发生方向改变
                                this.setDirect((int) (Math.random() * 4));
                                if (other.getDirect() == 3) {
                                    this.setDirect((int) (Math.random() * 4));
                                }
                                return true;
                            }
                            break;
                        case 2:
                            if (((mineArea.get("minX") > otherArea.get("minX")
                                    && mineArea.get("minX") < otherArea.get("maxX"))
                                    || (mineArea.get("maxX") > otherArea.get("minX")
                                    && mineArea.get("maxX") < otherArea.get("maxX")))
                                    && mineArea.get("maxY") > otherArea.get("minY")
                                    && mineArea.get("maxY") < otherArea.get("maxY")
                            ) {
                                //敌方坦克互相碰撞发生方向改变
                                this.setDirect((int) (Math.random() * 4));
                                if (other.getDirect() == 0) {
                                    this.setDirect((int) (Math.random() * 4));
                                }
                                return true;
                            }
                            break;
                        case 3:
                            if (((mineArea.get("minY") > otherArea.get("minY")
                                    && mineArea.get("minY") < otherArea.get("maxY"))
                                    || (mineArea.get("maxY") > otherArea.get("minY")
                                    && mineArea.get("maxY") < otherArea.get("maxY")))
                                    && mineArea.get("minX") > otherArea.get("minX")
                                    && mineArea.get("minX") < otherArea.get("maxX")
                            ) {
                                //同阵营坦克互相碰撞发生方向改变
                                this.setDirect((int) (Math.random() * 4));
                                if (other.getDirect() == 1) {
                                    this.setDirect((int) (Math.random() * 4));
                                }
                                return true;
                            }
                            break;
                    }
                }
            }
        }

        return false;
    }

    //向下左右移动
    public void moveUp() {
        direct = 0;
        if(y > 0 && !isTouch()) {
            y -= speed;
        }
    }

    public void moveDown() {
        direct = 2;
        if(y < (750 - trackHeight) && !isTouch()) {
            y += speed;
        }
    }

    public void moveLeft() {
        direct = 3;
        if(x > 0 && !isTouch()) {
            x -= speed;
        }
    }

    public void moveRight() {
        direct = 1;
        if(x < (1024 - trackHeight) && !isTouch()) {
            x += speed;
        }
    }

    /**
     * 获取子弹坐标
     * @return Hashtable
     */
    public Hashtable<Character, Integer> getBulletCoordinate() {
        Hashtable<Character, Integer> bulletCoordinate = new Hashtable<>();
        int bulletX = getX();
        int bulletY = getY();
        switch (getDirect()) {
            case 0:
                bulletX = getX() + getTrackWidth() + (getCabinWidth() / 2) - (getGunWidth() / 2);
                break;
            case 1:
                bulletX = getX() + getTrackHeight() + 5;
                bulletY = getY() + getTrackWidth() + (getCabinWidth() / 2) - (getGunWidth() / 2);
                break;
            case 2:
                bulletX = getX() + getTrackWidth() + (getCabinWidth() / 2) - (getGunWidth() / 2);
                bulletY = getY() + (getTrackHeight() / 12) + (getCabinHeight() / 2) + getGunHeight();
                break;
            case 3:
                bulletY = getY() + getTrackWidth() + (getCabinWidth() / 2) - (getGunWidth() / 2);
                break;
        }

        bulletCoordinate.put('x', bulletX);
        bulletCoordinate.put('y', bulletY);

        return bulletCoordinate;
    }

    /**
     * 获取坦克区域
     * @return Hashtable
     */
    public Hashtable<String, Integer> getTankArea() {
        Hashtable<String, Integer> tankArea = new Hashtable<>();
        int maxX = x;
        int maxY = y;
        switch (getDirect()) {
            case 0:
            case 2:
                maxX = x + (2 * trackWidth) + cabinWidth;
                maxY = y + trackHeight;
                break;
            case 1:
            case 3:
                maxX = x + trackHeight;
                maxY = y + (2 * trackWidth) + cabinWidth;
                break;
        }
        tankArea.put("minX", x);
        tankArea.put("maxX", maxX);
        tankArea.put("minY", y);
        tankArea.put("maxY", maxY);

        return tankArea;

    }
}
