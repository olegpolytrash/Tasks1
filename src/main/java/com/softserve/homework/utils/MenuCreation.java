package com.softserve.homework.utils;

import com.softserve.homework.tasks.Command;
import com.softserve.homework.tasks.imp.*;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Class which create program menu
 * @author team
 * @version 0.1 28/03/2015
 */
public class MenuCreation {
        private Map<Integer, Command> menu = new TreeMap<Integer, Command>();

        private void addTask(Command task) {
            menu.put(menu.size() + 1, task);
        }
        // Add your task here
        private void createMenu() {
            addTask(new ExchangeValue());
            addTask(new FindValuesXYZT());
            addTask(new IncrementValue());
            addTask(new NumberOperations());
            addTask(new PerfectNumber());
            addTask(new GoodEnoughValue());
            addTask(new DmytroTask88());
            addTask(new DmytroTask322());
            addTask(new PresentAsPows());
            addTask(new ClosestBiggerPowOf2());
            addTask(new MersennePrimeGenerator());
            addTask(new GreatestCommonDivisor());
            addTask(new SumOfLastDigits());
        }

        private void printEntryMessages() {
            System.out.println("Please enter which type of program you would like to invoke");
            String message = "Press : \n";
            for (Map.Entry<Integer, Command> pair : menu.entrySet()) {
                message += pair.getKey() + " - " + pair.getValue().getName() + " \n";
            }
            message = message.substring(0, message.length() - 2);
            System.out.println(message);
        }

        public void runApplication() {
            createMenu();
            Scanner scanner = new Scanner(System.in);
            Switcher switcher = new Switcher();
            printEntryMessages();

            boolean ok = true;
            while (ok) {
                int programType = scanner.nextInt();
                if (programType > 0 && programType < (menu.size() + 1)) {
                    switcher.executeCommand(menu.get(programType));
                    ok = false;
                } else {
                    System.out.println("Please enter 1-" + menu.size());
                }
            }
        }
    }

