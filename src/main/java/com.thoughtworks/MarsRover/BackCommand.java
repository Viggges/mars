package com.thoughtworks.MarsRover;


public class BackCommand implements Command {

    @Override
    public void action(char c, MarsRover marsRover) {

        if (c == CommandConstant.BACK){
            marsRover.asternReverse();
        }
    }
}
