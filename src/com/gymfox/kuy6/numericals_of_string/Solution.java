package com.gymfox.kuy6.numericals_of_string;

public class Solution {
    public static String numericals(String s) {
        String result;
        long count = s.codePoints().count();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        System.out.println(count);

        return "";
    }
}
