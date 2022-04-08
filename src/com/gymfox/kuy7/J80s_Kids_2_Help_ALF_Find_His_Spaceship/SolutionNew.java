package com.gymfox.kuy7.J80s_Kids_2_Help_ALF_Find_His_Spaceship;

public class SolutionNew {
    public static String findSpaceship(String map) {
        String[] separatingString = map.split("\n");

        for (int i = 0; i < separatingString.length; i++) {
            if (separatingString[i].contains("X")) {
                return String.format("[%d, %d]", separatingString[i].indexOf("X"), separatingString.length - 1 - i);
            }
        }

        return "Spaceship lost forever.";
    }
}
