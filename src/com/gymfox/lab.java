package com.gymfox;

import java.time.LocalDate;

public class lab {
    public static void main(String[] args) {
//        LocalDate myBirthday = LocalDate.of(1993, 12, 13);
//
//        System.out.println(myBirthday.getDayOfWeek() + ", " + myBirthday.getDayOfYear() + ", " + myBirthday.getMonth() + ", " + myBirthday.getYear());
//
//        LocalDate dateNow = LocalDate.now();
//
//        System.out.println(String.format("Date is now: %s.\nCurrent date was after my birthday? - %b\nCurrent date was before my birthday? - %b", dateNow, dateNow.isAfter(myBirthday), dateNow.isBefore(myBirthday)));

        float[] f1,f2;
        f1 = new float[10];
        f2 = f1;
        System.out.println("f2[0] = " + f2[0]);
    }
}

class Mixer {
    Mixer m1;

    Mixer() {}

    Mixer(Mixer mixer) {
        m1 = mixer;
    }

    void go() {
        System.out.print("hi ");
    }

    public static void main(String[] args) {
        Mixer m2 = new Mixer();
        Mixer m3 = new Mixer(m2);
        m3.go();
        Mixer m4 = m3.m1;
        m4.go();
        Mixer m5 = m2.m1;
        m5.go();
    }
}