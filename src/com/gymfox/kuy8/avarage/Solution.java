package com.gymfox.kuy8.avarage;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class Solution {
    public static double find_average(int[] array){
        return IntStream.of(array).average().getAsDouble();
    }

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, Solution.find_average(new int[]{1,1,1}), DELTA);
        assertEquals(2, Solution.find_average(new int[]{1, 2, 3}), DELTA);
    }
}
