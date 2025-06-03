package org.demo;

import java.util.Map;

public class Rover
{
    private Map<Integer, Integer> position;
    private Direction direction;

    public Rover(Direction direction, Map<Integer, Integer> postion)
    {
        this.direction = direction;
        this.position = postion;
    }

    public Direction getDirection()
    {
        return direction;
    }

    public void left()
    {
        switch(direction)
        {
            case EAST:
                direction = Direction.NORTH;
                break;
            case WEST:
                direction = Direction.SOUTH;
            case NORTH:
                direction = Direction.WEST;
            case SOUTH:
                direction = Direction.EAST;

            default:
        }
    }

    public Map<Integer, Integer> getPosition()
    {
        return position;
    }
}