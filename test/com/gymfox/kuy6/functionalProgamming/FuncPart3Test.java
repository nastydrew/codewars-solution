package com.gymfox.kuy6.functionalProgamming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FuncPart3Test {
    @Test
    public void testMakeFunction() throws Exception {
        assertEquals("Created add 1 function; gave it 4; did not get 5 back", 5, com.gymfox.education.codewars.functionalProgamming.FuncPart3.create(1).applyAsInt(4));
    }
}