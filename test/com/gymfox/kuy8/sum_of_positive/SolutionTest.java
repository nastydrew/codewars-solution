package com.gymfox.kuy8.sum_of_positive;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(15, Solution.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Solution.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Solution.sum(new int[]{}));
        assertEquals(0, Solution.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Solution.sum(new int[]{-1,2,3,4,-5}));
    }
}