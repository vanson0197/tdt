package com.company;

public class BinarySearch {
    public static int binarySearch(int[] arr, int left, int right, int a) {
        if (right >= left) {
            int mid = (right + left) / 2;
            if (arr[mid] == a) {
                return mid;
            } else if (arr[mid] > a) {
                return binarySearch(arr, left, mid - 1, a);
            } else
                return binarySearch(arr, mid + 1, right, a);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 9, 10, 15, 20};
        int n = arr.length;
        int result = binarySearch(arr, 0, n - 1, 15);
        System.out.println(result);
    }


}
