package com.gymfox.ARCHIVE.areSame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;
        if (a.length != b.length) return false;

        int[] sortA = Arrays.stream(a).map(x -> x*x).sorted().toArray();
        int[] sortB = Arrays.stream(b).sorted().toArray();

        return Arrays.equals(sortA, sortB);
    }
}

class AreSameTest {
    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(AreSame.comp(a, b), true);
    }

    @Test
    public void test2() {
        int[] a = new int[]{122, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(AreSame.comp(a, b), false);
    }

    @Test
    public void testNull() {
        assertEquals(AreSame.comp(null, null), false);
    }

    @Test
    public void testEmpty() {
        int[] a = new int[]{};
        int[] b = new int[]{};
        assertEquals(AreSame.comp(a, b), true);
    }
    @Test
    public void testBLonger() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361, 2073600};
        assertEquals(AreSame.comp(a, b), false);
    }

    @Test
    public void testALonger() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11, 14400};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(AreSame.comp(a, b), false);
    }

    @Test
    public void testNegativeNumbers() {
        int[] a = new int[]{121, -144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(AreSame.comp(a, b), true);
    }
}