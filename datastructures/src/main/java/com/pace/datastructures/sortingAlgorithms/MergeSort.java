package com.pace.datastructures.sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

    static void sort(int[] array){
        int inputLength = array.length;

        if(inputLength < 2)
            return;
        int mid = inputLength/2;
        int [] leftHalf = new int[mid];
        int [] rightHalf = new int[inputLength-mid];

        for (int i=0;i<mid;i++){
            leftHalf[i] = array[i];
        }
        for(int i = mid; i<inputLength;i++){
            rightHalf[i-mid] = array[i];
        }

        sort(leftHalf);
        sort(rightHalf);

        merge(array,leftHalf,rightHalf);
    }
    static void merge(int [] array, int [] leftHalf, int [] rightHalf){
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        int i=0, j=0, k=0;
        while(i<leftLength && j<rightLength){
            if (leftHalf[i] <= rightHalf[j]){
                array[k] = leftHalf[i];
                i++;
            }else{
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i<leftLength){
            array[k] = leftHalf[i];
            i++;k++;
        }
        while (j<rightLength){
            array[k] = rightHalf[j];
            j++;k++;
        }
    }

    public static void main(String[] args) {
        int [] array = {2,3,9,34,21,11,5,7,4};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
