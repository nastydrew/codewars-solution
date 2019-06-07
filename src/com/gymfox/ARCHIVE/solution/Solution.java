package com.gymfox.ARCHIVE.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution {
    static int stray(int[] numbers) {
        int ret = 0;
        for ( int i : numbers) ret ^= i;

        return ret;
    }

    @Test
    public void simpleArray1() {
        assertEquals(2, getActualFor(1, 1, 2));
    }

    private int getActualFor(int... numbers) {
        return Solution.stray(numbers);
    }
}
