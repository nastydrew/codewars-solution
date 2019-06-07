package com.gymfox.ARCHIVE.vowels;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Vowels {
    public static final String validateVowels = "a e i o u";

    public static int getCount(String str) {
        ArrayList test;
        int vowelsCount = 0;

        for ( int i = 0; i < str.length(); i++ ) {
            if ( validateVowels.contains(str.substring(i, i+1))  ) {
                vowelsCount += 1;
            }
        }

        return vowelsCount;
    }

    @Test
    public void testCase1() {
        assertEquals(5, Vowels.getCount("abracadabra"));
    }

}
