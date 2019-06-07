package com.gymfox.ARCHIVE.pattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Pattern {
    public static String pattern(int n) {
        if ( n <= 0 ) {
            return "";
        }

        if ( n == 1 ) {
            return "1";
        }

        StringBuilder string = new StringBuilder();

        for ( int i = 0; i <= n; i++ ) {
            int j = i + 1;

            for ( ; j < n; j++ ) {
                string.append(j);
            }
            string.append(n);
        string.append("\n");
        }

        return string.toString();
    }


    @Test
    public void pattern() throws Exception {
        assertEquals( Pattern.pattern( 1 ), "1" );
//        assertEquals( Pattern.pattern( 2 ), "12\n2" );
        assertEquals( Pattern.pattern( 5 ), "12345\n2345\n345\n45\n5" );
//        assertEquals( Pattern.pattern( 0 ), "" );
//        assertEquals( Pattern.pattern( -25 ), "" );
//        assertEquals( Pattern.pattern( -59 ), "" );
    }
}
