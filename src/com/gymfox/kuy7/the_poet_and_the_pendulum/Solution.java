package com.gymfox.kuy7.the_poet_and_the_pendulum;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Solution {
    public static int[] pendulum(final int[] values) {
        int[] sortedValues = values.clone();
        Arrays.sort(sortedValues);
        int seed = (sortedValues.length % 2 == 0) ? sortedValues.length - 2 : sortedValues.length - 1;
        IntUnaryOperator function = i -> (i == 0) ? 1 : (i % 2 == 0) ? (i - 2) : (i + 2);
        int[] position = IntStream.iterate(seed, function)
                .limit(sortedValues.length)
                .toArray();
        return IntStream.range(0, sortedValues.length)
                .map(i -> sortedValues[position[i]])
                .toArray();
    }
}
