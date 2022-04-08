package com.gymfox.kuy7.functional_addition;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void simpleAdd() {
        assertEquals("Kata.add(3,5)", Kata.add(3).applyAsInt(5), 8);
    }
}