package com.gymfox.ARCHIVE.basicOperation;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
public class BasicOperation {
    public static Integer basicMath(String op, int v1, int v2) {
        return
        op == "+" ? v1 + v2 :
                op == "-" ? v1 - v2 :
                        op == "*" ? v1 * v2 :
                                op == "/" ? v1 / v2 : 0;
    }
}

class SolutionTest
{
    BasicOperation basicOps = new BasicOperation();

    @Test
    public void testBasics()
    {
        System.out.println("Basic Tests");
        assertThat(basicOps.basicMath("+", 4, 7), is(11));
        assertThat(basicOps.basicMath("-", 15, 18), is(-3));
        assertThat(basicOps.basicMath("*", 5, 5), is(25));
        assertThat(basicOps.basicMath("/", 49, 7), is(7));
    }
}