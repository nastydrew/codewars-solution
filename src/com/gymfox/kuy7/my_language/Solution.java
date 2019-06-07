package com.gymfox.kuy7.my_language;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        return results.entrySet().stream().filter(lang -> lang.getValue() >= 60).sorted((v1, v2) -> Integer.compare
                (v2.getValue(), v1.getValue())).map(lang -> lang.getKey()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        final Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 10);
        map1.put("Ruby", 80);
        map1.put("Python", 65);
        System.out.println(myLanguages(map1));

        List<Integer> test = new ArrayList<>();
    }
}
