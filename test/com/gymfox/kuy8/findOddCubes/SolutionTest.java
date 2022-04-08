package com.gymfox.kuy8.findOddCubes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSomething() {
        assertEquals(0, Solution.cubeOdd(new int[] {-5, -5, 5, 5}));
        assertEquals(28, Solution.cubeOdd(new int[] {1, 2, 3, 4}));
        assertEquals(0, Solution.cubeOdd(new int[] {-3, -2, 2, 3}));
    }
}