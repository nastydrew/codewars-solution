package com.gymfox.kuy8.findOddCubes;

public class Solution {
    public static int cubeOdd(int arr[]) {
        int result = 0;

        for ( int i : arr ) {
            if ( (arr[i]%2) != 0 ) {
                result += Math.pow(arr[i],3);
            }
        }

        return result;
    }
}
