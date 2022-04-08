package com.gymfox.kuy7.alternate_case;

public class Kata {
    static String alternateCase(final String string) {
        StringBuffer newString = new StringBuffer();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                newString.append(Character.toLowerCase(string.charAt(i)));
            } else {
                newString.append(Character.toUpperCase(string.charAt(i)));
            }
        }

        return newString.toString();
    }
}
