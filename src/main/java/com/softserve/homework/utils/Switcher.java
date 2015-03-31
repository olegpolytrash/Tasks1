package com.softserve.homework.utils;

import com.softserve.homework.tasks.Command;

/**
 * Class which invoke necessary execute method.
 * @author Oles Onyshchak
 * @version 0.1 28/03/2015
 */
public class Switcher {
    public void executeCommand(final Command command) {
        command.execute();
    }
}
