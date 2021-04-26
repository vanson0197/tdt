package com.company;

import sun.applet.Main;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right){
        int mid = left+ (right -left)/2;
        int pivot = arr[mid];
        int i = left;
        int j = right;
        while(i <= j) {
            while (arr[i] < pivot){
                i++;
            }
            while( arr[j] > pivot){
                j--;
            }
            if(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if(left < j){
            quickSort(arr, left, j);
        }
        if(right > i){
            quickSort(arr, i, right);
        }

    }
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6,7,4,5,3,8,10} ;
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
