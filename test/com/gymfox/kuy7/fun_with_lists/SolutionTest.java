package com.gymfox.kuy7.fun_with_lists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void basicTests() {
        assertEquals(0, Solution.length(null));
//        assertEquals(4, Solution.length(Helpers.listFromArray(1, 2, 3, 4)));
    }
//
//    @Test
//    public void basicTests2() {
//        Helpers.testFilter(null, __ -> false, null);
//        Helpers.testFilter(new Node<>(1, new Node<>(2, new Node<>(3))), x -> true, new Node<>(1, new Node<>(2, new Node<>(3))));
//    }
//
//    @Test
//    public void arrayOfInts() {
//        Helpers.testFilter(new Node<>(1, new Node<>(2, new Node<>(3))), x -> x <= 2, new Node<>(1, new Node<>(2)));
//        Helpers.testFilter(new Node<>(1, new Node<>(2, new Node<>(3))), x -> x == 1, new Node<>(1));
//    }
}
