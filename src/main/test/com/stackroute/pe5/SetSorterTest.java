package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetSorterTest {

    SetSorter object;

    @Before
    public void setUp() {
        object = new SetSorter();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void setSorter() {
        String result = SetSorter.setSorter("D C B A").toString();
        assertEquals("[A, B, C, D]",result);
    }
    @Test
    public void setSorter1() {
        String result = SetSorter.setSorter("Har Har Mahadev").toString();
        assertNotEquals("[A, B, C, D]",result);
    }
    @Test
    public void setSorter2() {
        String result = SetSorter.setSorter("").toString();
        assertEquals("[]",result);
    }
}