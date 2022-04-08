package com.gymfox.kuy7.form_the_minimum;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Minimum {
    public static int minValue(int[] values){

        return Integer.parseInt(Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining("")));
    }

    public static void main(String[] args) {
        System.out.println(minValue(new int[]{9,7,7,5,5}));
    }
}
