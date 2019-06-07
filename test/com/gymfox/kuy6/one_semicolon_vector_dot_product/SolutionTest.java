package com.gymfox.kuy6.one_semicolon_vector_dot_product;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test() {
        int[] a = new int[] {1, 2, 3};
        int[] b = new int[] {4, 5, 6};
        Assert.assertEquals(Solution.dot(a, b), 32);
    }

}