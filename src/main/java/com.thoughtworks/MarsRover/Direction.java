package com.thoughtworks.MarsRover;


public enum Direction {
    /**
     * 北
     */
    NORTH(0),
    /**
     * 东
     */
    EAST(1),
    /**
     * 南
     */
    SOUTH(2),
    /**
     * 西
     */
    WEST(3);

    private int direction;

    Direction(int direction){
        this.direction = direction;
    }

    public int value() {
        return direction;
    }

    public static Direction valueOf(int direction) {
        Direction ret = null;

        while (direction < 0) {
            direction += 4;
        }
        direction %= 4;

        switch (direction){
            case 0:
                ret = Direction.NORTH;
                break;
            case 1:
                ret = Direction.EAST;
                break;
            case 2:
                ret = Direction.SOUTH;
                break;
            case 3:
                ret = Direction.WEST;
                break;

            default:
                break;
        }

        return ret;
    }
}
