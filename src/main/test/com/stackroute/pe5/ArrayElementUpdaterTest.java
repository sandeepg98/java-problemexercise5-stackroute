package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayElementUpdaterTest {

    ArrayElementUpdater object;

    @Before
    public void setUp() throws Exception
    {
        object = new ArrayElementUpdater();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    //To update given list
    @Test
    public void givenArrayListAndElementsShouldReturnUpdatedArrayList() {
        ArrayList<String> resultArray = new ArrayList<>();
        resultArray.add("Apple");
        resultArray.add("Grape");
        resultArray.add("Melon");
        resultArray.add("Berry");

        ArrayList<String> output = object.updateArrayElement(resultArray);

        assertEquals("[Kiwi, Grape, Mango, Berry]",output.toString());
    }

    //To clear given list
    @Test
    public void givenArrayListAndElementsShouldReturnEmptyArrayList() {
        ArrayList<String> resultArray = new ArrayList<>();
        resultArray.add("Apple");
        resultArray.add("Grape");
        resultArray.add("Melon");
        resultArray.add("Berry");

        ArrayList<String> output = object.emptyArray(resultArray);

        assertEquals("[]",output.toString());
    }
}