package com.uregina.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Time24Test 
{
    
    @Test
    public void Path1_Time12PM()
    {
        int hour = 12;
        int minutes = 30;
        AmPm amPm = AmPm.pm;

        Time24 time = Time24.toTime24(hour, minutes, amPm);

        if (time.hours == 12 && time.minutes == 30) {
            assertTrue(true);
        }
    }

    @Test
    public void Path2_TimeBetween1and11PM()
    {
        int hour = 2;
        int minutes = 30;
        AmPm amPm = AmPm.pm;

        Time24 time = Time24.toTime24(hour, minutes, amPm);

        if (time.hours == 14 && time.minutes == 30) {
            assertTrue(true);
        }
    }

    @Test
    public void Path3_12AM()
    {
        int hour = 12;
        int minutes = 30;
        AmPm amPm = AmPm.am;

        Time24 time = Time24.toTime24(hour, minutes, amPm);

        if (time.hours == 0 && time.minutes == 30) {
            assertTrue(true);
        }
    }

    @Test
    public void Path4_TimeBetween1and11AM()
    {
        int hour = 2;
        int minutes = 30;
        AmPm amPm = AmPm.am;

        Time24 time = Time24.toTime24(hour, minutes, amPm);

        if (time.hours == 2 && time.minutes == 30) {
            assertTrue(true);
        }
    }
}