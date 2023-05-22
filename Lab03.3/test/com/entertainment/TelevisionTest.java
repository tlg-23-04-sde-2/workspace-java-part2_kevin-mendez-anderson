package com.entertainment;

import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;

import static org.junit.Assert.*;

public class TelevisionTest {
    //business objects under test ( fixture)
    private Television tv;
    private Television tv1;
    private Television tv2;

    @Before
    public void setUp() throws Exception {
        tv = new Television();
        tv1 = new Television("Sony",50, DisplayType.LED);
        tv2 = new Television("Sony",50, DisplayType.LED);
    }

    @Test
    public void hashCode_shouldReturnSameValue_equalObjects() {
        assertEquals(tv1.hashCode(),tv2.hashCode());
    }

    @Test
    public void changeChannel_shouldStoreChannel_whenValid_loweBound()
    throws InvalidChannelException {
        tv.changeChannel(1);
        assertEquals(1,tv.getCurrentChannel());
    }

    @Test
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_upperBound() {
        try {
            tv.setVolume(101);
            fail("Should have thrown IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Invalid volume: 101. Allowed range: [0,100].", e.getMessage());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_lowerBound() {
        tv.setVolume(-1);
    }

    @Test
    public void setVolume_shouldStoreVolume_whenValid_upperBpound() {
        tv.setVolume(100);
        assertEquals(100,tv.getVolume());
    }

    @Test
    public void setVolume_shouldStoreVolume_whenValid_lowerBound() {
        tv.setVolume(0);
        assertEquals(0,tv.getVolume());
    }
}