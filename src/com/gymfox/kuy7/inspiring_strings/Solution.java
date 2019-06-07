package com.gymfox.kuy7.inspiring_strings;

import java.util.Arrays;

public class Solution {
    public static String longestWord(String wordString) {

        return Arrays.stream(wordString.split(" ")).reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get();
    }
}
