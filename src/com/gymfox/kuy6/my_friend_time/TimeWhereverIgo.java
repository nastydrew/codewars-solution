package com.gymfox.kuy6.my_friend_time;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeWhereverIgo {
    private final static String dateTimeFormat = "dd-MM-yyyy HH:mm";
    // 27-03-2021 19:41", Europe/Warsaw, Africa/Asmera
    // 27-03-2021 21:41
    public static String getFriendDateAndTime(String myTime, String myZone, String friendZone) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return LocalDateTime
                .parse(myTime, formatter)
                .atZone(ZoneId.of(myZone))
                .withZoneSameInstant(ZoneId.of(friendZone))
                .format(formatter);
    }


    public static void main(String[] args) throws ParseException {
        System.out.println(getFriendDateAndTime("27-03-2021 19:41", "Europe/Warsaw", "Africa/Asmera"));
    }
}

