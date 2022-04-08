package com.gymfox.kuy7.simple_beads_count;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static com.gymfox.kuy7.simple_beads_count.Solution.countRedBeads;

public class SolutionTest {
    @Test
    public void test0() {
        assertEquals(0, countRedBeads(0));
    }
    @Test
    public void test1() {
        assertEquals(0, countRedBeads(1));
    }
    @Test
    public void test3() {
        assertEquals(4, countRedBeads(3));
    }
    @Test
    public void test5() {
        assertEquals(8, countRedBeads(5));
    }
}