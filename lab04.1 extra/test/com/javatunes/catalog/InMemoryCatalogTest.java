package com.javatunes.catalog;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {
    //object under test - fixture
    private InMemoryCatalog catalog;

    @Before
    public void setUp() {
        catalog = new InMemoryCatalog();
    }

    @Test
    public void testGetAll() {

    }

    @Test
    public void TestSize() {
    assertEquals(18, catalog.size());
    }

    @Test
    public void FindByCategory_shouldReturnNull_categoryFound() {
        Collection<MusicItem> nullItems = catalog.findByCategory(MusicCategory.JAZZ);
        for (MusicItem item: nullItems) {
            assertNull(item.getMusicCategory());
        }
    }

    @Test
    public void FindByCategory_shouldReturnPopulatedCollection_categoryFound() {
        Collection<MusicItem> popItems = catalog.findByCategory(MusicCategory.POP);
        for (MusicItem item: popItems) {
            assertEquals(MusicCategory.POP, item.getMusicCategory());
        }
    }

    @Test
    public void FindById_shouldReturnNull_idNotFound() {
        MusicItem item = catalog.findById(19L);
        assertNull(item);
    }

    @Test
    public void findByID_shouldReturnMusicItemWithThat_idFound() {
        MusicItem item = catalog.findById(6l);
        assertEquals(6l, item.getId().longValue());
    }
}