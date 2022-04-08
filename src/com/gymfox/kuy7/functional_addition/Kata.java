package com.gymfox.kuy7.functional_addition;

import java.util.function.IntUnaryOperator;

public class Kata {
    public static IntUnaryOperator add(int n) {
        return operand -> n + operand;
    }
}
