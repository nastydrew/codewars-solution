package com.gymfox.kuy6.find_the_odd_int;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] a) {
        if (a.length == 1) return a[0];
        int result = 0;

        List<Integer> innerArray = Arrays.stream(a).boxed().sorted().collect(Collectors.toList());

        for (Integer currentValue : innerArray) {
            int counter = 0;

            for (int innerCurrentArray : a) {

                if (currentValue == innerCurrentArray) {
                    counter += 1;
                }
            }

            if (counter % 2 != 0) {
                result = currentValue;

                break;
            }
        }

        return result;
    }
}
