package com.gymfox.kuy6.duplicate_encoder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    static String encode(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        Map<Character, Integer> charCounter = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (char aChar : chars) {
            charCounter.put(aChar, charCounter.getOrDefault(aChar, 0) + 1);
        }

        for (char aChar:chars) {
            if (charCounter.get(aChar) > 1) {
                result.append(")");
            } else {
                result.append("(");
            }
        }
        return result.toString();
    }
}
