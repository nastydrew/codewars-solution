package com.gymfox.education.codewars.functionalProgamming;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class FuncPart3 {
    /*
     * Make the "create" method (public, static). It accepts one parameter (int addTo) and returns
     * a function (make sure to use the appropriate type). This function accepts an integer,
     * adds "addTo" to that integer, and returns the result as an integer (integer-to-integer function).
     */
    public static void main(String[] args) {
        int foo = 5;
        Function<String, Integer> f = s -> s.length() + foo;
        f.apply("somestring");
    }

    public static IntUnaryOperator create(int addTo) {
        return f -> f + addTo;
    }
}
