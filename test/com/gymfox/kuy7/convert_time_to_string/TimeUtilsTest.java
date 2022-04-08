package com.gymfox.kuy7.convert_time_to_string;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeUtilsTest {
    @Test
    public void shouldConvertCorrectly() throws Exception {
        assertEquals("1 1 1 1", TimeUtils.convertTime(90061));
        assertEquals("-1 -1 -1 -1", TimeUtils.convertTime(-90061));
    }
}