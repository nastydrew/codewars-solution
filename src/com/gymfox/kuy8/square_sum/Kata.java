package com.gymfox.kuy8.square_sum;

public class Kata {
    public static int squareSum(int[] n) {
        int out = 0;
        for (int i : n) {
            out += i * i;
        }

        return out;
    }
}