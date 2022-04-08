package com.gymfox.kuy7.factorial;

public class Solution_old {
    public int factorial(int n) throws IllegalArgumentException {
        if ( n < 0 || n > 12 ) {
            throw new IllegalArgumentException();
        }
        int result = 1;

        for ( int i = 0; i < n; i++ ) {
            result = n * factorial(n-1);
        }

        return result;
    }
}
