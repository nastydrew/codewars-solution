package com.gymfox.ARCHIVE.sequencesum;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
public class SequenceSum {
    public static int[] sumOfN(int n) {
//        int check = n;
//        int number = 0;
//
//        if ( n < 0 ) {
//            check = -n;
//        }
//
//        int[] arr = new int[check+1];
//
//        for ( int i = 0; i <= check; i++ ) {
//            number += i;
//            arr[i] += number;
//            System.out.print(arr[i]+" ");
//        }
//
//        if ( n < 0 ) {
//            for ( int i = 0; i <= check; i++ ) {
//                arr[i] *= -1;
//                System.out.print(arr[i]+" ");
//            }
//        }
//
//        return arr;
        int[] result = new int[Math.abs(n)+1];
        for(int i = 1; i < result.length; i++)
            result[i] = result[i-1] + (n > 0 ? i : -i);
        return result;
    }

    @Test
    public void testKnownValues() {
        assertArrayEquals(new int[]{0, 1, 3, 6}, SequenceSum.sumOfN(3));
        assertArrayEquals(new int[]{0, -1, -3, -6, -10}, SequenceSum.sumOfN(-4));
        assertArrayEquals(new int[]{0, 1}, SequenceSum.sumOfN(1));
        assertArrayEquals(new int[]{0}, SequenceSum.sumOfN(0));
    }
}
