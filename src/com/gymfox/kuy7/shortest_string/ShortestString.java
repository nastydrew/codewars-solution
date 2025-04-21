package com.gymfox.kuy7.shortest_string;

import java.util.Arrays;

public class ShortestString {
    public static int findShort(String s) {
        return Arrays.stream(s.split("\\s")).mapToInt(String::length).min().getAsInt();
    }
}
