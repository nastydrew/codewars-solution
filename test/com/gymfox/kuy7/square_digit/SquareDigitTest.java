package com.gymfox.kuy7.square_digit;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareDigitTest {
    @Test
    public void test() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
        assertEquals(9414, new SquareDigit().squareDigits(3212));
        assertEquals(0, new SquareDigit().squareDigits(0));
    }
}