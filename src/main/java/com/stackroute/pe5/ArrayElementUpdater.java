package com.stackroute.pe5;

import java.util.ArrayList;

public class ArrayElementUpdater {

    public static ArrayList<String> updateArrayElement (ArrayList<String> input){

        //finding the index of element and replace it
        input.set(input.indexOf("Apple"),"Kiwi");
        input.set(input.indexOf("Melon"),"Mango");

        return input;
    }

    public static ArrayList<String> emptyArray(ArrayList<String> input){

        //Clear the ArrayList
        input.clear();

        return input;
    }
}
