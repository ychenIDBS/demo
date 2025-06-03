package org.demo;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RoverTest
{
    @Test
    public void leftIfDirectionEastTest () {
        Map<Integer, Integer> position = new HashMap<>();
        position.put(3, 4);

        Rover rover = new Rover(Direction.EAST, position);
        rover.left();
        assertEquals(Direction.NORTH, rover.getDirection());
        assertEquals(position, rover.getPosition());
    }

    @Test
    public void leftIfDirectionNorthTest () {
        Map<Integer, Integer> position = new HashMap<>();
        position.put(3, 4);

        Rover rover = new Rover(Direction.NORTH, position);
        rover.left();
        assertEquals(Direction.WEST, rover.getDirection());
        assertEquals(position, rover.getPosition());
    }

    @Test
    public void leftIfDirectionWestTest () {
        Map<Integer, Integer> position = new HashMap<>();
        position.put(3, 4);

        Rover rover = new Rover(Direction.WEST, position);
        rover.left();
        assertEquals(Direction.SOUTH, rover.getDirection());
        assertEquals(position, rover.getPosition());
    }

    @Test
    public void leftIfDirectionSouthTest () {
        Map<Integer, Integer> position = new HashMap<>();
        position.put(3, 4);

        Rover rover = new Rover(Direction.SOUTH, position);
        rover.left();
        assertEquals(Direction.EAST, rover.getDirection());
        assertEquals(position, rover.getPosition());
    }

    @Test
    public void rightIfDirectionEastTest () {
        Map<Integer, Integer> position = new HashMap<>();
        position.put(3, 4);

        Rover rover = new Rover(Direction.EAST, position);
        rover.right();
        assertEquals(Direction.SOUTH, rover.getDirection());
        assertEquals(position, rover.getPosition());
    }

    @Test
    public void rightIfDirectionSouthTest () {
        Map<Integer, Integer> position = new HashMap<>();
        position.put(3, 4);

        Rover rover = new Rover(Direction.SOUTH, position);
        rover.right();
        assertEquals(Direction.WEST, rover.getDirection());
        assertEquals(position, rover.getPosition());
    }

    @Test
    public void rightIfDirectionWestTest () {
        Map<Integer, Integer> position = new HashMap<>();
        position.put(3, 4);

        Rover rover = new Rover(Direction.WEST, position);
        rover.right();
        assertEquals(Direction.NORTH, rover.getDirection());
        assertEquals(position, rover.getPosition());
    }

    @Test
    public void rightIfDirectionNorthTest () {
        Map<Integer, Integer> position = new HashMap<>();
        position.put(3, 4);

        Rover rover = new Rover(Direction.NORTH, position);
        rover.right();
        assertEquals(Direction.EAST, rover.getDirection());
        assertEquals(position, rover.getPosition());
    }
}
