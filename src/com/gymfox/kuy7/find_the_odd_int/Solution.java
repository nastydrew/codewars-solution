package com.gymfox.kuy7.find_the_odd_int;

import static java.util.Arrays.stream;

public class Solution {
    public static int findIt(int[] a) {
        /** Best practise:
         * return stream(a).reduce(0, (x, y) -> x ^ y);
         */
        return stream(a).reduce(0, (x, y) -> x ^ y);
    }
}