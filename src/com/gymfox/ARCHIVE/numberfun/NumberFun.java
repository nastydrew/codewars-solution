package com.gymfox.ARCHIVE.numberfun;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberFun {
    public static long findNextSquare(long sq) {
        double result = Math.sqrt(sq);

        if ( result % 1 != 0) {
            return -1;
        }
        return (long) Math.pow(result+1,2);
    }

    @Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }
}
