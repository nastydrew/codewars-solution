package com.gymfox.education.codewars.reverse;

public class Reverse {
    public static String solution(String str) {
        char[] reverseString = str.toCharArray();

        for ( int i = 0, j = str.length() - 1; i < j; i++, j-- ) {
            int temp = reverseString[i];

            reverseString[i] = reverseString[j];
            reverseString[j] = (char) temp;
        }

        return String.valueOf(reverseString);
    }

    public static void main(String[] args) {
        System.out.println(solution("world"));
    }
}
