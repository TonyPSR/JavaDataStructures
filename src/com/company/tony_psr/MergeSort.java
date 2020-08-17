package com.company.tony_psr;

import java.util.Arrays;

public class MergeSort {

    private static void merge(int[] arr, int start, int mid, int end){
//        if(arr[mid] < arr[mid+1]){
//            return;
//        }

        int leftPointer = start;
        int rightPointer = mid+1;
        int tempPointer = 0;

        int[] temp = new int[end-start+1];

        while(leftPointer <= mid && rightPointer <= end){
            if(arr[leftPointer] < arr[rightPointer]){
                temp[tempPointer] = arr[leftPointer];
                leftPointer++;
            } else{
                temp[tempPointer] = arr[rightPointer];
                rightPointer++;
            }

            tempPointer++;
        }

        while(leftPointer <= mid){
            temp[tempPointer] = arr[leftPointer];
            tempPointer++;
            leftPointer++;
        }

        while(rightPointer <= end){
            temp[tempPointer] = arr[rightPointer];
            tempPointer++;
            rightPointer++;
        }


        for(int i=0; i<temp.length; i++){
            arr[start+i] = temp[i];
        }

    }

    public static void mergeSort(int[] arr){
        mergeSort(arr, 0, arr.length-1);
    }

    private static void mergeSort(int[] arr, int start, int end){
        if(start < end){
            int mid = (start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            merge(arr, start, mid, end);
        }

    }


    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
