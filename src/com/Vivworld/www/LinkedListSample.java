package com.Vivworld.www;

import java.util.LinkedList;

public class LinkedListSample {
    public static void main(String[] args) {

        LinkedList<String> str = new LinkedList<String>();
        LinkedList<Integer> intrs = new LinkedList<Integer>();

        str.add("My Name: ");
        str.add("Vivek Ranjan ");
        str.add("This is linked list ");
        str.add("Example ");
        intrs.add(2);
        intrs.add(3);
        intrs.add(4);
        intrs.add(22);
        intrs.add(2);



              //System.out.println(str);


            //System.out.println(str.indexOf("Example "));
        System.out.println(intrs.indexOf(22));
        System.out.println(intrs);



    }
}
