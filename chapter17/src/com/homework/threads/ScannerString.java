package com.homework.threads;

import java.util.Scanner;

/**
 * @author zhouxufeng
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ScannerString implements Runnable{
    private Scanner scanner = new Scanner(System.in);
    private RandomNumber rn = null;

    public ScannerString(RandomNumber rn) {
        this.rn = rn;
    }

    @Override
    public void run() {
        while(true) {
            char c = scanner.next().toUpperCase().charAt(0);
            if(c == 'Q') {
                this.rn.setLoop(false);
                break;
            }
        }
    }
}
