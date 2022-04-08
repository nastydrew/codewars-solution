package com.gymfox.kuy7.unlucky_days;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(3, Solution.unluckyDays(2015));
        assertEquals(1, Solution.unluckyDays(1986));
    }
}