package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class NumberCounter {

    public static Map<String, Integer> countNumberOfOccurences(String input){

        //Remove all special characters with space in input string and store in temp
        String temp = input.replaceAll("[^a-zA-Z]", " ").trim();

        //Create a String Array and store the words in it
        String[] tempArray = temp.split("\\s+");

        Map<String, Integer> numberCount = new HashMap<>();

        //Update the count of all words
        for(String s:tempArray){
            numberCount.put(s, (numberCount.get(s) == null) ? 1 : numberCount.get(s) + 1);
        }

        return numberCount;
    }
}
