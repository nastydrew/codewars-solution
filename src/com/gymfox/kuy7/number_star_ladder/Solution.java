package com.gymfox.kuy7.number_star_ladder;

public class Solution {
    public static String pattern(int n){
        StringBuffer result = new StringBuffer("1");

        if (n - 1 == 0) {
            return result.toString();
        }

        for (int i = 1; i < n; ) {
            result.append("\n")
                    .append("1")
                    .append("*".repeat(Math.max(0, i)))
                    .append(++i);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(pattern(10));
    }
}
