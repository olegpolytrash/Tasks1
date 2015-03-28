package com.softserve.homework.utils;

import java.util.Scanner;

/**
 * Created by Oles on 3/26/2015.
 */
public class MyScanner {
    private int value;
    Scanner scanner = new Scanner(System.in);
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
        } catch (Exception e) {
            System.err.println("must be integer");
        }
    }

    public int getValue() {
        return value;
    }
}
