package com.gymfox.kuy8.switch_it_up;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static Map<Integer, String> numbers = new HashMap<Integer, String>() {{
        put(1, "One");
        put(2, "Two");
        put(3, "Three");
        put(4, "Four");
        put(5, "Five");
        put(6, "Six");
        put(7, "Seven");
        put(8, "Eight");
        put(9, "Nine");
    }};

    public static String switchItUp(int number) {
        return numbers.get(number);
    }
}