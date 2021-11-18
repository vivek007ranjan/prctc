package com.Vivworld.www;

import java.util.HashSet;

public class HashSetSample {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<String>(4);

        str.add("This");
        str.add("is");
        str.add("Sparta");

        System.out.println( str);
    }
}
