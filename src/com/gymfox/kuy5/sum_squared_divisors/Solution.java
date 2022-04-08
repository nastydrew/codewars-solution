package com.gymfox.kuy5.sum_squared_divisors;

public class Solution {

    public static String listSquared(long m, long n) {
        long[] squaredPairs = new long[2];
        long count = 0;

        for ( long i = m; i <= n ; i++) {
            if ( n % i == 0 ) {
                count += (int)Math.pow(i,2);

                System.out.printf("%d = %d\n", i, (int) Math.pow(i,2));
            }
        }

        System.out.printf("Total sum = %d", count);

        return "";
    }

    public static void main(String[] args) {
        listSquared(1, 250);
    }
}
