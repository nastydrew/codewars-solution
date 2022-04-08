package com.gymfox.kuy6.fruit_machine;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final int FIRST = 0;
    private static final int SECOND = 1;
    private static final int THIRD = 2;

    public static Map<String, Integer> fruitPoints = new HashMap<String, Integer>() {{
        put("Wild", 10);
        put("Star", 9);
        put("Bell", 8);
        put("Shell", 7);
        put("Seven", 6);
        put("Cherry", 5);
        put("Bar", 4);
        put("King", 3);
        put("Queen", 2);
        put("Jack", 1);
    }};

    public static int fruit(final String[][] reels, final int[] spins) {
        int points = 0;
        String[] inputReels = new String[reels.length];

        for ( int i = 0; i < reels.length; i++ ) {
            inputReels[i] = reels[i][spins[i]];

            System.out.printf("\t%s = %d\n", reels[i][spins[i]], fruitPoints.get(reels[i][spins[i]]));
        }

        System.out.printf("\tTotal points: %d\n", points);

        return 0; // Code here
    }

    public static void main(String[] args) {
        fruit(new String[][]{
                        new String[]{"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"},
                        new String[]{"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"},
                        new String[]{"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"}},
                new int[]{0, 0, 0});
//        fruit(new String[][]{
//                        new String[]{"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"},
//                        new String[]{"Bar", "Wild", "Queen", "Bell", "King", "Seven", "Cherry", "Jack", "Star", "Shell"},
//                        new String[]{"Bell", "King", "Wild", "Bar", "Seven", "Jack", "Shell", "Cherry", "Queen", "Star"}},
//                new int[]{5, 4, 3});
//        fruit(new String[][]{
//                        new String[]{"King", "Cherry", "Bar", "Jack", "Seven", "Queen", "Star", "Shell", "Bell", "Wild"},
//                        new String[]{"Bell", "Seven", "Jack", "Queen", "Bar", "Star", "Shell", "Wild", "Cherry", "King"},
//                        new String[]{"Wild", "King", "Queen", "Seven", "Star", "Bar", "Shell", "Cherry", "Jack", "Bell"}},
//                new int[]{0, 0, 1});
//        fruit(new String[][]{
//                        new String[]{"King", "Jack", "Wild", "Bell", "Star", "Seven", "Queen", "Cherry", "Shell", "Bar"},
//                        new String[]{"Star", "Bar", "Jack", "Seven", "Queen", "Wild", "King", "Bell", "Cherry", "Shell"},
//                        new String[]{"King", "Bell", "Jack", "Shell", "Star", "Cherry", "Queen", "Bar", "Wild", "Seven"}},
//                new int[]{0, 5, 0});
    }
}
