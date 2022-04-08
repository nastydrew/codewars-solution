package com.gymfox.kuy7.functional_programming.part_3;

import java.util.function.IntUnaryOperator;

/*
link: http://www.codewars.com/kata/java-functional-programming-part-3-closured-for-business
 */

public class AdderFactory {

    public static IntUnaryOperator create(int addTo) {
        return value -> addTo + value;
    }
}
