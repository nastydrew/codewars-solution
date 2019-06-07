package com.gymfox.ARCHIVE.sellTickets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tickets {
    public static String Ticket(int[] peopleInLine) {
        int total = 0;

        for ( int i = 0; i < peopleInLine.length-1; i++ ) {
            total += peopleInLine[i];
        }
        if ( total == peopleInLine[peopleInLine.length-1] ) {
            return "YES";
        }

        return "NO";
    }

    @Test
    public void test1() {
        assertEquals("YES", Tickets.Ticket(new int[] {25, 25, 50}));
    }
    @Test
    public void test2() {
        assertEquals("NO", Tickets.Ticket(new int []{25, 100}));
    }
    @Test
    public void test3() {
        assertEquals("NO", Tickets.Ticket(new int []{25, 25, 25, 25, 50, 100, 50}));
    }
}
