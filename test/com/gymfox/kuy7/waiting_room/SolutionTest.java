package com.gymfox.kuy7.waiting_room;

import org.junit.Test;

import static com.gymfox.kuy7.waiting_room.Solution.lastChair;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testLastChair() {
        assertEquals(9, lastChair(10));
    }
}