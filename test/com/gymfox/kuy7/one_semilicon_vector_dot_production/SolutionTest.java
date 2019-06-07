package com.gymfox.kuy7.one_semilicon_vector_dot_production;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        int[] a = new int[] {1, 2, 3};
        int[] b = new int[] {4, 5, 6};
        assertEquals(Solution.dot(a, b), 32);
    }
}