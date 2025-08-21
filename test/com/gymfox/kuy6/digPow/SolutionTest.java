package com.gymfox.kuy6.digPow;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void Test1() {
        assertEquals(1, Solution.digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, Solution.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, Solution.digPow(46288, 3));
    }
}