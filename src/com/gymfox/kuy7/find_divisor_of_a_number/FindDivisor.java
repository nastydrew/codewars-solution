package com.gymfox.kuy7.find_divisor_of_a_number;

import java.util.stream.LongStream;

public class FindDivisor {
    public static long numberOfDivisors(int n) {
//        long count = 0;
//
//        for (int i = 1; i <= n; i++) {
//            if ( n % i == 0 ) {
//                count += 1;
//            }
//        }
//
//        return count;
        return LongStream.range(1, n+1).filter(x -> n % x == 0).count();
    }

    public static void main(String[] args) {
        System.out.println(numberOfDivisors(4));
    }
}
