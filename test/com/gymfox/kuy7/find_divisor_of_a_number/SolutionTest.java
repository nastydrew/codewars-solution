package com.gymfox.kuy7.find_divisor_of_a_number;

import org.junit.Test;

import static com.gymfox.kuy7.find_divisor_of_a_number.FindDivisor.numberOfDivisors;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
         assertEquals(3, numberOfDivisors(4));
         assertEquals(2, numberOfDivisors(5));
         assertEquals(6, numberOfDivisors(12));
    }
}