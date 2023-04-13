package com.pace.datastructures.searchingAlgorithms;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] array, int low, int high, int target)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target)
                return mid;

            if (array[mid] > target)
                return binarySearch(array, low, mid - 1, target);
            else
                return binarySearch(array, mid + 1, high, target);
        }
        return -1;
    }

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        System.out.print("Enter the array length : ");
        int length = scanner.nextInt();
        int [] array = new int[length];
        System.out.println("Enter the array elements : ");
        for (int i=0;i< array.length;i++){
            array[i]= scanner.nextInt();
        }
        do {
            System.out.print("Enter the target element : ");
            int target = scanner.nextInt();
            int result = binarySearch(array, 0, array.length-1 , target);
            if (result == -1)
                System.out.println("Target not present");
            else
                System.out.println("Target found at index : " + result);
        }while(condition);
    }
}
