package com.gymfox.ARCHIVE.alternatecase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlternateCase {
    static String alternateCase(final String string) {
        char[] charString = string.toCharArray();

        for ( int i = 0; i < charString.length; i++ ) {
            if ( Character.isLowerCase(charString[i]) ) {
                charString[i] = Character.toUpperCase(charString[i]);
            } else {
                charString[i] = Character.toLowerCase(charString[i]);
            }
        }
        return string.toLowerCase();
    }

    @Test
    public void testSomething() {
        assertEquals("", AlternateCase.alternateCase(""));
        assertEquals("ABC", AlternateCase.alternateCase("abc"));
        assertEquals("abc", AlternateCase.alternateCase("ABC"));
        assertEquals("hELLO wORLD!", AlternateCase.alternateCase("Hello World!"));
    }
}
