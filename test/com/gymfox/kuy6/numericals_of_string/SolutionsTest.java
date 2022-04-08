package com.gymfox.kuy6.numericals_of_string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionsTest {
    @Test
    public void basicTest1() {
        assertEquals("1112111121311", Solution.numericals("Hello, World!"));
    }
    @Test
    public void basicTest2() {
        assertEquals("11121111213112111131224132411122", Solution.numericals("Hello, World! It's me, Solution!"));
    }
    @Test
    public void basicTest3() {
        assertEquals("11121122342", Solution.numericals("hello hello"));
    }
}