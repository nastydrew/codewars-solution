package com.gymfox.kuy6.digPow;

public class Solution {
    public static long digPow(int n, int p) {
        char[] eachNumber = String.valueOf(n).toCharArray();
        int result = 0;
        int power = p;
        for (char c : eachNumber) {
            int currentNumber = Character.getNumericValue(c);
            result += (int) Math.pow(currentNumber, power);
            power += 1;
        }
        if (result % n == 0) {
            return result / n;
        }
        return -1;
    }
}
