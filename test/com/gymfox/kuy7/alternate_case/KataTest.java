package com.gymfox.kuy7.alternate_case;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void testSomething() {
        assertEquals("", Kata.alternateCase(""));
        assertEquals("ABC", Kata.alternateCase("abc"));
        assertEquals("abc", Kata.alternateCase("ABC"));
        assertEquals("hELLO wORLD!", Kata.alternateCase("Hello World!"));
    }
}