package com.gymfox.kuy7.flatten_and_sort_an_array;

import java.util.Arrays;

public class Solution {
    public static int[] flattenAndSort(int[][] array) {

        return Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
    }
}
