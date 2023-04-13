package com.pace.datastructures.examples;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String [] colors = new String[5];
        colors[0] = "Blue";
        colors[1] = "Red";
        colors[2] = "White";

        //Array element reinitialization
        System.out.println(Arrays.toString(colors));
        colors[1] = "Gold";
        System.out.println();
        System.out.println(Arrays.toString(colors));

        //Inline initialization of array
        System.out.println();
        int [] numbers = {10,20,30};
        System.out.println(Arrays.toString(numbers));

        //Access an array in reverse order
        System.out.println();
        for (int i = 0; i < colors.length; i++){
            System.out.print(colors[i]+" | ");
        }

        //Using for loop
        System.out.println("\n");
        for (int i = colors.length - 1; i >= 0; i--){
            System.out.print(colors[i]+" | ");
        }

        //Using for each loop
        System.out.println("\n");
        for ( String color : colors){
            System.out.print(color+" | ");
        }

        //Using streams
        System.out.println("\n");
        Arrays.stream(colors).forEach(System.out::println);

    }
}
