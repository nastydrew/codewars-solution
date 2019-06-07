package com.gymfox.ARCHIVE.converttime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertTime {
    public static String convertTime(int timeDiff) {
//My solution
//        int enterTime = timeDiff;
//        int second = 0;
//        int minute = 0;
//        int hour = 0;
//        int day = 0;
//
//        if ( enterTime < 0 ) {
//            enterTime *= -1;
//        }
//
//        while ( enterTime > 0 ) {
//            if ( enterTime >= 86400 ) {
//                day += 1;
//                enterTime -= 86400;
//            } else if ( enterTime >= 3600 ) {
//                hour += 1;
//                enterTime -= 3600;
//            } else if ( enterTime >= 60 ) {
//                minute += 1;
//                enterTime -= 60;
//            } else {
//                second += enterTime;
//                enterTime = 0;
//            }
//        }
//
//
//        if ( timeDiff < 0 ) {
//            day *= -1;
//            hour *= -1;
//            minute *= -1;
//            second *= -1;
//        }
//
//        return day + " " + hour + " " + minute + " " + second;
//Other solution
        String format =  "%s %s %s %s";
        return String.format(format, timeDiff / 86400, timeDiff % 86400 / 3600, timeDiff % 3600 / 60, timeDiff % 60);
    }

    @Test
    public void shouldConvertCorrectly() throws Exception {
        assertEquals("1 1 1 1", ConvertTime.convertTime(90061));
        assertEquals("-1 -1 -1 -1", ConvertTime.convertTime(-90061));
        assertEquals("0 2 1 0", ConvertTime.convertTime(7260));
//        assertEquals("1 2 3 4", ConvertTime.convertTime(93784));
    }
}
