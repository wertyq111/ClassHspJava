package com.tank_game.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TankModel{
    private int x;
    private int y;
    private int trackWidth = 10; //履带宽度
    private int trackHeight = 60; // 履带长度
    private int cabinWidth = 40; // 舱体宽度
    private int cabinHeight = 50; //舱体长度
    private int coverSize = 40; //舱门半径
    private int gunWidth = 5; //炮管宽度
    private int gunHeight = 40; // 炮管长度
    private int direct = 0;// 0:向上， 1:向右，2:向下, 3:向左
    private int speed = 1;
    private boolean live = true;

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

    //向下左右移动
    public void moveUp() {
        direct = 0;
        y -= speed;
    }

    public void moveDown() {
        direct = 2;
        y += speed;
    }

    public void moveLeft() {
        direct = 3;
        x -= speed;
    }

    public void moveRight() {
        direct = 1;
        x += speed;
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
