package com.uregina.app;

import static org.junit.Assert.assertTrue;

import com.uregina.exceptions.InvalidTimeException;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Time12Test 
{
    
    @Test
    public void T1Am_T2Am()
    {
        Time12 t1 = null;
        try {
            t1 = new Time12(5, 10, AmPm.am);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        Time12 t2 = null;
        try {
            t2 = new Time12(4, 20, AmPm.am);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        int minutes = Time12.subtract(t1, t2);

        if (minutes == 50) {
            assertTrue(true);
        }
    }

    @Test
    public void T1Am_T2Pm() throws InvalidTimeException
    {
        Time12 t1 = null;
        try {
            t1 = new Time12(4, 10, AmPm.am);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        Time12 t2 = null;
        try {
            t2 = new Time12(5, 20, AmPm.pm);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        
        int minutes = 0;
        minutes = Time12.subtract(t1, t2);

        if (minutes == -1) {
            assertTrue(true);
        }

    }

    @Test
    public void T1Am_T2Hoursbetween1and6()
    {
        Time12 t1 = null;
        try {
            t1 = new Time12(3, 30, AmPm.am);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        Time12 t2 = null;
        try {
            t2 = new Time12(2, 30, AmPm.am);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        int minutes = Time12.subtract(t1, t2);

        if (minutes == 60) {
            assertTrue(true);
        }
    }

    @Test
    public void T1Am_T2Hoursbetween7and12()
    {
        Time12 t1 = null;
        try {
            t1 = new Time12(3, 30, AmPm.am);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        Time12 t2 = null;
        try {
            t2 = new Time12(8, 30, AmPm.am);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        int minutes = Time12.subtract(t1, t2);

        if (minutes == -1) {
            assertTrue(true);
        }
    }

    @Test
    public void T1Am_T2Minsbetween0and30()
    {
        Time12 t1 = null;
        try {
            t1 = new Time12(3, 30, AmPm.am);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        Time12 t2 = null;
        try {
            t2 = new Time12(4, 30, AmPm.am);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        int minutes = Time12.subtract(t1, t2);

        if (minutes == 60) {
            assertTrue(true);
        }
    }

    @Test
    public void T1Am_T2Minsbetween31and59()
    {
        Time12 t1 = null;
        try {
            t1 = new Time12(3, 30, AmPm.am);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        Time12 t2 = null;
        try {
            t2 = new Time12(4, 31, AmPm.am);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        int minutes = Time12.subtract(t1, t2);

        if (minutes == 61) {
            assertTrue(true);
        }
    }

    @Test
    public void T1PM_T2PM()
    {
        Time12 t1 = null;
        try {
            t1 = new Time12(3, 30, AmPm.pm);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        Time12 t2 = null;
        try {
            t2 = new Time12(4, 30, AmPm.pm);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        int minutes = Time12.subtract(t1, t2);

        if (minutes == 60) {
            assertTrue(true);
        }
    }

    @Test
    public void T1PM_T2HoursBetween1and6()
    {
        Time12 t1 = null;
        try {
            t1 = new Time12(3, 30, AmPm.pm);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        Time12 t2 = null;
        try {
            t2 = new Time12(6, 30, AmPm.pm);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        int minutes = Time12.subtract(t1, t2);

        if (minutes == 180) {
            assertTrue(true);
        }
    }

    @Test
    public void T1PM_T2HoursBetween7and12()
    {
        Time12 t1 = null;
        try {
            t1 = new Time12(10, 30, AmPm.pm);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        Time12 t2 = null;
        try {
            t2 = new Time12(7, 30, AmPm.pm);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        int minutes = Time12.subtract(t1, t2);

        if (minutes == 180) {
            assertTrue(true);
        }
    }

    @Test
    public void T1PM_T2MinsBetween0and30()
    {
        Time12 t1 = null;
        try {
            t1 = new Time12(10, 10, AmPm.pm);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        Time12 t2 = null;
        try {
            t2 = new Time12(7, 30, AmPm.pm);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        int minutes = Time12.subtract(t1, t2);

        if (minutes == 160) {
            assertTrue(true);
        }
    }

    @Test
    public void T1PM_T2MinsBetween31and59()
    {
        Time12 t1 = null;
        try {
            t1 = new Time12(10, 10, AmPm.pm);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        Time12 t2 = null;
        try {
            t2 = new Time12(7, 31, AmPm.pm);
        } catch (InvalidTimeException e) {
            assertTrue(false);
        }

        int minutes = Time12.subtract(t1, t2);

        if (minutes == 159) {
            assertTrue(true);
        }
    }
}
