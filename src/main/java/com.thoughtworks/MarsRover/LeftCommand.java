package com.thoughtworks.MarsRover;


public class LeftCommand implements Command {



    @Override
    public void action(char c, MarsRover marsRover) {

        if (c == CommandConstant.LEFT){
            this.left(marsRover);
        }
    }

    private void left(MarsRover marsRover) {

        Position position = marsRover.getPosition();

        int direction = position.getDirection().value();

        direction--;

        position.setDirection(Direction.valueOf(direction));
    }
}
