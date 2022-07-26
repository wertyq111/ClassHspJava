package com.tank_game.model;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TankModel{
    private int x;
    private int y;
    private int trackWidth = 10;
    private int trackHeight = 60;
    private int cabinWidth = 40;
    private int cabinHeight = 50;
    private int coverSize = 40;
    private int gunWidth = 5;
    private int gunHeight = 40;

    public TankModel(int x, int y) {
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
}
