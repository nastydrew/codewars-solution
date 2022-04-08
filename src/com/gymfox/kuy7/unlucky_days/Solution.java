package com.gymfox.kuy7.unlucky_days;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.stream.IntStream;


public class Solution {
    static final LocalDate minDate = LocalDate.of(1000, 1, 1);
    static final LocalDate maxDate = LocalDate.of(3000, 1, 1);

    public static int unluckyDays(int year) {
        int result = 0;

        for ( int month = 1; month <= 12; month++ ) {

            if ( LocalDate.of(year, month, 13).getDayOfWeek() == DayOfWeek.FRIDAY )
                result += 1;
        }

        return result;
    }

    public static int unluckyDaysSecond(int year) {
        return IntStream.range(1, 13).map(i -> LocalDate.of(year, i, 13).getDayOfWeek().equals(DayOfWeek.FRIDAY) ? 1
                : 0).sum();
    }
}
