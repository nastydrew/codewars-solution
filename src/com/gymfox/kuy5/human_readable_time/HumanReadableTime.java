package com.gymfox.kuy5.human_readable_time;

public class HumanReadableTime {
    private static final int secondsInHour = 3600;
    private static final int secondsInMinutes = 60;

    public static String makeReadable(int seconds) {
        return String.format("%02d:%02d:%02d", seconds/secondsInHour, (seconds % secondsInHour)/secondsInMinutes, seconds % secondsInMinutes);
    }

    public static void main(String[] args) {
        int seconds = 3661;
        System.out.println("hours: " + seconds / secondsInHour);
        System.out.println("minutes: " + (seconds % secondsInHour)/secondsInMinutes);
        System.out.println("seconds: " + seconds % secondsInMinutes);
    }
}

/*
Години = seconds / 3600

Хвилини = (seconds % 3600) / 60

Секунди = seconds % 60
 */