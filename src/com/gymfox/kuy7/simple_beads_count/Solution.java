package com.gymfox.kuy7.simple_beads_count;

public class Solution {
    public static int countRedBeads(final int nBlue) {
        return nBlue < 2 ? 0 : nBlue * 2 - 2;
    }
}
