package com.gymfox.kuy7.max_min_arrays;

import java.util.Arrays;

public class Solution {
    public static int[] solve(int[] arr) {
        int[] result = new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            result[i] = (i % 2 == 0) ? arr[arr.length - 1 - i / 2] : arr[i / 2];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(3/2);
    }
}
