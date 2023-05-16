package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class EmployeeTest {
    //business objects under test
    private Employee emp1;
    private Employee emp2;

    @Before
    public void setUp() {
        emp1 = new SalariedEmployee("john", Date.valueOf("2000-1-1"));
        emp2 = new SalariedEmployee("john", Date.valueOf("2000-1-1"));
    }

    @Test
    public void equals_shouldReturnFalse_sameHireDate_differentName() {
        emp2.setName("lola");
        assertNotEquals(emp1, emp2);
        assertFalse(emp1.equals(emp2));
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate() {
        emp2.setHireDate(Date.valueOf("2000-1-2"));
        assertNotEquals(emp1, emp2);
    }

    @Test
    public void equals_shouldReturnTrue_allPropertiesSame() {
        assertEquals(emp1, emp2);       //this does an equals() check for objects
        //assertTrue(emp1.equals(emp2));        //this is an alternative assertion
    }
}