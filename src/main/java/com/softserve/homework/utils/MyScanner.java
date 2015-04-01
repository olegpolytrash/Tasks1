package com.softserve.homework.utils;

import java.util.Scanner;

/**
 * Class which realize pattern Singleton.
 * @author Oles Onyshchak
 * @version 0.1 28/03/2015
 */
public class MyScanner {
    private int value;
    private Scanner scanner = new Scanner(System.in);
    private static MyScanner instance;

    public static MyScanner getInstance() {
        if (instance == null) {
            instance = new MyScanner();
        }
        return instance;
    }

    private MyScanner() {
        setValue();
    }

    private void setValue() {
        try {
            System.out.println("Please enter an integer");
            this.value = scanner.nextInt();
        } catch (RuntimeException e) {
            System.err.println("must be an integer");
            e.printStackTrace();
        }
    }

    public int getValue() {
        return value;
    }
}
