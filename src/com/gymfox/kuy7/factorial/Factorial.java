package com.gymfox.kuy7.factorial;

public class Factorial {

    public int factorial(int n) {
        validateValue(n);
        if (n == 0) {
            return 1;
        }
        int result = n;
        for (int i = n - 1; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    private void validateValue(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().factorial(10));
    }
}
