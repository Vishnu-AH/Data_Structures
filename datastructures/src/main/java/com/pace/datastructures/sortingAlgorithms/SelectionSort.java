package com.pace.datastructures.sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] numbers = {65,25,12,22,11};
        sort(numbers);
        System.out.println("Sorted Array : "+Arrays.toString(numbers));
    }
    static void sort(int[] array){
        System.out.println("Unsorted array : "+ Arrays.toString(array));
        for(int i=0;i< array.length-1;i++){
            int min_index = i;
            for (int j=i+1;j< array.length;j++){
                if(array[min_index]>array[j])
                    min_index = j;
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }
}
