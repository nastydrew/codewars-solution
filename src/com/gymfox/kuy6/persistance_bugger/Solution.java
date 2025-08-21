package com.gymfox.kuy6.persistance_bugger;

public class Solution {
    public static int persistence(long n) {
        int result = 0;

        while (n >= 10) {
            long product = 1;
            long temp = n;

            while (temp > 0) {
                long digit = temp % 10;
                product *= digit;
                temp = temp / 10;
            }
            n = product;
            result += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
    }
}
