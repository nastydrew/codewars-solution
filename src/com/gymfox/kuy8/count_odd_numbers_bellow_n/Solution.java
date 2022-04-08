package com.gymfox.kuy8.count_odd_numbers_bellow_n;

import java.util.stream.IntStream;

public class Solution {
    public static int oddCount(int n){
        return (int) IntStream.range(1, n).filter(x -> x % 2 != 0).count();
    }
}
