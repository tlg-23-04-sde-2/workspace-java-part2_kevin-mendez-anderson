package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class TelevisionBrandChannelComparatorTest {
    // three objects tv1, tv2 and instance of agent
    private Television tv1;
    private Television tv2;
    private TelevisionBrandChannelComparator comparator;
    @Before
    public void setUp() {
        tv1 = new Television("Sony", 50);
        tv2 = new Television("Sony", 50);
        comparator = new TelevisionBrandChannelComparator();
    }

    @Test
    public void TelevisionBrandChannelComparator_shouldReturnTrue_whenBrandsEqual() {
        assertEquals(0,comparator.compare(tv1,tv2));
    }
}