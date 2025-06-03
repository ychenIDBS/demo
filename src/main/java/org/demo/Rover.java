package org.demo;

import java.util.Map;

public class Rover
{
    private Map<Integer, Integer> position;
    private Direction direction;

    public Rover(Direction direction, Map<Integer, Integer> position)
    {
        this.direction = direction;
        this.position = position;
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
                break;
            case NORTH:
                direction = Direction.WEST;
                break;
            case SOUTH:
                direction = Direction.EAST;
                break;
            default:
                break;
        }
    }

    public Map<Integer, Integer> getPosition()
    {
        return position;
    }
}