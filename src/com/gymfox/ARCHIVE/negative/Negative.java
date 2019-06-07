package com.gymfox.ARCHIVE.negative;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Negative {
    public static int makeNegative(final int x) {
        int result = x;
        return result < 0 ? result *= -1 : x;
    }

}

class MakeNegativeTest {
    @Test
    public void test1() {
        assertEquals(-42, Negative.makeNegative(42));
    }
}