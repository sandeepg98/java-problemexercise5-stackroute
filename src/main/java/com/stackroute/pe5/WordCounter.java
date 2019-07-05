package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static String countWordOccurences (String[] input)
    {
        Map<String,Integer> numberCount = new HashMap<>();
        Map<String,Boolean> numberCheck = new HashMap<>();

        int i;

        //count occurence of each word
        for(i=0;i<input.length;i++) {

            numberCount.put(input[i], (numberCount.get(input[i]) == null) ? 1 : numberCount.get(input[i]) + 1);
            int k=numberCount.get(input[i]);

            //If number of occurences is more than 1, set true
            numberCheck.put(input[i], (k>1));

        }

        return numberCheck.toString();
    }
}
