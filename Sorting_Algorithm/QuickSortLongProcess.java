package Sorting_Algorithm;

import java.util.Arrays;

public class QuickSortLongProcess {

    public static void main(String[] args) {
        int[] arr = {90,28,45};

        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr) {

        if (arr == null || arr.length == 0 )
            return;

        quicksort(arr, 0, arr.length-1);
    }

    public static void quicksort(int[] arr, int left, int right) {

        if (left < right) {

            int pivot = partition(arr, left, right);
            quicksort(arr, left, pivot-1);
            quicksort(arr, pivot+1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {

        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] >= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }

    public static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
