package com.gymfox.kuy7.functional_programming.part_2;

import java.util.function.ToDoubleFunction;
/*
link: http://www.codewars.com/kata/java-functional-programming-part-2-multiline-functions
 */
public class FunctionalProgramming {
    public static ToDoubleFunction<Triangle> f = triangle -> {
        if (triangle.base > 0 && triangle.height > 0) {
            triangle.setArea(0.5 * triangle.base * triangle.height);
        }

        return triangle.getArea();
    };
}

class Triangle {
    public final int height;
    public final int base;
    private double area;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public void setArea(double a) {
        area = a;
    }
    public double getArea() {
        return area;
    }
}