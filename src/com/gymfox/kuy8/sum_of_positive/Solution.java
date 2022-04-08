package com.gymfox.kuy8.sum_of_positive;

import java.util.stream.IntStream;

public class Solution {
    public static int sum(int[] arr){
        return IntStream.of(arr).filter(x -> x > 0).sum();
    }
}
