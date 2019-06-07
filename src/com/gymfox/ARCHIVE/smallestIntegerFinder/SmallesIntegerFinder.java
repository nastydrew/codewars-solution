package com.gymfox.education.codewars.smallestIntegerFinder;

import java.util.Arrays;

public class SmallesIntegerFinder {
    public static int findSmallestInt(int[] args) {
        //Отсортировать массив по возврастанию;
        //Первый элемент - самый меньший;
        Arrays.sort(args);
        return args[0];
    }
}
