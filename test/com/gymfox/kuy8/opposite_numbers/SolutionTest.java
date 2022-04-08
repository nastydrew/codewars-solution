package com.gymfox.kuy8.opposite_numbers;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void tests() {
        assertEquals(-1, Solution.opposite(1));
        assertEquals(5, Solution.opposite(-5));
        assertEquals(0, Solution.opposite(0));
        assertEquals(-100, Solution.opposite(100));
    }
}