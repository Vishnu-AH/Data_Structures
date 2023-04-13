package com.pace.datastructures.searchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    static void search(int[] array, int value){
        int count=0;
        for (int i=0;i< array.length;i++){
            if (array[i] == value) {
                System.out.println("Target element found at index : "+i);
                count++;
            }
        }
        if(count==0)
            System.out.println("Target element not found..!!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length : ");
        int length = scanner.nextInt();
        int [] array = new int[length];
        System.out.println("Enter the array elements : ");
        for (int i=0;i< array.length;i++){
            array[i]= scanner.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(array));
        search(array,target);
    }
}
