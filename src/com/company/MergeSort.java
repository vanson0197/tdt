package com.company;


public class MergeSort {
    public static void Merge(int arr[], int left, int mid, int right) {
        int x = mid - left + 1;
        int y = right - mid;
        int[] L = new int[x];
        int[] R = new int[y];
        for (int i = 0; i < x; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < y; j++) {
            R[j] = arr[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < x && j < y) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < x) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < y) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            Merge(arr, l, mid, r);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 9, 3, 4, 1, 2, 7};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }


}
