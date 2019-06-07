package com.gymfox.kuy8.convert_booleans_values_to_string_yes_or_no;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testBoolToWord() {
        assertEquals(Solution.boolToWord(true),"Yes");
        assertEquals(Solution.boolToWord(false),"No");
    }
}