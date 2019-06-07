package com.gymfox.education.codewars.unique;

import java.util.Arrays;

import static java.util.Arrays.stream;
//не решено
public class UniqueNumber {
    public static double[] findUniq(double arr[]) {
        Arrays.sort(arr);
        for ( double i : arr ) {
            System.out.println(arr);
        }
//        double[] result = stream(arr).distinct().toArray();

        return stream(arr).distinct().toArray();
    }

    public static void main(String[] args) {
        double[] arr = {0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
        System.out.println(findUniq(arr));
    }

}
