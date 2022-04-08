package com.gymfox.kuy6.fruit_machine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(100,
                Solution.fruit(new String[][]{
                        new String[]{"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"},
                        new String[]{"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"},
                        new String[]{"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"}},
                        new int[]{0, 0, 0}));

        assertEquals(0,
                Solution.fruit(new String[][]{
                        new String[]{"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"},
                        new String[]{"Bar", "Wild", "Queen", "Bell", "King", "Seven", "Cherry", "Jack", "Star", "Shell"},
                        new String[]{"Bell", "King", "Wild", "Bar", "Seven", "Jack", "Shell", "Cherry", "Queen", "Star"}},
                        new int[]{5, 4, 3}));

        assertEquals(
                3,
                Solution.fruit(new String[][]{
                        new String[]{"King", "Cherry", "Bar", "Jack", "Seven", "Queen", "Star", "Shell", "Bell", "Wild"},
                        new String[]{"Bell", "Seven", "Jack", "Queen", "Bar", "Star", "Shell", "Wild", "Cherry", "King"},
                        new String[]{"Wild", "King", "Queen", "Seven", "Star", "Bar", "Shell", "Cherry", "Jack", "Bell"}},
                        new int[]{0, 0, 1}));

        assertEquals(
                6,
                Solution.fruit(new String[][]{
                        new String[]{"King", "Jack", "Wild", "Bell", "Star", "Seven", "Queen", "Cherry", "Shell", "Bar"},
                        new String[]{"Star", "Bar", "Jack", "Seven", "Queen", "Wild", "King", "Bell", "Cherry", "Shell"},
                        new String[]{"King", "Bell", "Jack", "Shell", "Star", "Cherry", "Queen", "Bar", "Wild", "Seven"}},
                        new int[]{0, 5, 0}));
    }
}