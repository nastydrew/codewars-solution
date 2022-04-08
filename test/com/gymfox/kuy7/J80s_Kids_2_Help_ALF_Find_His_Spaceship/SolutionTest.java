package com.gymfox.kuy7.J80s_Kids_2_Help_ALF_Find_His_Spaceship;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1x1Map() {
        assertEquals("[0, 0]", Solution.findSpaceship("X"));
    }

    @Test
    public void test2x2Map() {
        assertEquals("[0, 0]", Solution.findSpaceship("..\nX."));
        assertEquals("[1, 0]", Solution.findSpaceship("..\n.X"));
        assertEquals("[0, 1]", Solution.findSpaceship("X.\n.."));
        assertEquals("[1, 1]", Solution.findSpaceship(".X\n.."));
        assertEquals("Spaceship lost forever.", SolutionNew.findSpaceship("..\n.."));
    }

    @Test
    public void test1x1Map1() {
        assertEquals("[0, 0]", Solution.findSpaceship("X"));
    }

    @Test
    public void test2x2Map2() {
        assertEquals("[0, 0]", Solution.findSpaceship("..\nX."));
        assertEquals("[1, 0]", Solution.findSpaceship("..\n.X"));
        assertEquals("[0, 1]", Solution.findSpaceship("X.\n.."));
        assertEquals("[1, 1]", Solution.findSpaceship(".X\n.."));
        assertEquals("Spaceship lost forever.", SolutionNew.findSpaceship("..\n.."));
    }

    // Good luck!
    // Remember that space might not be square..
}