package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberCounterTest {
    NumberCounter object;

    @Before
    public void setUp() {
        object = new NumberCounter();
    }

    @After
    public void tearDown() {
        object = null;
    }

    //Random test
    @Test
    public void givenStringInputShouldReturnMap() {

        Map<String,Integer> output=new HashMap<>();
        output = object.countNumberOfOccurences("one one -one___two,,three,one @three*one?two");
        assertEquals("{one=5, two=2, three=2}",output.toString());
    }

}