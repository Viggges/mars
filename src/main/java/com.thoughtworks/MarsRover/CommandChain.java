package com.thoughtworks.MarsRover;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class CommandChain {

    private List<Command> commands = new ArrayList<>();

    public void excute(char c, MarsRover marsRover){
        commands.stream().forEach(command -> command.action(c, marsRover));
    }

    public void addCommand(Command command){
        commands.add(command);
    }

}
