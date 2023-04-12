package com.pace.datastructures.examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List colors = new ArrayList();//Can add any type of data
        colors.add("Blue");
        colors.add("White");
        colors.add(2);
        colors.add(new Object());

        System.out.println(colors);

        //To restrict the list to a specific type
        List<String> names = new ArrayList<>();
        names.add("Vishnu");
        names.add("Harsha");
        names.add("Radha");
//        names.add(2); Not possible
        System.out.println(names);
        System.out.println("List size : "+ names.size());
        System.out.println("The list has name vinay : "+names.contains("Vinay"));

        //Print the list using for each loop
        for (String name : names){
            System.out.print(name +" | ");
        }

        names.forEach(System.out::println);

        //print using basic for loop
        for (int i=0;i<names.size();i++){
            System.out.print(names.get(i)+" | ");
        }


        //Using Linked list
        List<String> birds = new LinkedList<>();
        birds.add("Pigeon");
        birds.add("Parrot");
        birds.add("Peacock");
//        names.add(2); Not possible
        System.out.println(birds);
        System.out.println("List size : "+ birds.size());
        System.out.println("The list has Eagle : "+birds.contains("Eagle"));

        //Print the list using for each loop
        for (String bird : birds){
            System.out.print(bird +" | ");
        }

        names.forEach(System.out::println);

        //print using
        for (int i=0;i<birds.size();i++){
            System.out.print(birds.get(i)+" | ");
        }
        System.out.println();


        //Creating immutable list
        List<String> animalsUnmodifiable = List.of(
                "Lion", "Tiger","Cheetah"
        );
        System.out.println(animalsUnmodifiable);
//        animalsUnmodifiable.add("Cheetah"); Cannot add an element for an immutable list
    }
}
