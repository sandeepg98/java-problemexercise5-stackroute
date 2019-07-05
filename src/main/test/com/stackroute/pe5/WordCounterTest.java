package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCounterTest {

    WordCounter object;

    @Before
    public void setUp() {
        object = new WordCounter();
    }

    @After
    public void tearDown() {
        object = null;
    }

    //Random Test
    @Test
    public void givenStringArrayInputShouldReturnHashMap()
    {
        String output = object.countWordOccurences(new String[]{"a","b","a","c","a","b","d"});
        assertEquals("{a=true, b=true, c=false, d=false}", output);
    }
}