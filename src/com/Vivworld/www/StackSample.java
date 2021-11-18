package com.Vivworld.www;
import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {

        Stack <String> stck = new Stack<>();
        stck.push("Inserted by Push");
        stck.add("Inserted by Add");
        stck.add(0,"again inserted by add");
        stck.pop();
        System.out.println(stck);


    }
}
