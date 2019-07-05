package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

//a program to implement set interface which sorts the given randomly ordered names in ascending order. Convert the sorted set in to an array list

public class SetSorter {

    public static ArrayList<String> setSorter(String input) {

        String[] stringArray = input.split(" ");
        Set<String> treeSet= new TreeSet<>();
        for (String s:stringArray) {
            treeSet.add(s);
        }

        return new ArrayList<>(treeSet);
    }

}
