package com.gymfox.kuy7.square_digit;

import java.util.stream.Collectors;

public class SquareDigit {
    public int squareDigits(int n) {
        if (n == 0) {
            return 0;
        }

        String result = "";

        while (n != 0) {
            int digit = n % 10;
            result = (digit * digit) + result;
            n /= 10;
        }

        return Integer.parseInt(result);
    }
}
