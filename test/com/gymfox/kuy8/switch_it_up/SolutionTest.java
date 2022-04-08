package com.gymfox.kuy8.switch_it_up;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals("One", Solution.switchItUp(1));
        assertEquals("Three", Solution.switchItUp(3));
        assertEquals("Five", Solution.switchItUp(5));
    }
}