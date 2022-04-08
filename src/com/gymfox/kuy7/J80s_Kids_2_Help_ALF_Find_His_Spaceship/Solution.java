package com.gymfox.kuy7.J80s_Kids_2_Help_ALF_Find_His_Spaceship;

public class Solution {
    public static String findSpaceship(String map) {
        String[] seperatingMap = map.split("\n");
        for (int i = 0; i < seperatingMap.length; i++) {
            if (seperatingMap[i].contains("X")) {
                return String.format("[%d, %d]", seperatingMap[i].indexOf("X"), seperatingMap.length - i - 1);
            }
        }

        return "Spaceship lost forever.";
    }
}
