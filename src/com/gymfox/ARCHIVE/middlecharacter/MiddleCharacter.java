package com.gymfox.ARCHIVE.middlecharacter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleCharacter {
    public static String getMiddle(String word) {
        char[] character = word.toCharArray();

        if ( word.length()%2 == 0 ) {
            return String.valueOf(character[word.length()/2-1]+ "" + character[word.length()/2]);
        }
        return String.valueOf(character[word.length()/2]);
    }

    @Test
    public void evenTests() {
        assertEquals("es", MiddleCharacter.getMiddle("test"));
        assertEquals("dd", MiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", MiddleCharacter.getMiddle("testing"));
        assertEquals("A", MiddleCharacter.getMiddle("A"));
    }
}
