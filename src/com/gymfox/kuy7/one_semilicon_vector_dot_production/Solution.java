package com.gymfox.kuy7.one_semilicon_vector_dot_production;

import java.util.stream.IntStream;

public class Solution {
    public static int dot(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum();
    }
}
