package com.pace.datastructures.sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

    static void swap(int [] array, int index1, int index2){
        int temp=array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static void sort(int[] array){
        for (int i=0;i<array.length;i++){
            boolean isSorted = true;
            for (int j = 1; j < array.length-i; j++){
                if(array[j]<array[j-1]) {
                    swap(array, j, j - 1);
                    isSorted=false;
                }
                if(isSorted)
                    return;
            }
        }
    }

    public static void main(String[] args) {
        int [] numbers = {3,2,7,3,4,21,8};
        System.out.println(Arrays.toString(numbers));
        BubbleSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
