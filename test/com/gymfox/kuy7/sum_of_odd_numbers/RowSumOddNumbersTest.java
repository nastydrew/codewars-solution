package com.gymfox.kuy7.sum_of_odd_numbers;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RowSumOddNumbersTest {
    @Test
    public void test1() {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }
}