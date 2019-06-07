package com.gymfox.ARCHIVE.leet;

import java.util.HashMap;
import java.util.Map;

public class Leet {
    static Map<Character, Character>alphabet = new HashMap<>();

        public static void initAlphabet() {
            alphabet.put('A', '@');
            alphabet.put('B', '8');
            alphabet.put('C', '(');
            alphabet.put('E', '3');
            alphabet.put('G', '6');
            alphabet.put('H', '#');
            alphabet.put('I', '!');
            alphabet.put('L', '1');
            alphabet.put('O', '0');
            alphabet.put('S', '$');
            alphabet.put('T', '7');
            alphabet.put('Z', '2');
        }

    static String toLeetSpeak(String speak) {
        StringBuilder newSpeak = new StringBuilder();

        initAlphabet();

        for ( Character chars : speak.toUpperCase().toCharArray() ) {
            newSpeak.append(alphabet.getOrDefault(chars,chars));
        }

        return newSpeak.toString();
    }

    public static void main(String[] args) {
        String word = "hello";
        System.out.println(toLeetSpeak(word));
    }
}