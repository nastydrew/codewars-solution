package com.gymfox.kuy7.functional_programming.part_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class FunctionalProgrammingTest {
    @Test
    public void testArea() throws Exception {
        Triangle t = new Triangle(5, 10);
        assertEquals("Incorrect area returned", 25D, FunctionalProgramming.f.applyAsDouble(t), 0.001);
        assertEquals("Incorrect area in Triangle object", 25D, t.getArea(), 0.001);
    }
}