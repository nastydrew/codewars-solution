package com.gymfox.kuy5.pete_the_baker;

import java.util.Map;

public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int result = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
            int availableAmount = available.getOrDefault(entry.getKey(), 0);
            result = Math.min(result, availableAmount / entry.getValue());
        }
        return result;
    }
}
