package com.gymfox.kuy7.convert_time_to_string;

import java.util.concurrent.TimeUnit;

public class TimeUtils {
    private static final int secondsInDay = 86400;
    private static final int secondsInHour = 3600;
    private static final int secondsInMinutes = 60;
    private static final int oneSecond = 1;
    private static final int[] constantTimes = {secondsInDay, secondsInHour, secondsInMinutes, oneSecond};

    public static String convertTime(int timeDiff) {
        int[] convertedTime = new int[4];
        int inputTimeValue = timeDiff;
        boolean isPositive = true;

        if (inputTimeValue < 0) {
            inputTimeValue *= -1;
            isPositive = false;
        }

        int currentConstant = 0;

        while (inputTimeValue > 0) {
            if (inputTimeValue >= constantTimes[currentConstant]) {
                inputTimeValue -= constantTimes[currentConstant];
                convertedTime[currentConstant] += 1;
            } else {
                currentConstant += 1;
            }
        }

        if (!isPositive) {
            for (int i = 0; i < convertedTime.length; i++) {
                convertedTime[i] *= -1;
            }
        }

        return String.format("%d %d %d %d", convertedTime[0], convertedTime[1], convertedTime[2], convertedTime[3]);
//        return String.format("%d %d %d %d", timeDiff / secondsInDay, timeDiff % secondsInDay / secondsInHour, timeDiff % secondsInHour / secondsInMinutes, timeDiff % secondsInMinutes);
    }

    public static String convertTime2(int timeDiff) {
        return String.format("%d %d %d %d", timeDiff / secondsInDay, timeDiff % secondsInDay / secondsInHour, timeDiff % secondsInHour / secondsInMinutes, timeDiff % secondsInMinutes);
    }



    public static void main(String[] args) {
        System.out.println(timer(() -> convertTime(93784), 1000000));
        System.out.println(timer(() -> convertTime2(93784), 1000000));
        System.out.println(timer(() -> convertTime(1000), 1000000));
        System.out.println(timer(() -> convertTime2(93784), 1000000));
    }

    private static double timer(Runnable method, int methodCallCount) {
        double startTime = System.currentTimeMillis();

        for (int i = 0; i < methodCallCount; i++) {
            method.run();
        }

        return (System.currentTimeMillis() - startTime)/1000;
    }
}
