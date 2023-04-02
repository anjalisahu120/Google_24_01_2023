package Sorting_Algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {12, 11, 10, 3, 8, 19, 4};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        insertsort(arr);
    }

    public static void insertsort(int[] arr) {
        for (int i = 1; i<arr.length;i++) {
            int j = i -1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key) {
                      arr[j+1]  = arr[j];
                      j = j - 1;
            }
            arr[j+1] = key;
        }
    }
}
