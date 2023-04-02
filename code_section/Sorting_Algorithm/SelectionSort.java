package Sorting_Algorithm;

import java.util.Arrays;

/*
    Algorithm :

    1. Find the minimum element's index in the array.
    2. Swap the minimum element with the first element
    3. first element i sorted repeat the process from seocnd element - repeat 1 - 2.


 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {38, 27, 3, 8, 9, 82, 43, 10};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        insertionsort(arr);
    }

    public static void insertionsort(int[] arr) {

        for (int i=0;i<arr.length;i++) {
            int min_ind = i;
            for (int j = i+1; j< arr.length;j++) {
                if (arr[min_ind] > arr[j]) {
                    min_ind = j;
                }
            }

            int temp =  arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;
        }


    }
}
