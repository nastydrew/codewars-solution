package com.gymfox.education.codewars.squaredigit;

public class SquareDigit {
    public static int squareDigits(int n) {
        String result = "";

        for ( int i = 0; n > 0; i++ ) {
            result = (int)Math.pow(n % 10, 2) + result;
            n /= 10;
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        int n = 9119;

        System.out.println(squareDigits(n));
    }
}