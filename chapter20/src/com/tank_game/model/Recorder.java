package com.tank_game.model;

import java.io.*;

/**
 * @author zhouxufeng
 * @version 1.0
 * 该类用于记录相关信息和文件交互
 */
@SuppressWarnings({"all"})
public class Recorder {
    //定义变量， 记录我方击坠敌人坦克数
    public static int allEnemyTankNum = 0;
    //定义IO处理流
    public static BufferedWriter bw = null;
    public static BufferedReader br = null;
    //文件保存路径
    public static String recordFilePath = "/Users/zhouxufeng/program/ClassHspJava/chapter20/data/record.txt";

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    //更新之前记录的敌人坦克数
    public static int syschronizedEnemyTankNum() {
        try {
            br = new BufferedReader(new FileReader(recordFilePath));
            String line = "";
            while((line = br.readLine()) != null) {
                allEnemyTankNum = Integer.parseInt(line);
            }
            return allEnemyTankNum;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return 0;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    //增加击坠数量
    public static void addAllEnemyTankNum() {
        allEnemyTankNum++;
    }

    //关闭程序时记录击坠数
    public static void keepAllEnemyTankNum() throws IOException {
        bw = new BufferedWriter(new FileWriter(recordFilePath));
        bw.write(allEnemyTankNum + "");
        bw.newLine();
        bw.close();
    }
}
