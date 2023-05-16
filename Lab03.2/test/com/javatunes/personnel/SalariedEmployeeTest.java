package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {
    private SalariedEmployee emp;
    private SalariedEmployee emp2;
    //this is the object under test, called a fixture
    @Before
    public void setUp() {
        emp  = new SalariedEmployee("Mary", Date.valueOf("2020-10-10"), 1500.0);
        emp2 = new SalariedEmployee("Mary", Date.valueOf("2020-10-10"), 1500.0);
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHireDate_sameSalary() {
        emp2.setName("john Cena");
        assertNotEquals(emp,emp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_SameHireDate_differentSalary() {
        emp2.setSalary(2000.0);
        assertNotEquals(emp,emp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate_sameSalary() {
        emp2.setHireDate(Date.valueOf("2021-10-3"));
        assertNotEquals(emp,emp2);
    }

    @Test
    public void equals_shouldReturnTrue_allPropertiesSame() {
        assertEquals(emp, emp2);
    }

    @Test
    public void testPay() {
        System.out.println("Test Pay");
        assertEquals(1500, emp.getSalary(),001);
    }

    @Test
    public void testPayTaxes() {
        System.out.println("Test Pay Taxes");
        assertEquals(450,emp.payTaxes(),001);
    }
}