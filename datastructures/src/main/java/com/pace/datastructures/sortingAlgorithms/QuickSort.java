package com.pace.datastructures.sortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    static void sort(int[] array, int low, int high){
        if(low>high)
            return;
        int mid = low+(high-low)/2;
        int pivot = array[mid];
        int i = low;
        int j=high;
        while(i<=j){
            while(array[i]<pivot)
                i++;
            while(array[j]>pivot)
                j--;
            if (i<=j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low<j)
            sort(array,low,j);
        if (high>i)
            sort(array, i, high);
    }

    public static void main(String[] args) {
        int [] array = {5,2,8,3,5,0,1};
        System.out.println("Before sort : "+ Arrays.toString(array));
        sort(array,0, array.length-1);
        System.out.println("After sort : "+Arrays.toString(array));
    }
}
