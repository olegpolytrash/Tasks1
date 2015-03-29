package com.softserve.homework.tasks.imp;

import com.softserve.homework.tasks.Command;

/**
 * Created by Sander on 26.03.2015.
 */
public class NumberOperations implements Command {
    @Override
    public String getName() {
        return "NumberOperations";
    }

    private int countNumber(int num) {
     int  count = Integer.toString(num).length();
        return count;
    }

    private int sumOfNumbers(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + (num % 10);
            num /= 10;
        }
        return sum;
    }

    @Override
    public void execute() {
        System.out.println(sumOfNumbers(239));
        System.out.println(countNumber(6971));
    }
}
