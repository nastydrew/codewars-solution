package com.gymfox.kuy7.two_to_one;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        return Stream
                .of(s1.concat(s2).split(""))
                .distinct().sorted()
                .collect(Collectors.joining());
    }
}
