package com.Vivworld.www;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueSample {
    public static void main(String[] args) {

        Queue <String> q = new PriorityQueue<>();
        q.add("Bat");
        q.add("vivek");
        q.add("Ranjan");
        q.add("Iota");

        System.out.println(q);
        System.out.println(q.peek());


    }
}
