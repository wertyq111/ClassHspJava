package com.tank_game.model;

import java.io.*;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

/**
 * @author zhouxufeng
 * @version 1.0
 * 该类用于记录相关信息和文件交互
 */
@SuppressWarnings({"all"})
public class Recorder {
    //定义变量， 记录我方击坠敌人坦克数, 敌方坦克信息, 我方坦克信息
    public static int allEnemyTankNum = 0;
    public static Vector<Enemy> enemies = new Vector<>();
    //定义IO处理流
    public static BufferedWriter bw = null;
    public static BufferedReader br = null;
    //文件保存路径
    //public static String recordFilePath = "/Users/zhouxufeng/program/ClassHspJava/chapter20/data/record.txt";
    //使用对象集序列化数据
    public static String recordFilePath = "/Users/zhouxufeng/program/ClassHspJava/chapter20/data/record.dat";

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    public static Vector<Enemy> getEnemies() {
        return enemies;
    }

    public static void setEnemies(Vector<Enemy> enemies) {
        Recorder.enemies = enemies;
    }

    //更新之前记录的敌人坦克数
    public static int syschronizedEnemyTankNum() {
        File recordFile = new File(recordFilePath);
        if(recordFile.exists()) {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(recordFile));
                int enemyTankNum = ois.readInt();
                //Vector lastEnemies = (Vector) ois.readObject();
                allEnemyTankNum = enemyTankNum;
                return allEnemyTankNum;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return 0;
    }

    //增加击坠数量
    public static void addAllEnemyTankNum() {
        allEnemyTankNum++;
    }

    //关闭程序时记录击坠数
    public static void keepAllEnemyTankNum() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(recordFilePath));
        oos.writeInt(allEnemyTankNum);
        //oos.writeObject(heros);
        //oos.writeObject(enemies);
        oos.close();
    }
}
