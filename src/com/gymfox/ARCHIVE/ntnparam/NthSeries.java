package com.gymfox.ARCHIVE.ntnparam;

public class NthSeries {
    public static String seriesSum(int n) {
        double serSum = 0;

        for ( int i = 0; i < n; i++ ) {
            serSum = 1 + 1/n;
        }
        return String.format("%.2f", serSum);
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(4));

    }
}
