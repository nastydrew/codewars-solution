package com.gymfox.kuy7.min_max_value_at_list;

import java.util.stream.IntStream;

public class Kata {
    public int min(int[] list) {
        return IntStream.of(list).min().getAsInt();
    }

    public int max(int[] list) {
        return IntStream.of(list).max().getAsInt();
    }
}
