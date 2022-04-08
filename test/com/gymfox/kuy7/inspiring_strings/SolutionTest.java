package com.gymfox.kuy7.inspiring_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void tests() {
        assertEquals("fgh", Solution.longestWord("a b c d e fgh"));
        assertEquals("three", Solution.longestWord("one two three"));
        assertEquals("grey", Solution.longestWord("red blue grey"));
    }
}