package com;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author zhouxufeng
 * @version 1.0
 * 骑士周游问题
 */
@SuppressWarnings({"all"})
public class HorseChessBoard {
    private static int X = 8;//表示 行 col
    private static int Y = 8;//表示 列 row
    private static int[][] chessBoard = new int[Y][X]; //棋盘 int[0][1] 第一格 int[1][1]第二行第一格 X 是横坐标, Y 是纵坐标
    private static boolean[] visited = new boolean[X * Y]; //记录某个位置是否走过
    private static boolean finished = false; //记录马儿是否遍历完棋盘

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        long start = System.currentTimeMillis();
        traversalChessBoard(chessBoard,row - 1, col - 1,1);

        long end = System.currentTimeMillis();
        System.out.println("遍历耗时: " + (end - start) + "ms");
        for (int[] rows : chessBoard) {
            for (int step : rows) { //step表示该位置是马儿应该走的第几步
                System.out.print(step + "\t");
            }
            System.out.println();
        }
    }

    //写一个方法,对 ps 的各个位置可以走的下一个位置的次数进行排序,把可能走的下一个位置从小到大排序
    public static void sort(ArrayList<Point> ps) {
        ps.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return next(o1).size() - next(o2).size();
            }
        });
    }

    //编写最核心的算法,遍历棋盘,如果遍历成功就把 finished 设置为 true
    //并且将马儿走的每一步记录到 chessBoard
    public static void traversalChessBoard(int[][] chessBoard, int row, int col, int step) {
        //先把 step 记录到 chessBoard
        chessBoard[row][col] = step;
        //把这个位置,设置为已经访问
        visited[row * X + col] = true;
        //获取当前这个位置可以走的下一个位置集合
        ArrayList<Point> ps = next(new Point(col, row)); //col - X, row - Y
        sort(ps); //排序 贪心算法优化
        //遍历
        while (!ps.isEmpty()) {
            //取出当前这个 ps 的第一个位置(点)
            Point p = ps.remove(0);
            //判断该位置是否走过,如果没有走过就进行递归遍历
            if (!visited[p.y * X + p.x]) {
                //递归遍历
                traversalChessBoard(chessBoard, p.y, p.x, step + 1);
            }
        }

        //当退出 while,看看是否遍历成功,如果没有成功,就重置相应的值,然后进行回溯
        if(step < X * Y && !finished) {
            //重置初始格子
            chessBoard[row][col] = 0;
            visited[row * X + col] = false;
        } else {
            finished = true;
        }
    }

    //编写方法,可以获取当前位置,可以走的下一步的所有位置(Point 表示 x,y)
    public static ArrayList<Point> next(Point curPoint) {
        //创建一个 ArrayList
        ArrayList<Point> ps = new ArrayList<>();

        //判断一个 Point 对象(点/位置),准备放入 ps
        Point p1 = new Point();

        //判断在 curPoint 是否可以走入下位置,如果可以走,就讲该店(Point)放入到 ps

        //判断是否可以走左上 1 的位置
        if ((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y - 1) >= 0) {
            ps.add(new Point(p1));
        }
        //判断是否可以走左上 2 的位置
        if ((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y - 2) >= 0) {
            ps.add(new Point(p1));
        }
        //判断是否可以走右上 1 的位置
        if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y - 2) >= 0) {
            ps.add(new Point(p1));
        }
        //判断是否可以走右上 2 的位置
        if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y - 1) >= 0) {
            ps.add(new Point(p1));
        }
        //判断是否可以走右下 1 的位置
        if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y + 1) < Y) {
            ps.add(new Point(p1));
        }
        //判断是否可以走右下 2 的位置
        if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y + 2) < Y) {
            ps.add(new Point(p1));
        }
        //判断是否可以走左下 1 的位置
        if ((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y + 2) < Y) {
            ps.add(new Point(p1));
        }
        //判断是否可以走左下 2 的位置
        if ((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y + 1) < Y) {
            ps.add(new Point(p1));
        }

        return ps;
    }
}
