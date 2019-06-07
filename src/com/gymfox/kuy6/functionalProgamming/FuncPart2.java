package com.gymfox.kuy6.aggregateoperation.functionalProgamming;

import java.util.function.ToDoubleFunction;

public class FuncPart2 {
    public static ToDoubleFunction<Triangle> f = t -> {
        t.setArea((t.base * t.height)*0.5D);
        return t.getArea();
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