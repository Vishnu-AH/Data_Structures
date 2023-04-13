package com.pace.datastructures.examples;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<Person>();
        linkedList.add(new Person("Ram",24));
        linkedList.add(new Person("Arun",30));
        linkedList.addFirst(new Person("Dhruva",32));
        linkedList.addLast(new Person("Arjun",26));
        ListIterator<Person> personListIterator = linkedList.listIterator();

        //To iterate the linked list
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();

        //To iterate the linked list in reverse order
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }
    static record Person(String name, int age){}
}
