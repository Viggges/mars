package com.thoughtworks.MarsRover;


public class RightCommand implements Command {



    @Override
    public void action(char c, MarsRover marsRover) {

        if (c == CommandConstant.RIGHT){
            this.right(marsRover);
        }
    }

    private void right(MarsRover marsRover) {

        Position position = marsRover.getPosition();

        int direction = position.getDirection().value();

        direction++;

        position.setDirection(Direction.valueOf(direction));
    }
}
