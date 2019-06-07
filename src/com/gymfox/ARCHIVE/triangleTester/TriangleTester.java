package com.gymfox.education.codewars.triangleTester;

import static junit.framework.TestCase.assertEquals;

public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c){
        if ( a == 0 || b == 0 || c == 0 ) {
            return false;
        }
        if ( a + b > c && a + c > b && b + c > a ) {
            return true;
        }

        return false;
    }
}
class TriangleTesterTest {
    @org.junit.jupiter.api.Test
    public void publicTests() {
        assertEquals(TriangleTester.isTriangle(1,2,2), true);
        assertEquals(TriangleTester.isTriangle(7,2,2), false);
    }
}