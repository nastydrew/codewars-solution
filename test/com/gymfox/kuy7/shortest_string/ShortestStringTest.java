package com.gymfox.kuy7.shortest_string;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestStringTest {
    @Test
    public void findShort() {
        assertEquals(3, ShortestString.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestString.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestString.findShort("Let's travel abroad shall we"));
    }
}