package com.pace.datastructures.sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    static void sort(int [] array){
        for(int i=1;i< array.length;i++){
            int current = array[i];
            int j=i-1;
            while(j>=0 && array[j]>current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {4,2,0,8,3,4,6,1};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
