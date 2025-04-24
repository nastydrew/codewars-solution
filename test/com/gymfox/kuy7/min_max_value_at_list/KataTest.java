package com.gymfox.kuy7.min_max_value_at_list;

import com.gymfox.kuy7.min_max_value_at_list.Kata;
import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {

    private Kata kata = new Kata();

    @Test
    public void testExamples() {
        assertEquals(-110, kata.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, kata.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, kata.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, kata.max(new int[]{5}));
    }

}