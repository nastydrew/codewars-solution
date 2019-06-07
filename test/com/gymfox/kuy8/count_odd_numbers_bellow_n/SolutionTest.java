package com.gymfox.kuy8.count_odd_numbers_bellow_n;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void fixedTests() {
        assertEquals(7, Solution.oddCount(15));
        assertEquals(7511, Solution.oddCount(15023));
    }
}