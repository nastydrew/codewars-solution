package com.gymfox.ARCHIVE.noboring;

public class NoBoring {
    public static int noBoringZeros(int n) {
          while ( n % 10 == 0 ) {
              n /= 10;
          }

          return n;
    }
}