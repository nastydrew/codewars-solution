package com.gymfox.kuy5.simple_pig_latin;

public class PigLatin {
    public static String pigIt(String str) {
        String[] inputStr = str.split("\\s+");
        StringBuilder out = new StringBuilder();

        if (str.length() > 0) {
            for (String word : inputStr) {
                String punctuation = "";

                if (word.matches(".*[.,!?;]$")) {
                    punctuation = word.substring(word.length() - 1);
                    word = word.substring(0, word.length() - 1);
                }
                if (word.length() >= 1) {
                    out.append(word.substring(1)).append(word.charAt(0)).append("ay");
                }
                out.append(punctuation).append(" ");
            }
        }

        return out.toString().trim();
    }
}
