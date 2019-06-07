package com.gymfox.kuy7.predict_your_age;

public class Solution {

    /*
    *public static int predictAge(int ... ages) {
         return (int) Math.sqrt(of(ages).map(a->a*a).sum())/2;
     }
    */

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int[] ages = {age1, age2, age3, age4, age5, age6, age7, age8};
        int sums = 0;

        for (int i = 0; i < ages.length; i++) {
            ages[i] *= ages[i];
            sums += ages[i];
        }
        return ((int) Math.sqrt(sums))/2;
    }
}
/*
* Take a list of ages when each of your great-grandparent died.
Multiply each number by itself.
Add them all together.
Take the square root of the result.
Divide by two.
*/