package com.pace.datastructures.examples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //FIFO
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Vishnu",24));
        supermarket.add(new Person("Harsha",28));
        supermarket.add(new Person("Radha",49));

        System.out.println("Size of the queue : "+supermarket.size());
        System.out.println("First Person in the queue : "+supermarket.peek());
        System.out.println("Removed person : "+supermarket.poll());
        System.out.println("Size of the queue after deleting : "+supermarket.size());
        System.out.println("First Person in the queue after deleting : "+supermarket.peek());



    }

    static record Person(String name, int age){}
}
