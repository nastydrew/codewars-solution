package com.gymfox.kuy8.convert_a_number_to_a_string;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberStringTest {
    @Test
    public void tests() {
        assertEquals("67", NumberString.numberToString(67));
        assertEquals("123", NumberString.numberToString(123));
        assertEquals("999", NumberString.numberToString(999));
        assertEquals("0", NumberString.numberToString(0));
    }
}