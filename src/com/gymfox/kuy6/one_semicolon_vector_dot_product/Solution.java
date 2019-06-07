package com.gymfox.kuy6.one_semicolon_vector_dot_product;

import java.util.stream.IntStream;

public class Solution {
    public static int dot(int[] a, int[] b) {
        // FIXME Too many semicolons!
        return IntStream.range(0, a.length).map(i ->  a[i] * b[i]).sum();
    }
}
