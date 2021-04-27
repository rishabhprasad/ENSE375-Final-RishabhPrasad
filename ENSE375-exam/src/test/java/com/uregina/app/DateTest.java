package com.uregina.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.uregina.exceptions.InvalidDateException;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class DateTest 
{
    
    @Test
    public void D1Day1Month5Year1990_D2Day16Month1Year2020()
    {
        Date d1 = null;
        try {
            d1 = new Date(5,1,1990);
        } catch (InvalidDateException e1) {
            e1.printStackTrace();
        }

        Date d2 = null;
        try {
            d2 = new Date(1,16,2020);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }

        assertTrue(Date.lessThan(d1, d2));

    }


    @Test
    public void D1Day1Month7Year2020_D2Day16Month1Year1990()
    {
        Date d1 = null;
        try {
            d1 = new Date(7,1,2020);
        } catch (InvalidDateException e1) {
            e1.printStackTrace();
        }

        Date d2 = null;
        try {
            d2 = new Date(1,16,1990);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }

        assertFalse(Date.lessThan(d1, d2));

    }

    @Test
    public void D1Day16Month7Year1990_D2Day1Month7Year2020()
    {
        Date d1 = null;
        try {
            d1 = new Date(7,16,1990);
        } catch (InvalidDateException e1) {
            e1.printStackTrace();
        }

        Date d2 = null;
        try {
            d2 = new Date(7,1,2020);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }

        assertTrue(Date.lessThan(d1, d2));

    }
    
    @Test
    public void D1Day16Month1Year2020_D2Day1Month1Year1990()
    {
        Date d1 = null;
        try {
            d1 = new Date(1,16,2020);
        } catch (InvalidDateException e1) {
            e1.printStackTrace();
        }

        Date d2 = null;
        try {
            d2 = new Date(1,1,1990);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }

        assertFalse(Date.lessThan(d1, d2));

    }

    @Test
    public void D1Day16Month1Year2020_D2Day16Month1Year2020()
    {
        Date d1 = null;
        try {
            d1 = new Date(1,16,2020);
        } catch (InvalidDateException e1) {
            e1.printStackTrace();
        }

        Date d2 = null;
        try {
            d2 = new Date(1,16,2020);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }

        assertFalse(Date.lessThan(d1, d2));

    }
}

