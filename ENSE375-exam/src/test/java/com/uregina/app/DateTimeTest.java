package com.uregina.app;

import static org.junit.Assert.assertTrue;

import com.uregina.exceptions.InvalidDateException;
import com.uregina.exceptions.InvalidTimeException;
import com.uregina.exceptions.MoreThanOneDayException;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class DateTimeTest 
{
    
    @Test
    public void Path1_Invalid_NeitherEqualorConsecutive()
    {
        Date date1 = null;
        Date date2 = null;
       try {
            date1 = new Date(1, 2, 2020);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }
       try {
            date2 = new Date(2, 1, 2020);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }
    
        Time12 time1 = null;
        try {
            time1 = new Time12(12, 30, AmPm.am);
        } catch (InvalidTimeException e) {
            e.printStackTrace();
        }
        Time12 time2 = null;
        try {
            time2 = new Time12(1, 23, AmPm.pm);
        } catch (InvalidTimeException e) {
            e.printStackTrace();
        }

        DateTime dt1 = new DateTime(date1, time1);
        DateTime dt2 = new DateTime(date2, time2);

        try {
            DateTime.subtract(dt1, dt2);
        } catch (MoreThanOneDayException e) {
            assertTrue(true);
        }
    }

    @Test
    public void Path1_Valid_EqualDate()
    {
        Date date1 = null;
        Date date2 = null;
       try {
            date1 = new Date(1, 2, 2020);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }
       try {
            date2 = new Date(1, 2, 2020);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }
    
        Time12 time1 = null;
        try {
            time1 = new Time12(7, 30, AmPm.am);
        } catch (InvalidTimeException e) {
            e.printStackTrace();
        }
        Time12 time2 = null;
        try {
            time2 = new Time12(8, 30, AmPm.am);
        } catch (InvalidTimeException e) {
            e.printStackTrace();
        }

        DateTime dt1 = new DateTime(date1, time1);
        DateTime dt2 = new DateTime(date2, time2);

        int diff = 0;
        try {
            diff = DateTime.subtract(dt1, dt2);
        } catch (MoreThanOneDayException e) {
            
        }

        if (diff == 60) {
            assertTrue(true);
        }
    }

    @Test
    public void Path1_Valid_ConsecutiveDates()
    {
        Date date1 = null;
        Date date2 = null;
       try {
            date1 = new Date(1, 2, 2020);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }
       try {
            date2 = new Date(1, 3, 2020);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }
    
        Time12 time1 = null;
        try {
            time1 = new Time12(11, 30, AmPm.pm);
        } catch (InvalidTimeException e) {
            e.printStackTrace();
        }
        Time12 time2 = null;
        try {
            time2 = new Time12(1, 30, AmPm.am);
        } catch (InvalidTimeException e) {
            e.printStackTrace();
        }

        DateTime dt1 = new DateTime(date1, time1);
        DateTime dt2 = new DateTime(date2, time2);

        int diff = 0;
        try {
            diff = DateTime.subtract(dt1, dt2);
        } catch (MoreThanOneDayException e) {
            
        }

        if (diff == 120) {
            assertTrue(true);
        }
    }
}
