package com.gymfox.education.codewars.fruitguy;

public class FruitGuy {
    public static String[] removeRotten(String[] fruitBasket) {
        for (int i = 0; i < fruitBasket.length; i++) {
            fruitBasket[i] = fruitBasket[i].replaceAll("rotten", "").toLowerCase();
        }

        return fruitBasket;
    }

    public static void main(String[] args) {
        String[] rotten = new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"};
        System.out.println(removeRotten(rotten));
    }
}

