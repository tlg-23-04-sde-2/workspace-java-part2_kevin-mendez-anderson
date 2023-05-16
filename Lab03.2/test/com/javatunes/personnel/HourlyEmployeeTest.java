package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {
    private HourlyEmployee emp;

    @Before
    public void setUp() throws Exception {
        emp = new HourlyEmployee("Gio", Date.valueOf("2000-12-11"),25.0,30.0);
    }

    @Test
    public void testPay() {
        System.out.println("test pay");
        assertEquals(750, emp.pay(),001);
    }

    @Test
    public void testPayTaxes() {
        System.out.println("test pay taxes");
        assertEquals(187.5,emp.payTaxes(),001);
    }
}