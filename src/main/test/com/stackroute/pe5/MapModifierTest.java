package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapModifierTest {
    MapModifier object;

    @Before
    public void setUp() {
        object = new MapModifier();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void modify1() {

        HashMap<String,String> hashMap= new HashMap<String,String>();
        hashMap.put("val1", "java");
        hashMap.put("val2", "c++");
        String output = MapModifier.modify(hashMap).toString();
        assertEquals("{val2=java, val1= }", output);
    }

    @Test
    public void modify2() {

        HashMap<String,String> hashMap= new HashMap<String,String>();
        hashMap.put("val1", " ");
        hashMap.put("val2", " ");
        String output = MapModifier.modify(hashMap).toString();
        assertEquals("{val2= , val1= }", output);
    }
    @Test
    public void modify3() {

        HashMap<String,String> hashMap= new HashMap<String,String>();
        hashMap.put("val1","c++");
        hashMap.put("val2","c++");
        String output = MapModifier.modify(hashMap).toString();
        assertEquals("{val2=c++, val1= }", output);
    }
}