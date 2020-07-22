package com.thoughtworks.MarsRover;

import static com.thoughtworks.MarsRover.Direction.NORTH;


public class MarsRover {

    private boolean enable = false;

    private CommandChain commandChain = null;

    char[] directionChar = {'N', 'E', 'S', 'W'};

    private Position position = new Position(0, 0, NORTH);

    public MarsRover init(CommandChain commandChain) {
        position.setX(0);
        position.setY(0);
        position.setDirection(NORTH);

        this.commandChain = commandChain;
        return this;
    }

    public MarsRover init(int x, int y, Direction direction, CommandChain commandChain) {
        position.setX(x);
        position.setY(y);
        position.setDirection(direction);

        this.commandChain = commandChain;
        return this;
    }

    private char getDirectionToChar() {
        return directionChar[position.getDirection().value()];
    }


    public String execute(String cmd) {
        char[] cmds = cmd.toCharArray();

        for (char c : cmds) {
            commandChain.excute(c,this);
        }

        return this.displayPosition();
    }

    public Position getPosition() {
        return position;
    }

    public String displayPosition() {
        return "(" + position.getX() +"," + position.getY() + ")" + getDirectionToChar();
    }

    public void asternReverse(){
        enable = !enable;
    }

    public boolean isAstern(){
        return enable;
    }
}
