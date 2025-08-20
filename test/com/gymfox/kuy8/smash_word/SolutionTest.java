package com.gymfox.kuy8.smash_word;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void validate() {
        assertEquals("hello", Solution.smash("hello"));
        assertEquals("hello world", Solution.smash("hello", "world"));
        assertEquals("hello world this is great", Solution.smash("hello", "world", "this", "is", "great"));
    }
}