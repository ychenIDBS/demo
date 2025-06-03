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
}
