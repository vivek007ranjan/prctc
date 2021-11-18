package com.Vivworld.www;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
    public static void main(String[] args) {

        List <Integer> intLst = new ArrayList<>(5);

        System.out.println(intLst.size());
        intLst.add(5);
        intLst.add(1, 23);
        intLst.add(2,10);


        System.out.println(intLst);
        System.out.println(intLst.toString());

    }
}
