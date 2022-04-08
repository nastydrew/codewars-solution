package com.gymfox.kuy7.to_leet_speak;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static java.lang.String.valueOf;

public class Kata {
    private static final Map<String, String> dictionary = new HashMap<>() {{
        put("A", "@");
        put("B", "8");
        put("C", "(");
        put("D", "D");
        put("E", "3");
        put("F", "F");
        put("G", "6");
        put("H", "#");
        put("I", "!");
        put("J", "J");
        put("K", "K");
        put("L", "1");
        put("M", "M");
        put("N", "N");
        put("O", "0");
        put("P", "P");
        put("Q", "Q");
        put("R", "R");
        put("S", "$");
        put("T", "7");
        put("U", "U");
        put("V", "V");
        put("W", "W");
        put("X", "X");
        put("Y", "Y");
        put("Z", "2");
    }};

    static String toLeetSpeak(final String speak) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < speak.length(); i++) {
            String currentLetter = valueOf(speak.charAt(i)).toUpperCase(Locale.ROOT);
            result.append(dictionary.getOrDefault(currentLetter, currentLetter));
        }

        return result.toString();
    }
}
