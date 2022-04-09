package com.gymfox;

import java.time.LocalDate;

public class lab {
    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(1993, 12, 13);

        System.out.println(myBirthday.getDayOfWeek() + ", " + myBirthday.getDayOfYear() + ", " + myBirthday.getMonth() + ", " + myBirthday.getYear());

        LocalDate dateNow = LocalDate.now();

        System.out.println(String.format("Date is now: %s.\nCurrent date was after my birthday? - %b\nCurrent date was before my birthday? - %b", dateNow, dateNow.isAfter(myBirthday), dateNow.isBefore(myBirthday)));
        System.out.println("Added new line");
    }
}