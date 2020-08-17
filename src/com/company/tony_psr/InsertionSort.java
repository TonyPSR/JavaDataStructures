package com.company.tony_psr;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){

        for(int i=1; i< arr.length; i++){
            int card = arr[i];
            int cardIndex = i;

            while(cardIndex >= 1 && card < arr[cardIndex-1]){
                arr[cardIndex] = arr[cardIndex-1];
                cardIndex--;
            }

            arr[cardIndex] = card;

        }

    }

    public static void main(String[] args) {
        int[] arr = {6, 5,4,3,2,1, 3,45,5,355,65,43,67};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
