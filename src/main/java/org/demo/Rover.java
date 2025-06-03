package org.demo;

import java.util.Map;

public class Rover
{
    private Direction direction;

    public Rover(Direction direction, Map<Integer, Integer> postion)
    {
        this.direction = direction;
    }

    public Direction getDirection()
    {
        return direction;
    }

    public void left()
    {
        direction = Direction.NORTH;
    }
}