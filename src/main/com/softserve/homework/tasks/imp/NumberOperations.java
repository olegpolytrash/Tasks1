package com.softserve.homeAssignment.tasks.imp;

import com.softserve.homeAssignment.tasks.Command;

/**
 * Created by Sander on 26.03.2015.
 */
public class NumberOperations implements Command {
    @Override
    public String getName() {
        return "NumberOperations";
    }

    protected static int countNumber(int num) {
     int  count = Integer.toString(num).length();
        return count;
    }

    protected static int sumOfNumbers(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + (num % 10);
            num /= 10;
        }
        return sum;
    }

    @Override
    public void execute() {
        System.out.println(NumberOperations.sumOfNumbers(239));
        System.out.println(NumberOperations.countNumber(6971));
    }
}
