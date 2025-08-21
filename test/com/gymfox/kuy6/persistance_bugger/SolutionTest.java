package com.gymfox.kuy6.persistance_bugger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void basicTests() {
        assertEquals(3, Solution.persistence( 39), "Incorrect answer for n=39" );
        assertEquals(0, Solution.persistence(  4), "Incorrect answer for n=4"  );
        assertEquals(2, Solution.persistence( 25), "Incorrect answer for n=25" );
        assertEquals(4, Solution.persistence(999), "Incorrect answer for n=999");
    }
}