package Sorting_Algorithm;

import java.util.Arrays;

public class QuickSortAsc {

    public static void main(String[] args) {
        int[] arr = {90,28,45};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return; // empty array or null input
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right); // get pivot index
            quickSort(arr, left, pivotIndex - 1); // sort left subarray
            quickSort(arr, pivotIndex+1, right); // sort right subarray
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right]; // choose last element as pivot
        int i = left - 1; // initialize i pointer to one less than left
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j); // swap arr[i] and arr[j]
            }
        }
        swap(arr, i + 1, right); // swap pivot with arr[i+1]
        return i + 1; // return pivot index
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
