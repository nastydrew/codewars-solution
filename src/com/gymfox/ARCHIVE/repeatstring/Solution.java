package com.gymfox.education.codewars.repeatstring;

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        StringBuffer sb = new StringBuffer();

        for ( int i = 0; i < repeat; i++ ) {
            sb.append(string);
        }

        return sb.toString();
    }

}
